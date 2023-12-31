package io.github.iamnoyou.calloutsmod;

import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import cc.polyfrost.oneconfig.utils.hypixel.LocrawInfo;
import cc.polyfrost.oneconfig.utils.hypixel.LocrawUtil;
import io.github.iamnoyou.calloutsmod.command.CalloutsCommand;
import io.github.iamnoyou.calloutsmod.config.CalloutsConfig;
import io.github.iamnoyou.calloutsmod.hud.CalloutHUD;
import io.github.iamnoyou.calloutsmod.hud.RegionHighlighterHUD;
import io.github.iamnoyou.calloutsmod.util.CalloutCreatorUtil;
import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.HighlighterUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
    registerEvents(this, new HighlighterUtil());
  }

  @SubscribeEvent
  public void onClientTick(TickEvent.ClientTickEvent event) {
    processTick(event);
  }

  private void processTick(TickEvent.ClientTickEvent event) {
    try {
      if (shouldResetStatus()) {
        resetStatus();
        return;
      }

      if (shouldProcessHypixelEvent(event)) {
        processHypixelEvent();
      }
    } catch (Exception e) {
      logger.error("Error occured during method processTick", e);
    }
  }

  private boolean shouldResetStatus() {
    return HypixelUtils.INSTANCE.isHypixel() && !LocrawUtil.INSTANCE.isInGame();
  }

  private void resetStatus() {
    mapName = "N/A";
    CalloutHUD.calloutTestMap = CalloutHUD.autoResetCalloutTestMap ? "" : CalloutHUD.calloutTestMap;
    CalloutHUD.status = false;
    RegionHighlighterHUD.status = false;
  }

  private boolean shouldProcessHypixelEvent(TickEvent.ClientTickEvent event) {
    return HypixelUtils.INSTANCE.isHypixel() && LocrawUtil.INSTANCE.isInGame() && event.phase == Phase.START;
  }

  private void processHypixelEvent() {
    getInstance().tickCounter++;

    if (getInstance().tickCounter >= getConfig().calloutHUD.updateSpeed) {
      getInstance().tickCounter = 0;
      processGameType();
    }
  }

  private void processGameType() {
    try {
      handleGameType();
    } catch (NullPointerException e) {
      logger.error("Error occured in method processGameType", e);
    }
  }

  private void handleGameType() {
    LocrawInfo locrawInfo = LocrawUtil.INSTANCE.getLocrawInfo();
    if (locrawInfo != null && locrawInfo.getGameType() != null) {
      switch (LocrawUtil.INSTANCE.getLocrawInfo().getGameType()) {
        case COPS_AND_CRIMS:
        case REPLAY:
          CalloutHUD.status = true;
          RegionHighlighterHUD.status = true;
          updateMapName();
          break;
      }
    }
  }

  private void updateMapName() {
    if (CalloutHUD.calloutTestMap.isEmpty()) {
      mapName = Objects.requireNonNull(LocrawUtil.INSTANCE.getLocrawInfo()).getMapName();
    } else {
      mapName = CalloutHUD.calloutTestMap;
    }

    EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;

    if (player != null) {
      PositionUtil coords = updateCoordinates();
      processCallout(coords);
    }
  }

  private void processCallout(PositionUtil coords) {
    if (getInstance().mapList.containsKey(mapName)) {
      if (getInstance().last != null) {
        processLastCallout(coords);
      }

      if (!getInstance().same) {
        getInstance().callout = getInstance().findCallout(coords);
      }

      if (getInstance().callout != null) {
        getInstance().calloutText = getInstance().callout.getName();
      }
    }
  }

  private void processLastCallout(PositionUtil coords) {
    getInstance().same = false;
    RegionUtil[] lastRegions = getInstance().last.regions;
    for (RegionUtil region : lastRegions) {
      if (region.isInside(coords)) {
        getInstance().callout = getInstance().last;
        getInstance().same = true;
      }
    }
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

  private PositionUtil updateCoordinates() {
    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayerSP player = mc.thePlayer;
    return new PositionUtil(player.posX, player.posY, player.posZ);
  }

  private CalloutsUtil findCallout(PositionUtil position) {
    List<CalloutsUtil> callouts = this.mapList.get(mapName);
    if (callouts != null) {
      for (CalloutsUtil callout : callouts) {
        RegionUtil[] regions = callout.regions;
        for (RegionUtil region : regions) {
          if (region.isInside(position)) {
            this.last = callout;
            return callout;
          }
        }
      }
    }
    return null;
  }

  public String findRegions(PositionUtil position) {
    List<CalloutsUtil> callouts = this.mapList.get(mapName);
    if (callouts != null) {
      for (CalloutsUtil callout : callouts) {
        RegionUtil[] regions = callout.getRegions();
        if (regions == null) {
          logger.error("Regions is null for callout: " + callout);
          continue;
        }
        for (int i = 0; i < regions.length; i++) {
          RegionUtil region = regions[i];
          if (region == null) {
            logger.error("Region is null for callout: " + callout + ", index: " + i);
            continue;
          }
          if (region.isInside(position)) {
            StringBuilder result1 = new StringBuilder();
            result1.append(region.getMinX()).append(", ").append(region.getMinY()).append(", ").append(region.getMinZ());
            getConfig().regionStart = result1.toString();
            StringBuilder result2 = new StringBuilder();
            result2.append(region.getMaxX()).append(", ").append(region.getMaxY()).append(", ").append(region.getMaxZ());
            getConfig().regionEnd = result2.toString();
            return "Region from position: [" + result1.toString() + "] [" + result2.toString() + "]";
          }
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