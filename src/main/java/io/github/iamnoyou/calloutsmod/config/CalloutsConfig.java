package io.github.iamnoyou.calloutsmod.config;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Color;
import cc.polyfrost.oneconfig.config.annotations.HUD;
import cc.polyfrost.oneconfig.config.annotations.Info;
import cc.polyfrost.oneconfig.config.annotations.KeyBind;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.annotations.Text;
import cc.polyfrost.oneconfig.config.core.OneColor;
import cc.polyfrost.oneconfig.config.core.OneKeyBind;
import cc.polyfrost.oneconfig.config.data.InfoType;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.libs.universal.UKeyboard;
import cc.polyfrost.oneconfig.libs.universal.wrappers.UPlayer;
import cc.polyfrost.oneconfig.utils.Notifications;
import io.github.iamnoyou.calloutsmod.CalloutsMod;
import io.github.iamnoyou.calloutsmod.hud.CalloutHUD;
import io.github.iamnoyou.calloutsmod.hud.RegionHighlighterHUD;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import java.util.Arrays;

@SuppressWarnings("unused")
public class CalloutsConfig extends Config {

  @Info(
      text = "There are no comms setup for the maps: Melon Factory & Atomic V1. The display will at most only show the map name.",
      type = InfoType.WARNING, size = 2
  )
  private String useless01;

  @HUD(name = "Callouts Display")
  public CalloutHUD calloutHUD = new CalloutHUD();

  @Info(
      text = "If you don't know what you are doing, you probably shouldn't touch this area.",
      type = InfoType.WARNING, size = 2,
      category = "Developer"
  )
  private String useless02;

  @Switch(
      name = "Debug Mode",
      description = "Will spam console with a lot of useless information for normal users.",
      category = "Developer"
  )
  public static boolean debugMode = false;

  @Switch(
      name = "Region Highlighter",
      description = "Renders a layer for the region specified to view boundaries.",
      category = "Developer"
  )
  public static boolean regionHighlighter = false;

  @Switch(
      name = "Reset Regions Upon Unloading World",
      description = "Resets the values of region start & end on world unload events.",
      category = "Developer"
  )
  public static boolean autoResetRegions = true;

  @Color(
      name = "Highlighter Color",
      category = "Developer"
  )
  public static OneColor highlighterColor = new OneColor("#00ff004A");

  @Text(
      name = "Region Start",
      placeholder = "0.00, 0.00, 0.00",
      category = "Developer"
  )
  public static String regionStart = "";

  @Text(
      name = "Region End",
      placeholder = "0.00, 0.00, 0.00",
      category = "Developer"
  )
  public static String regionEnd = "";

  @KeyBind(
      name = "Current Cords -> Region Start",
      category = "Developer"
  )
  public OneKeyBind hotkeyRegionStart = new OneKeyBind(UKeyboard.KEY_MINUS);

  @KeyBind(
      name = "Current Cords -> Region End",
      category = "Developer"
  )
  public OneKeyBind hotkeyRegionEnd = new OneKeyBind(UKeyboard.KEY_EQUALS);

  @KeyBind(
      name = "Current Callout Region -> Region Highlighter",
      size = 2,
      category = "Developer"
  )
  public OneKeyBind hotkeyCurrentCalloutRegionHighlighter = new OneKeyBind(UKeyboard.KEY_BACKSPACE);

  @HUD(
      name = "Region Highlighter Cords Display",
      category = "Developer"
  )
  public RegionHighlighterHUD regionHighlighterHUD = new RegionHighlighterHUD();

  public CalloutsConfig() {
    super(new Mod(CalloutsMod.MODNAME, ModType.HYPIXEL), CalloutsMod.MODID + ".json");
    initialize();

    Arrays.stream(new String[]{"autoResetRegions", "highlighterColor", "regionStart", "regionEnd", "hotkeyRegionStart", "hotkeyRegionEnd", "hotkeyCurrentCalloutRegionHighlighter"})
        .forEach(property -> addDependency(property, "regionHighlighter"));

    addListener("regionHighlighter", () -> {
      if (!regionHighlighter) {
        regionStart = "";
        regionEnd = "";
      }
    });

    registerKeyBind(hotkeyRegionStart, () -> {
      if (CalloutsConfig.regionHighlighter && RegionHighlighterHUD.status) {
        regionStart = getPosition();
      }
    });

    registerKeyBind(hotkeyRegionEnd, () -> {
      if (CalloutsConfig.regionHighlighter && RegionHighlighterHUD.status) {
        regionEnd = getPosition();
      }
    });

    registerKeyBind(hotkeyCurrentCalloutRegionHighlighter, () -> {
      if (CalloutsConfig.regionHighlighter && RegionHighlighterHUD.status) {
        try {
          if (CalloutsMod.getInstance().findRegions(new PositionUtil(UPlayer.getPosX(), UPlayer.getPosY(), UPlayer.getPosZ())) != null) {
            Notifications.INSTANCE.send("Region Highlighter Position Updated", CalloutsMod.getInstance().findRegions(new PositionUtil(UPlayer.getPosX(), UPlayer.getPosY(), UPlayer.getPosZ())));
          } else {
            Notifications.INSTANCE.send("Region Highlighter", "This location does not contain a region within a callout for this map!");
          }
        } catch (NullPointerException e) {
          if (debugMode) {
            e.printStackTrace();
          }
        }
      }
    });

  }

  public String getPosition() {
    return new PositionUtil(UPlayer.getPosX(), UPlayer.getPosY(), UPlayer.getPosZ()).toString();
  }

}