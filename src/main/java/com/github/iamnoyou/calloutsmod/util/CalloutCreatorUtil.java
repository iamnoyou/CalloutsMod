package com.github.iamnoyou.calloutsmod.util;

import com.github.iamnoyou.calloutsmod.callouts.Alleyway;
import com.github.iamnoyou.calloutsmod.callouts.AtomicV2;
import com.github.iamnoyou.calloutsmod.callouts.Bazaar;
import com.github.iamnoyou.calloutsmod.callouts.Carrier;
import com.github.iamnoyou.calloutsmod.callouts.Castle;
import com.github.iamnoyou.calloutsmod.callouts.Derailed;
import com.github.iamnoyou.calloutsmod.callouts.Junction;
import com.github.iamnoyou.calloutsmod.callouts.Overgrown;
import com.github.iamnoyou.calloutsmod.callouts.Reserve;
import com.github.iamnoyou.calloutsmod.callouts.Ruins;
import com.github.iamnoyou.calloutsmod.callouts.Sandstorm;
import com.github.iamnoyou.calloutsmod.callouts.Temple;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalloutCreatorUtil {

  public static Map<String, List<CalloutsUtil>> getAllCallouts() {
    Map<String, List<CalloutsUtil>> map = new HashMap<>();
    map.put("Sandstorm", Sandstorm.createCallouts());
    map.put("Reserve", Reserve.createCallouts());
    map.put("Junction", Junction.createCallouts());
    map.put("Ruins", Ruins.createCallouts());
    map.put("Atomic V2", AtomicV2.createCallouts());
    map.put("Alleyway", Alleyway.createCallouts());
    map.put("Bazaar", Bazaar.createCallouts());
    map.put("Castle", Castle.createCallouts());
    map.put("Temple", Temple.createCallouts());
    map.put("Derailed", Derailed.createCallouts());
    map.put("Overgrown", Overgrown.createCallouts());
    map.put("Carrier", Carrier.createCallouts());
    return map;
  }

}