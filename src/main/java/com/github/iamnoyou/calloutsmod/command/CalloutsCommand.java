package com.github.iamnoyou.calloutsmod.command;

import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;
import com.github.iamnoyou.calloutsmod.CalloutsMod;

@Command(value = CalloutsMod.MODID, description = "Access the " + CalloutsMod.MODNAME + " GUI.")
public class CalloutsCommand {

  @Main
  private void handleDefault() {
    CalloutsMod.getInstance().getConfig().openGui();
  }
}