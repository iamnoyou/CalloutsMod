package io.github.iamnoyou.calloutsmod.util;

import io.github.iamnoyou.calloutsmod.callouts.Alleyway;
import io.github.iamnoyou.calloutsmod.callouts.AtomicV2;
import io.github.iamnoyou.calloutsmod.callouts.Bazaar;
import io.github.iamnoyou.calloutsmod.callouts.Carrier;
import io.github.iamnoyou.calloutsmod.callouts.Castle;
import io.github.iamnoyou.calloutsmod.callouts.Derailed;
import io.github.iamnoyou.calloutsmod.callouts.Junction;
import io.github.iamnoyou.calloutsmod.callouts.Overgrown;
import io.github.iamnoyou.calloutsmod.callouts.Reserve;
import io.github.iamnoyou.calloutsmod.callouts.Ruins;
import io.github.iamnoyou.calloutsmod.callouts.Sandstorm;
import io.github.iamnoyou.calloutsmod.callouts.Temple;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalloutCreatorUtil {

  public static Map<String, List<CalloutsUtil>> getAllCallouts() {
    Map<String, List<CalloutsUtil>> map = new HashMap<>();
    map.put("Sandstorm", Sandstorm.createCalloutsList());
    map.put("Reserve", Reserve.createCalloutsList());
    map.put("Junction", Junction.createCalloutsList());
    map.put("Ruins", Ruins.createCalloutsList());
    map.put("Atomic V2", AtomicV2.createCalloutsList());
    map.put("Alleyway", Alleyway.createCalloutsList());
    map.put("Bazaar", Bazaar.createCalloutsList());
    map.put("Castle", Castle.createCalloutsList());
    map.put("Temple", Temple.createCalloutsList());
    map.put("Derailed", Derailed.createCalloutsList());
    map.put("Overgrown", Overgrown.createCalloutsList());
    map.put("Carrier", Carrier.createCalloutsList());
    return map;
  }

}