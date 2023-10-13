package com.github.iamnoyou.calloutsmod.hud;

import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.annotations.Text;
import cc.polyfrost.oneconfig.hud.SingleTextHud;
import com.github.iamnoyou.calloutsmod.CalloutsMod;

public class CalloutHUD extends SingleTextHud {

  public static boolean status;

  @Switch(
      name = "Hide If Not In-Game Or A Supported Game",
      description = "Makes it so the display only works in CvC and Replay gamemode servers."
  )
  public boolean hide = true;

  @Text(
      name = "Test Map Callout Display", placeholder = "Put map name here",
      description = "For use as a dev / in a replay server to view and test callout placements."
  )
  public static String calloutTestMap = "";

  public CalloutHUD() {
    super("Callouts", true);
  }

  @Override
  public String getText(boolean example) {
    if (CalloutsMod.getInstance().getCalloutText().trim().isEmpty()) {
      return CalloutsMod.mapName;
    }
    return CalloutsMod.getInstance().getCalloutText();
  }

  @Override
  public boolean shouldShow() {
    return super.shouldShow() && (!hide || (status));
  }

}