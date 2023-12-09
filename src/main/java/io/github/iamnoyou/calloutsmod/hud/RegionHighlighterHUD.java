package io.github.iamnoyou.calloutsmod.hud;

import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.hud.SingleTextHud;
import io.github.iamnoyou.calloutsmod.config.CalloutsConfig;

@SuppressWarnings("unused")
public class RegionHighlighterHUD extends SingleTextHud {

  public static boolean status;

  public RegionHighlighterHUD() {
    super("", false);
  }

  @Switch(
      name = "Hide If Not In-Game Or A Supported Game",
      description = "Makes it so the display only works in CvC and Replay gamemode servers.",
      size = 2
  )
  public boolean hide = true;

  @Override
  public String getText(boolean example) {
    return CalloutsConfig.regionStart + " : " + CalloutsConfig.regionEnd;
  }

  @Override
  public boolean shouldShow() {
    return super.shouldShow() && (!hide || (status));
  }

}