package io.github.iamnoyou.calloutsmod.callouts;


import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Temple {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(-816.0, 73.0, -250.7), new PositionUtil(-803.0, 76.5, -238.3))
    });

    calloutsMap.put("T Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-803.0, 73.0, -246.7), new PositionUtil(-797.3, 77.5, -233.0))
    });

    calloutsMap.put("T Entrance", new RegionUtil[]{
        createRegion(new PositionUtil(-797.3, 76.0, -233.0), new PositionUtil(-814.7, 77.5, -227.0))
    });

    calloutsMap.put("Fork", new RegionUtil[]{
        createRegion(new PositionUtil(-814.7, 76.0, -224.7), new PositionUtil(-806.3, 79.5, -208.0)),
        createRegion(new PositionUtil(-815.7, 76.0, -208.0), new PositionUtil(-808.3, 78.0, -200.3))
    });

    calloutsMap.put("Sewers", new RegionUtil[]{
        createRegion(new PositionUtil(-827.0, 67.0, -232.7), new PositionUtil(-836.95, 68.5, -228.3))
    });

    calloutsMap.put("Snake", new RegionUtil[]{
        createRegion(new PositionUtil(-825.0, 68.5, -236.3), new PositionUtil(-835.7, 71.5, -243.0)),
        createRegion(new PositionUtil(-836.7, 71.0, -243.3), new PositionUtil(-817.0, 73.0, -246.7))
    });

    calloutsMap.put("Mid Doors", new RegionUtil[]{
        createRegion(new PositionUtil(-808.0, 76.0, -202.3), new PositionUtil(-803.0, 77.5, -208.7))
    });

    calloutsMap.put("Bottom Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-794.0, 76.0, -209.7), new PositionUtil(-803.7, 77.5, -200.3))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-797.3, 76.0, -199.7), new PositionUtil(-802.7, 78.5, -173.0))
    });

    calloutsMap.put("Top Mid", new RegionUtil[]{
        createRegion(new PositionUtil(-804.7, 76.0, -172.7), new PositionUtil(-796.0, 79.5, -142.3)),
        createRegion(new PositionUtil(-796.0, 79.5, -142.3), new PositionUtil(-793.3, 76.0, -155.7)),
        createRegion(new PositionUtil(-805.0, 76.0, -165.7), new PositionUtil(-806.7, 77.5, -156.0)),
        createRegion(new PositionUtil(-805.0, 76.0, -156.0), new PositionUtil(-809.7, 77.5, -142.3))
    });

    calloutsMap.put("Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(-796.0, 77.5, -165.3), new PositionUtil(-793.3, 68.0, -176.3))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-797.3, 68.5, -198.7), new PositionUtil(-773.0, 79.0, -192.0))
    });

    calloutsMap.put("B Long", new RegionUtil[]{
        createRegion(new PositionUtil(-794.0, 76.0, -209.7), new PositionUtil(-779.0, 79.5, -199.0))
    });

    calloutsMap.put("Elbow", new RegionUtil[]{
        createRegion(new PositionUtil(-779.0, 76.0, -199.0), new PositionUtil(-763.3, 79.0, -206.7)),
        createRegion(new PositionUtil(-772.7, 76.0, -200.0), new PositionUtil(-766.3, 78.5, -192.0))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(-774.0, 79.0, -192.0), new PositionUtil(-762.3, 76.0, -177.3)),
        createRegion(new PositionUtil(-764.3, 76.0, -177.0), new PositionUtil(-772.7, 76.5, -175.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(-802.0, 73.0, -129.0), new PositionUtil(-817.0, 74.5, -119.0))
    });

    calloutsMap.put("CT", new RegionUtil[]{
        createRegion(new PositionUtil(-801.0, 73.0, -135.0), new PositionUtil(-774.0, 80.0, -119.0)),
        createRegion(new PositionUtil(-818.0, 73.0, -119.0), new PositionUtil(-833.0, 77.5, -137.0))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(-833.0, 76.0, -138.0), new PositionUtil(-819.0, 77.5, -151.0)),
        createRegion(new PositionUtil(-819.0, 77.5, -152.0), new PositionUtil(-826.0, 76.0, -155.0))
    });

    calloutsMap.put("Ninja", new RegionUtil[]{
        createRegion(new PositionUtil(-831.0, 76.0, -152.0), new PositionUtil(-833.0, 77.5, -155.0))
    });

    calloutsMap.put("CT Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(-828.0, 76.0, -172.0), new PositionUtil(-808.0, 77.5, -159.0))
    });

    calloutsMap.put("CT Tunnels", new RegionUtil[]{
        createRegion(new PositionUtil(-773.0, 76.0, -136.0), new PositionUtil(-780.0, 77.5, -161.0))
    });

    calloutsMap.put("Tuns", new RegionUtil[]{
        createRegion(new PositionUtil(-765.0, 76.0, -171.0), new PositionUtil(-780.0, 77.5, -162.0))
    });

    calloutsMap.put("Z", new RegionUtil[]{
        createRegion(new PositionUtil(-795.0, 76.0, -158.0), new PositionUtil(-781.0, 77.5, -168.0))
    });

    calloutsMap.put("Arches", new RegionUtil[]{
        createRegion(new PositionUtil(-818.0, 76.0, -152.7), new PositionUtil(810.0, 77.5, -147.5))
    });

    calloutsMap.put("Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(-823.0, 75.5, -177.0), new PositionUtil(-827.0, 77.5, -194.0))
    });

    calloutsMap.put("T Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(-828.7, 80.5, -195.3), new PositionUtil(-820.3, 76.0, -206.7))
    });

    calloutsMap.put("T Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(-813.3, 68.5, -216.3), new PositionUtil(-815.7, 77.5, -209.0))
    });

    calloutsMap.put("Under", new RegionUtil[]{
        createRegion(new PositionUtil(-819.3, 67.0, -239.7), new PositionUtil(-826.0, 69.5, -177.3)),
        createRegion(new PositionUtil(-827.0, 67.0, -219.7), new PositionUtil(-828.7, 69.5, -176.3)),
        createRegion(new PositionUtil(-819.0, 67.0, -208.3), new PositionUtil(-816.0, 69.5, -220.7)),
        createRegion(new PositionUtil(-816.0, 69.5, -220.7), new PositionUtil(-813.3, 68.0, -216.3)),
        createRegion(new PositionUtil(-819.0, 67.0, -178.3), new PositionUtil(-804.0, 69.5, -109.7)),
        createRegion(new PositionUtil(-804.0, 68.0, -187.0), new PositionUtil(-797.3, 70.0, -198.7)),
        createRegion(new PositionUtil(-797.0, 67.0, -176.3), new PositionUtil(-773.3, 71.0, -191.7)),
        createRegion(new PositionUtil(-793.3, 68.0, -176.3), new PositionUtil(-804.0, 69.5, -180.0))
    });

    calloutsMap.put("Pillar", new RegionUtil[]{
        createRegion(new PositionUtil(-804.0, 68.0, -180.0), new PositionUtil(-797.0, 69.5, -187.0))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}