package io.github.iamnoyou.calloutsmod.hud;

import cc.polyfrost.oneconfig.config.annotations.Info;
import cc.polyfrost.oneconfig.config.annotations.Slider;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.annotations.Text;
import cc.polyfrost.oneconfig.config.data.InfoType;
import cc.polyfrost.oneconfig.hud.SingleTextHud;
import io.github.iamnoyou.calloutsmod.CalloutsMod;

@SuppressWarnings("unused")
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

  @Info(
      text = "There are 20 ticks per second, default value is every 5 ticks (every 0.25 seconds) there will be a check for updating the HUD display.",
      type = InfoType.INFO, size = 2
  )
  private String useless02;

  @Slider(
      name = "Callout Update Speed (Based on Ticks)",
      min = 0, max =  40, step = 1
  )
  public static int updateSpeed = 5;

  public CalloutHUD() {
    super("Callouts", true);
  }

  @Override
  public String getText(boolean example) {
    return CalloutsMod.getInstance().getCalloutText().trim().isEmpty()
        ? CalloutsMod.mapName
        : CalloutsMod.getInstance().getCalloutText();
  }

  @Override
  public boolean shouldShow() {
    return super.shouldShow() && (!hide || (status));
  }

}