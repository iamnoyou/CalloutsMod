package io.github.iamnoyou.calloutsmod.callouts;


import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Junction {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCalloutsList() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(5.7, 75.5, -55.7), new PositionUtil(-22.7, 73.0, -31.3)),
        createRegion(new PositionUtil(-9.3, 73.0, -31.0), new PositionUtil(-28.7, 75.5, -21.3))
    });

    calloutsMap.put("Alley", new RegionUtil[]{
        createRegion(new PositionUtil(-11.3, 73.0, -20.0), new PositionUtil(-19.0, 74.5, -8.0))
    });

    calloutsMap.put("Outside Monster", new RegionUtil[]{
        createRegion(new PositionUtil(-17.3, 70.0, -12.7), new PositionUtil(-26.7, 71.5, 5.7))
    });

    calloutsMap.put("Short Tunnels", new RegionUtil[]{
        createRegion(new PositionUtil(-16.0, 70.0, -0.7), new PositionUtil(-6.0, 71.5, 2.7))
    });

    calloutsMap.put("Monster", new RegionUtil[]{
        createRegion(new PositionUtil(-17.3, 70.0, 6.0), new PositionUtil(-20.7, 71.5, 13.0))
    });

    calloutsMap.put("Sewers", new RegionUtil[]{
        createRegion(new PositionUtil(-17.3, 70.0, 13.01), new PositionUtil(-27.7, 71.5, 32.7))
    });

    calloutsMap.put("Barrels", new RegionUtil[]{
        createRegion(new PositionUtil(-11.0, 73.0, 31.3), new PositionUtil(-12.7, 74.5, 34.7))
    });

    calloutsMap.put("B", new RegionUtil[]{
        createRegion(new PositionUtil(-17.001, 70.5, 29.7), new PositionUtil(-12.3, 74.0, 17.3)),
        createRegion(new PositionUtil(-6.001, 73.0, 26.001), new PositionUtil(-10.99, 74.5, 34.7)),
        createRegion(new PositionUtil(-15.7, 75.5, 16.863), new PositionUtil(-5.99, 73.0, 19.99)),
        createRegion(new PositionUtil(-7.0, 73.0, 16.0), new PositionUtil(-4.001, 74.5, 13.3))
    });

    calloutsMap.put("Pillar", new RegionUtil[]{
        createRegion(new PositionUtil(-12.0, 73.0, 20.0), new PositionUtil(-6.0, 74.5, 26.0))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(-1.0, 77.0, 16.0), new PositionUtil(-6.0, 73.0, 28.0))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-5.7, 74.0, 34.7), new PositionUtil(-2.0, 71.0, 28.3))
    });

    calloutsMap.put("Short", new RegionUtil[]{
        createRegion(new PositionUtil(-11.137, 75.5, 17.0), new PositionUtil(-7.001, 73.0, 6.3)),
        createRegion(new PositionUtil(-6.7, 74.0, 6.3), new PositionUtil(-3.7, 71.5, 8.7))
    });

    calloutsMap.put("Water", new RegionUtil[]{
        createRegion(new PositionUtil(-5.99, 70.0, -1.7), new PositionUtil(3.7, 73.5, 11.7))
    });

    calloutsMap.put("Platform", new RegionUtil[]{
        createRegion(new PositionUtil(4.0, 73.0, -0.7), new PositionUtil(8.7, 75.5, 11.7))
    });

    calloutsMap.put("Graffiti", new RegionUtil[]{
        createRegion(new PositionUtil(9.3, 73.0, 7.3), new PositionUtil(13.7, 76.0, 25.7))
    });

    calloutsMap.put("Walkway", new RegionUtil[]{
        createRegion(new PositionUtil(14.0, 74.5, 21.3), new PositionUtil(18.7, 72.0, 36.7)),
        createRegion(new PositionUtil(12.3, 72.0, 37.0), new PositionUtil(15.7, 74.5, 48.699))
    });

    calloutsMap.put("Dumpster", new RegionUtil[]{
        createRegion(new PositionUtil(12.3, 82.5, 47.0), new PositionUtil(19.7, 73.5, 54.7))
    });

    calloutsMap.put("Heaven", new RegionUtil[]{
        createRegion(new PositionUtil(15.7, 73.0, 43.7), new PositionUtil(26.7, 78.5, 38.3)),
        createRegion(new PositionUtil(15.3, 77.0, 38.7), new PositionUtil(4.0, 78.5, 26.0)),
        createRegion(new PositionUtil(26.7, 77.0, 44.0), new PositionUtil(22.0, 78.5, 54.0))
    });

    calloutsMap.put("Storage", new RegionUtil[]{
        createRegion(new PositionUtil(31.7, 77.0, 54.3), new PositionUtil(22.3, 78.7, 59.7))
    });

    calloutsMap.put("Bank", new RegionUtil[]{
        createRegion(new PositionUtil(31.7, 77.5, 54.3), new PositionUtil(29.3, 79.5, 47.3)),
        createRegion(new PositionUtil(29.3, 79.5, 47.3), new PositionUtil(21.3, 81.0, 49.7)),
        createRegion(new PositionUtil(22.3, 81.0, 44.0), new PositionUtil(26.7, 82.5, 47.0))
    });

    calloutsMap.put("Van", new RegionUtil[]{
        createRegion(new PositionUtil(27.0, 81.0, 42.0), new PositionUtil(31.7, 82.5, 46.7))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(37.7, 81.0, 33.0), new PositionUtil(14.3, 82.5, 43.0)),
        createRegion(new PositionUtil(17.3, 80.0, 33.0), new PositionUtil(29.7, 83.0, 28.0))
    });

    calloutsMap.put("Truck", new RegionUtil[]{
        createRegion(new PositionUtil(14.299, 81.0, 39.7), new PositionUtil(10.3, 84.0, 27.3))
    });

    calloutsMap.put("A Short", new RegionUtil[]{
        createRegion(new PositionUtil(16.3, 79.0, 18.001), new PositionUtil(30.7, 83.0, 27.7))
    });

    calloutsMap.put("Ladder", new RegionUtil[]{
        createRegion(new PositionUtil(3.3, 73.0, -23.0), new PositionUtil(5.575, 78.7, -25.7))
    });

    calloutsMap.put("Lower Tunnels", new RegionUtil[]{
        createRegion(new PositionUtil(3.3, 73.0, -22.99), new PositionUtil(11.7, 74.5, -14.3)),
        createRegion(new PositionUtil(9.7, 73.0, -14.3), new PositionUtil(7.3, 74.5, 1.0))
    });

    calloutsMap.put("Connector", new RegionUtil[]{
        createRegion(new PositionUtil(8.7, 73.5, 2.7), new PositionUtil(18.0, 81.5, -8.7)),
        createRegion(new PositionUtil(8.3, 76.0, -9.137), new PositionUtil(9.3, 78.5, -6.3))
    });

    calloutsMap.put("Party", new RegionUtil[]{
        createRegion(new PositionUtil(36.7, 81.5, -19.5), new PositionUtil(31.0, 84.0, -1.3))
    });

    calloutsMap.put("Highway", new RegionUtil[]{
        createRegion(new PositionUtil(19.5, 79.0, -2.5), new PositionUtil(16.3, 80.5, 20.4))
    });

    calloutsMap.put("Long Toilets", new RegionUtil[]{
        createRegion(new PositionUtil(35.3, 81.0, 1.3), new PositionUtil(44.7, 82.5, 10.7))
    });

    calloutsMap.put("Toilets", new RegionUtil[]{
        createRegion(new PositionUtil(34.0, 82.5, 1.3), new PositionUtil(22.7, 80.0, 19.3))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(19.3, 80.0, -1.3), new PositionUtil(30.7, 81.5, -13.7))
    });

    calloutsMap.put("Long", new RegionUtil[]{
        createRegion(new PositionUtil(33.0, 81.0, 33.0), new PositionUtil(58.0, 90.0, 15.0)),
        createRegion(new PositionUtil(50.0, 81.0, 10.0), new PositionUtil(58.0, 90.0, 14.0)),
        createRegion(new PositionUtil(57.0, 81.0, 10.0), new PositionUtil(46.0, 90.0, 4.0)),
        createRegion(new PositionUtil(53.0, 81.0, -4.0), new PositionUtil(46.0, 90.0, 3.0)),
        createRegion(new PositionUtil(45.0, 81.0, 0.0), new PositionUtil(54.0, 90.0, -6.0)),
        createRegion(new PositionUtil(57.0, 81.0, -6.0), new PositionUtil(42.0, 81.0, -10.0)),
        createRegion(new PositionUtil(42.0, 81.0, -11.0), new PositionUtil(47.0, 90.0, -15.0)),
        createRegion(new PositionUtil(48.0, 81.0, -15.0), new PositionUtil(58.0, 90.0, -12.0)),
        createRegion(new PositionUtil(42.0, 81.0, -16.0), new PositionUtil(58.0, 90.0, -28.0))
    });

    calloutsMap.put("Long Boost", new RegionUtil[]{
        createRegion(new PositionUtil(46.0, 81.0, 14.0), new PositionUtil(49.0, 90.0, 10.0))
    });

    calloutsMap.put("Tree", new RegionUtil[]{
        createRegion(new PositionUtil(54.0, 81.0, 3.0), new PositionUtil(58.0, 90.0, -5.0))
    });

    calloutsMap.put("Playground", new RegionUtil[]{
        createRegion(new PositionUtil(16.0, 85.0, -29.0), new PositionUtil(35.0, 81.0, -42.0))
    });

    calloutsMap.put("Fountain", new RegionUtil[]{
        createRegion(new PositionUtil(37.0, 81.0, -20.0), new PositionUtil(9.0, 85.0, -27.0)),
        createRegion(new PositionUtil(29.0, 81.0, -15.0), new PositionUtil(17.0, 85.0, -19.0))
    });

    calloutsMap.put("T Conn Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(10.0, 83.0, -31.0), new PositionUtil(7.0, 78.0, -29.0))
    });

    calloutsMap.put("T Conn", new RegionUtil[]{
        createRegion(new PositionUtil(6.0, 78.0, -29.0), new PositionUtil(-4.0, 83.0, -31.0)),
        createRegion(new PositionUtil(5.0, 78.0, -27.0), new PositionUtil(-8.0, 83.0, -25.0))
    });

    calloutsMap.put("Pit", new RegionUtil[]{
        createRegion(new PositionUtil(-1.99, 70.0, 34.7), new PositionUtil(7.7, 74.5, 18.0)),
        createRegion(new PositionUtil(2.7, 71.0, 18.0), new PositionUtil(-0.7, 72.5, 16.3))
    });

    calloutsMap.put("Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(-3.99, 72.5, 13.3), new PositionUtil(8.0, 74.5, 16.0))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}