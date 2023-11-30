package io.github.iamnoyou.calloutsmod.callouts;


import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandstorm {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(-824.0, 80.0, -114.0), new PositionUtil(-802.0, 83.0, -125.0))
    });

    calloutsMap.put("Elevator", new RegionUtil[]{
        createRegion(new PositionUtil(-824.0, 80.0, -124.0), new PositionUtil(-842.0, 85.5, -115.3))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-842.0, 84.5, -117.0), new PositionUtil(-850.0, 87.5, -106.0))
    });

    calloutsMap.put("A Car", new RegionUtil[]{
        createRegion(new PositionUtil(-850.0, 85.5, -118.0), new PositionUtil(-853.0, 84.0, -130.0))
    });

    calloutsMap.put("A Long", new RegionUtil[]{
        createRegion(new PositionUtil(-842.0, 84.0, -117.3), new PositionUtil(-850.0, 85.5, -159.0)),
        createRegion(new PositionUtil(-822.3, 84.0, -158.7), new PositionUtil(-842.0, 87.5, -144.3)),
        createRegion(new PositionUtil(-832.3, 84.0, -159.7), new PositionUtil(-840.7, 87.5, -174.7))
    });

    calloutsMap.put("Pit", new RegionUtil[]{
        createRegion(new PositionUtil(-849.7, 83.5, -159.0), new PositionUtil(-842.3, 81.0, -170.7))
    });

    calloutsMap.put("Long Plat", new RegionUtil[]{
        createRegion(new PositionUtil(-850.0, 84.5, -152.3), new PositionUtil(-853.7, 88.5, -168.7))
    });

    calloutsMap.put("A Barrels", new RegionUtil[]{
        createRegion(new PositionUtil(-842.0, 87.5, -106.0), new PositionUtil(-846.0, 86.0, -102.0))
    });

    calloutsMap.put("Goose", new RegionUtil[]{
        createRegion(new PositionUtil(-846.0, 86.0, -106.0), new PositionUtil(-849.7, 87.5, -96.3)),
        createRegion(new PositionUtil(-841.99, 86.0, -96.3), new PositionUtil(-835.3, 87.5, -106.0)),
        createRegion(new PositionUtil(-842.0, 86.0, -96.3), new PositionUtil(-845.99, 87.5, -101.99))
    });

    calloutsMap.put("Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(-803.7, 80.0, -111.3), new PositionUtil(-801.0, 80.0, -114.0))
    });

    calloutsMap.put("CT Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-800.99, 80.0, -111.3), new PositionUtil(-781.3, 82.0, -123.7)),
        createRegion(new PositionUtil(-801.7, 80.0, -114.01), new PositionUtil(-796.3, 80.0, -129.0)),
        createRegion(new PositionUtil(-796.3, 80.0, -129.0), new PositionUtil(-800.0, 80.0, -131.7))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        createRegion(new PositionUtil(-780.99, 81.5, -111.3), new PositionUtil(-775.3, 84.5, -117.0)),
        createRegion(new PositionUtil(-770.01, 82.0, -109.3), new PositionUtil(-775.29, 84.5, -114.0))
    });

    calloutsMap.put("B Doors", new RegionUtil[]{
        createRegion(new PositionUtil(-775.3, 82.0, -117.01), new PositionUtil(-776.49, 81.5, -123.7)),
        createRegion(new PositionUtil(-773.0, 82.0, -119.0), new PositionUtil(-775.3, 82.0, -123.7))
    });

    calloutsMap.put("CT Mid Boxes", new RegionUtil[]{
        createRegion(new PositionUtil(-781.0, 83.5, -123.7), new PositionUtil(-776.5, 81.5, -121.0))
    });

    calloutsMap.put("Double Stack", new RegionUtil[]{
        createRegion(new PositionUtil(-770.0, 82.0, -118.0), new PositionUtil(-766.0, 86.0, -114.0))
    });

    calloutsMap.put("B Default", new RegionUtil[]{
        createRegion(new PositionUtil(-771.0, 82.0, -118.0), new PositionUtil(-773.7, 82.0, -114.3))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(-770.01, 82.0, -117.99), new PositionUtil(-770.99, 82.0, -109.3)),
        createRegion(new PositionUtil(-769.99, 83.5, -108.3), new PositionUtil(-765.3, 82.0, -113.99))
    });

    calloutsMap.put("Big Box", new RegionUtil[]{
        createRegion(new PositionUtil(-765.0, 84.5, -117.0), new PositionUtil(-760.0, 82.0, -121.0))
    });

    calloutsMap.put("Back Plat", new RegionUtil[]{
        createRegion(new PositionUtil(-754.0, 83.0, -101.0), new PositionUtil(-762.7, 84.5, -108.0))
    });

    calloutsMap.put("B Barrels", new RegionUtil[]{
        createRegion(new PositionUtil(-763.7, 83.0, -116.7), new PositionUtil(-760.0, 84.5, -112.0))
    });

    calloutsMap.put("B Plat", new RegionUtil[]{
        createRegion(new PositionUtil(-765.0, 83.5, -116.0), new PositionUtil(-764.0, 83.0, -108.3)),
        createRegion(new PositionUtil(-763.7, 83.0, -108.3), new PositionUtil(-754.3, 83.0, -111.7)),
        createRegion(new PositionUtil(-760.0, 83.0, -118.0), new PositionUtil(-754.3, 85.0, -112.0))
    });

    calloutsMap.put("B", new RegionUtil[]{
        createRegion(new PositionUtil(-760.0, 82.0, -120.0), new PositionUtil(-753.3, 82.5, -118.3)),
        createRegion(new PositionUtil(-753.3, 83.5, -120.0), new PositionUtil(-773.7, 82.0, -129.0)),
        createRegion(new PositionUtil(-753.3, 82.0, -129.0), new PositionUtil(-759.7, 82.0, -134.7))
    });

    calloutsMap.put("Close Tuns", new RegionUtil[]{
        createRegion(new PositionUtil(-754.0, 82.5, -132.0), new PositionUtil(-753.3, 83.0, -134.7))
    });

    calloutsMap.put("B Car", new RegionUtil[]{
        createRegion(new PositionUtil(-764.3, 82.0, -136.7), new PositionUtil(-773.7, 84.0, -129.01))
    });

    calloutsMap.put("Closet", new RegionUtil[]{
        createRegion(new PositionUtil(-767.7, 82.0, -139.7), new PositionUtil(-765.3, 83.5, -139.0))
    });

    calloutsMap.put("Fence", new RegionUtil[]{
        createRegion(new PositionUtil(-753.0, 82.0, -128.7), new PositionUtil(-751.3, 83.0, -125.3))
    });

    calloutsMap.put("Upper Tunnels", new RegionUtil[]{
        createRegion(new PositionUtil(-758.7, 82.5, -135.0), new PositionUtil(-754.3, 84.5, -151.7)),
        createRegion(new PositionUtil(-759.0, 84.5, -145.3), new PositionUtil(-779.7, 82.5, -154.7)),
        createRegion(new PositionUtil(-767.7, 83.5, -155.0), new PositionUtil(-764.3, 82.0, -159.0)),
        createRegion(new PositionUtil(-780.0, 82.5, -152.7), new PositionUtil(-783.7, 80.5, -146.0))
    });

    calloutsMap.put("Lower Tunnels", new RegionUtil[]{
        createRegion(new PositionUtil(-778.3, 80.0, -145.7), new PositionUtil(-796.0, 81.5, -141.3))
    });

    calloutsMap.put("Hiko", new RegionUtil[]{
        createRegion(new PositionUtil(-802.7, 80.0, -129.3), new PositionUtil(-801.0, 81.5, -133.7)),
        createRegion(new PositionUtil(-800.0, 80.0, -132.7), new PositionUtil(-801.0, 81.5, -129.0))
    });

    calloutsMap.put("Mid Doors", new RegionUtil[]{
        createRegion(new PositionUtil(-801.7, 80.0, -136.0), new PositionUtil(-796.3, 81.5, -134.0)),
        createRegion(new PositionUtil(-799.0, 80.0, -131.0), new PositionUtil(-796.3, 81.5, -133.7))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(-828.0, 86.0, -106.3), new PositionUtil(-842.0, 89.0, -117.0))
    });

    calloutsMap.put("Elbow", new RegionUtil[]{
        createRegion(new PositionUtil(-827.9, 86.0, -107.3), new PositionUtil(-823.0, 88.5, -115.0)),
        createRegion(new PositionUtil(-823.0, 88.5, -115.0), new PositionUtil(-817.3, 86.0, -108.5))
    });

    calloutsMap.put("Ninja", new RegionUtil[]{
        createRegion(new PositionUtil(-821.7, 86.0, -106.3), new PositionUtil(-817.3, 86.0, -108.4))
    });

    calloutsMap.put("Short", new RegionUtil[]{
        createRegion(new PositionUtil(-824.0, 88.0, -115.0), new PositionUtil(-817.3, 86.0, -132.0)),
        createRegion(new PositionUtil(-822.7, 84.0, -137.01), new PositionUtil(-808.0, 85.5, -142.7))
    });

    calloutsMap.put("Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(-822.7, 87.5, -132.01), new PositionUtil(-817.3, 84.0, -137.0))
    });

    calloutsMap.put("Cat", new RegionUtil[]{
        createRegion(new PositionUtil(-807.99, 84.0, -138.3), new PositionUtil(-803.0, 85.5, -160.0))
    });

    calloutsMap.put("Palm Tree", new RegionUtil[]{
        createRegion(new PositionUtil(-804.0, 85.5, -160.01), new PositionUtil(-801.0, 84.0, -163.0))
    });

    calloutsMap.put("Xbox", new RegionUtil[]{
        createRegion(new PositionUtil(-802.7, 84.49, -140.7), new PositionUtil(-800.0, 80.0, -146.0))
    });

    calloutsMap.put("Bottom Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-796.3, 80.0, -136.0), new PositionUtil(-802.7, 81.5, -140.7))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-799.7, 80.0, -141.0), new PositionUtil(-800.0, 81.5, -146.0)),
        createRegion(new PositionUtil(-802.7, 80.0, -146.3), new PositionUtil(-796.3, 84.5, -159.9)),
        createRegion(new PositionUtil(-796.3, 80.0, -141.3), new PositionUtil(-799.7, 82.5, -147.0))
    });

    calloutsMap.put("Top Right Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-795.0, 84.0, -164.3), new PositionUtil(-789.3, 85.5, -174.4))
    });

    calloutsMap.put("Top Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-796.3, 83.5, -160.01), new PositionUtil(-800.7, 85.5, -174.7)),
        createRegion(new PositionUtil(-801.0, 84.0, -173.7), new PositionUtil(-806.7, 84.5, -163.01)),
        createRegion(new PositionUtil(-806.7, 84.0, -160.0), new PositionUtil(-804.0, 85.5, -163.01)),
        createRegion(new PositionUtil(-807.7, 84.0, -165.3), new PositionUtil(-819.7, 85.5, -173.0))
    });

    calloutsMap.put("Long Doors", new RegionUtil[]{
        createRegion(new PositionUtil(-823.3, 84.0, -159.0), new PositionUtil(-827.7, 85.5, -176.0))
    });

    calloutsMap.put("Outside Long", new RegionUtil[]{
        createRegion(new PositionUtil(-815.3, 84.0, -176.01), new PositionUtil(-827.7, 87.5, -196.0))
    });

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(-815.0, 84.0, -192.3), new PositionUtil(-800.0, 85.5, -195.7)),
        createRegion(new PositionUtil(-822.7, 84.0, -196.01), new PositionUtil(-782.3, 87.5, -208.14))
    });

    calloutsMap.put("T Plat", new RegionUtil[]{
        createRegion(new PositionUtil(-782.0, 86.0, -197.0), new PositionUtil(-748.863, 89.5, -208.7)),
        createRegion(new PositionUtil(-763.0, 88.0, -186.0), new PositionUtil(-785.7, 86.0, -195.9))
    });

    calloutsMap.put("T Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-762.7, 85.5, -196.699), new PositionUtil(-754.3, 81.0, -183.0))
    });

    calloutsMap.put("Outside Tuns", new RegionUtil[]{
        createRegion(new PositionUtil(-763.0, 82.0, -183.0), new PositionUtil(-772.0, 86.5, -185.6)),
        createRegion(new PositionUtil(-777.7, 85.0, -159.3), new PositionUtil(-754.3, 81.0, -183.0))
    });

    calloutsMap.put("Suicide", new RegionUtil[]{
        createRegion(new PositionUtil(-796.3, 84.0, -195.7), new PositionUtil(-799.7, 87.5, -175.01))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}