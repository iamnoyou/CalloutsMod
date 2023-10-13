package com.github.iamnoyou.calloutsmod;

import cc.polyfrost.oneconfig.utils.Multithreading;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import cc.polyfrost.oneconfig.utils.hypixel.LocrawUtil;
import com.github.iamnoyou.calloutsmod.command.CalloutsCommand;
import com.github.iamnoyou.calloutsmod.config.CalloutsConfig;
import com.github.iamnoyou.calloutsmod.hud.CalloutHUD;
import com.github.iamnoyou.calloutsmod.util.CalloutCreatorUtil;
import com.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import com.github.iamnoyou.calloutsmod.util.PositionUtil;
import com.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import lombok.Getter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
@Mod(modid = CalloutsMod.MODID, name = CalloutsMod.MODNAME, version = CalloutsMod.MODVERSION)
public class CalloutsMod {

  public static final String MODID = "@MODID@";
  public static final String MODNAME = "@MODNAME@";
  public static final String MODVERSION = "@MODVER@";

  @Mod.Instance(MODID)
  public static @Getter CalloutsMod Instance;
  private final @Getter Logger logger = LogManager.getLogger(MODID);

  public static String mapName = "";
  Map<String, List<CalloutsUtil>> mapList = new HashMap<>();
  private @Getter CalloutsConfig config;
  private int tickCounter = 0;
  private @Getter String calloutText = "";
  private CalloutsUtil last = null;
  private boolean same = false;
  private CalloutsUtil callout;
  private boolean worldJustLoaded = false;

  @Mod.EventHandler
  public void onFMLInitialization(FMLInitializationEvent event) {
    this.mapList = CalloutCreatorUtil.getAllCallouts();
    config = new CalloutsConfig();
    registerCommands(new CalloutsCommand());
    registerEvents(this);
  }

  @SubscribeEvent
  public void onClientTick(TickEvent.ClientTickEvent event) {
    Multithreading.runAsync(() -> {
      try {
        if (HypixelUtils.INSTANCE.isHypixel() && !LocrawUtil.INSTANCE.isInGame()) {
          mapName = "N/A";
          CalloutHUD.status = false;
        }
        if (HypixelUtils.INSTANCE.isHypixel() && LocrawUtil.INSTANCE.isInGame()) {
          if (event.phase == Phase.START) {
            ++getInstance().tickCounter;
            if (getInstance().tickCounter >= 5) {
              getInstance().tickCounter = 0;
              try {
                Multithreading.schedule(() -> {
                  switch (LocrawUtil.INSTANCE.getLocrawInfo().getGameType()) {
                    case COPS_AND_CRIMS:
                    case REPLAY:
                      CalloutHUD.status = true;
                      break;
                  }
                  if (CalloutHUD.calloutTestMap.isEmpty()) {
                    mapName = Objects.requireNonNull(LocrawUtil.INSTANCE.getLocrawInfo()).getMapName();
                  } else {
                    mapName = CalloutHUD.calloutTestMap;
                  }
                }, 1, TimeUnit.SECONDS);
              } catch (NullPointerException e) {
                getInstance().getLogger().error(e);
              }
              Minecraft mc = Minecraft.getMinecraft();
              EntityPlayerSP player = mc.thePlayer;
              if (player == null) {
                return;
              }
              PositionUtil coords = getInstance().updateCoordinates();
              if (getInstance().mapList.containsKey(mapName)) {
                if (getInstance().last != null) {
                  getInstance().same = false;
                  RegionUtil[] lastRegions = getInstance().last.regions;
                  for (RegionUtil region : lastRegions) {
                    if (region.isInside(coords)) {
                      getInstance().callout = getInstance().last;
                      getInstance().same = true;
                    }
                  }
                }
                if (!getInstance().same) {
                  getInstance().callout = getInstance().findCallout(coords);
                }
                if (getInstance().callout != null) {
                  getInstance().calloutText = getInstance().callout.getName();
                }
              }
            }
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
  }

  @SubscribeEvent
  public void onWorldLoad(WorldEvent.Load event) {
    this.worldJustLoaded = true;
    calloutText = "";
  }

  @SubscribeEvent
  public void onTick(TickEvent.PlayerTickEvent event) {
    if (this.worldJustLoaded) {
      this.worldJustLoaded = false;
    }
  }

  public PositionUtil updateCoordinates() {
    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayerSP player = mc.thePlayer;
    double posX = player.posX;
    double posY = player.posY;
    double posZ = player.posZ;
    return new PositionUtil(posX, posY, posZ);
  }

  public CalloutsUtil findCallout(PositionUtil coords) {
    for (CalloutsUtil callout : this.mapList.get(mapName)) {
      RegionUtil[] regions = callout.regions;
      for (RegionUtil region : regions) {
        if (region.isInside(coords)) {
          this.last = callout;
          return callout;
        }
      }
    }
    return null;
  }

  private void registerEvents(Object... events) {
    for (Object event : events) {
      MinecraftForge.EVENT_BUS.register(event);
    }
  }

  private void registerCommands(Object... commands) {
    for (Object command : commands) {
      CommandManager.INSTANCE.registerCommand(command);
    }
  }

}