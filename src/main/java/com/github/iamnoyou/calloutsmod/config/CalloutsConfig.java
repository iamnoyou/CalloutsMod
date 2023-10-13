package com.github.iamnoyou.calloutsmod.config;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.HUD;
import cc.polyfrost.oneconfig.config.annotations.Info;
import cc.polyfrost.oneconfig.config.data.InfoType;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import com.github.iamnoyou.calloutsmod.CalloutsMod;
import com.github.iamnoyou.calloutsmod.hud.CalloutHUD;

public class CalloutsConfig extends Config {

  @Info(
      text = "There are no comms setup for the maps: Melon Factory & Atomic V1. The display will at most only show the map name.",
      type = InfoType.WARNING, size = 2
  )
  private String useless01;

  @HUD(name = "Callouts Display")
  public CalloutHUD calloutHUD = new CalloutHUD();

  public CalloutsConfig() {
    super(new Mod(CalloutsMod.MODNAME, ModType.HYPIXEL), CalloutsMod.MODID + ".json");
    initialize();
  }
}