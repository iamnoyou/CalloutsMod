package com.github.iamnoyou.calloutsmod.callouts;

import com.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import com.github.iamnoyou.calloutsmod.util.PositionUtil;
import com.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Castle {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(20.0, 70.0, -92.7), new PositionUtil(29.7, 71.5, -86.3))
    });

    calloutsMap.put("Rapunzel", new RegionUtil[]{
        createRegion(new PositionUtil(22.3, 79.0, -93.3), new PositionUtil(24.7, 70.0, -93.7))
    });

    calloutsMap.put("Tower", new RegionUtil[]{
        createRegion(new PositionUtil(24.7, 79.0, -94.0), new PositionUtil(19.3, 80.5, -100.7))
    });

    calloutsMap.put("Statue", new RegionUtil[]{
        createRegion(new PositionUtil(9.0, 72.0, -86.0), new PositionUtil(3.0, 75.0, -80.0))
    });

    calloutsMap.put("T", new RegionUtil[]{
        createRegion(new PositionUtil(19.7, 70.5, -86.0), new PositionUtil(-13.5, 80.0, -100.0)),
        createRegion(new PositionUtil(9.001, 70.0, -86.0), new PositionUtil(14.7, 74.5, -66.0)),
        createRegion(new PositionUtil(15.0, 75.0, -85.0), new PositionUtil(20.7, 71.5, -81.3)),
        createRegion(new PositionUtil(2.99, 72.0, -86.0), new PositionUtil(-10.7, 76.0, -72.3))
    });

    calloutsMap.put("Patio", new RegionUtil[]{
        createRegion(new PositionUtil(14.7, 73.0, -66.0), new PositionUtil(9.0, 77.0, -59.3)),
        createRegion(new PositionUtil(15.0, 75.0, -59.3), new PositionUtil(20.7, 77.5, -74.7))
    });

    calloutsMap.put("D Lore", new RegionUtil[]{
        createRegion(new PositionUtil(16.3, 76.5, -54.0), new PositionUtil(27.7, 73.0, -48.3))
    });

    calloutsMap.put("Upper Halls", new RegionUtil[]{
        createRegion(new PositionUtil(29.3, 73.0, -50.0), new PositionUtil(39.7, 75.5, -56.7))
    });

    calloutsMap.put("Lower Halls", new RegionUtil[]{
        createRegion(new PositionUtil(39.7, 73.0, -46.0), new PositionUtil(29.3, 74.5, -49.0)),
        createRegion(new PositionUtil(39.7, 73.0, -46.0), new PositionUtil(36.3, 75.5, -42.3))
    });

    calloutsMap.put("Sky", new RegionUtil[]{
        createRegion(new PositionUtil(29.3, 73.0, -46.0), new PositionUtil(36.0, 77.5, -42.3)),
        createRegion(new PositionUtil(33.7, 76.0, -42.0), new PositionUtil(31.3, 78.5, -33.0))
    });

    calloutsMap.put("Drop", new RegionUtil[]{
        createRegion(new PositionUtil(26.3, 73.0, -28.3), new PositionUtil(33.7, 75.0, -33.7)),
        createRegion(new PositionUtil(29.3, 73.0, -28.0), new PositionUtil(33.999, 74.5, -24.3))
    });

    calloutsMap.put("Electric", new RegionUtil[]{
        createRegion(new PositionUtil(34.0, 73.0, -24.3), new PositionUtil(40.0, 74.5, -27.7))
    });

    calloutsMap.put("B Long", new RegionUtil[]{
        createRegion(new PositionUtil(36.3, 73.0, -37.0), new PositionUtil(38.7, 74.5, -35.3)),
        createRegion(new PositionUtil(36.3, 73.0, -37.0), new PositionUtil(53.0, 74.5, -40.7))
    });

    calloutsMap.put("B Plat", new RegionUtil[]{
        createRegion(new PositionUtil(53.3, 73.0, -37.0), new PositionUtil(64.7, 75.5, -45.7))
    });

    calloutsMap.put("Sidewalk", new RegionUtil[]{
        createRegion(new PositionUtil(55.0, 71.0, -32.0), new PositionUtil(48.3, 73.5, -35.7)),
        createRegion(new PositionUtil(48.0, 74.0, -34.7), new PositionUtil(41.3, 72.0, -27.0))
    });

    calloutsMap.put("Fountain", new RegionUtil[]{
        createRegion(new PositionUtil(52.0, 72.0, -19.0), new PositionUtil(58.0, 74.5, -25.0))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(52.0, 72.0, -19.0), new PositionUtil(48.3, 73.5, -28.0)),
        createRegion(new PositionUtil(52.0, 73.5, -25.0), new PositionUtil(61.0, 71.0, -28.0)),
        createRegion(new PositionUtil(58.0, 73.5, -25.0), new PositionUtil(61.0, 71.0, -16.0)),
        createRegion(new PositionUtil(61.0, 71.0, -16.0), new PositionUtil(52.0, 73.5, -19.0))
    });

    calloutsMap.put("B", new RegionUtil[]{
        createRegion(new PositionUtil(61.0, 71.0, -32.7), new PositionUtil(67.7, 73.5, -16.0)),
        createRegion(new PositionUtil(69.7, 74.5, -16.0), new PositionUtil(68.0, 71.0, -24.0)),
        createRegion(new PositionUtil(59.0, 71.0, -16.0), new PositionUtil(52.3, 71.0, -12.3)),
        createRegion(new PositionUtil(52.0, 71.0, -16.0), new PositionUtil(49.3, 71.0, -13.3)),
        createRegion(new PositionUtil(47.0, 71.0, -16.3), new PositionUtil(43.3, 72.5, -24.0))
    });

    calloutsMap.put("Rock", new RegionUtil[]{
        createRegion(new PositionUtil(44.0, 71.0, -22.0), new PositionUtil(37.0, 74.5, -17.0))
    });

    calloutsMap.put("B Doors", new RegionUtil[]{
        createRegion(new PositionUtil(35.0, 71.0, -16.3), new PositionUtil(28.7, 72.5, -20.0))
    });

    calloutsMap.put("Connector", new RegionUtil[]{
        createRegion(new PositionUtil(28.7, 71.0, -25.7), new PositionUtil(15.3, 73.5, -9.3))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        createRegion(new PositionUtil(26.3, 73.0, -26.0), new PositionUtil(28.7, 74.7, -28.0))
    });

    calloutsMap.put("Vent Room", new RegionUtil[]{
        createRegion(new PositionUtil(15.0, 72.0, -15.7), new PositionUtil(12.3, 73.5, -8.3)),
        createRegion(new PositionUtil(9.3, 72.0, -15.0), new PositionUtil(12.0, 73.5, -10.3))
    });

    calloutsMap.put("Balcony", new RegionUtil[]{
        createRegion(new PositionUtil(13.7, 72.5, -8.25), new PositionUtil(10.0, 75.2, -4.3))
    });

    calloutsMap.put("CT Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(10.7, 75.0, -24.0), new PositionUtil(-1.7, 68.0, -41.7)),
        createRegion(new PositionUtil(-3.7, 72.5, -31.3), new PositionUtil(-2.0, 69.0, -34.7))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(8.7, 68.0, -43.3), new PositionUtil(-3.7, 71.5, -48.7)),
        createRegion(new PositionUtil(-2.7, 68.0, -49.0), new PositionUtil(2.7, 69.5, -52.0))
    });

    calloutsMap.put("Ninja", new RegionUtil[]{
        createRegion(new PositionUtil(68.0, 71.0, -28.7), new PositionUtil(69.7, 72.5, -24.3))
    });

    calloutsMap.put("Chicken Coop", new RegionUtil[]{
        createRegion(new PositionUtil(69.7, 72.0, -15.7), new PositionUtil(59.0, 73.5, -12.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(1.3, 73.5, 9.7), new PositionUtil(9.7, 72.0, -3.413))
    });

    calloutsMap.put("A Truck", new RegionUtil[]{
        createRegion(new PositionUtil(0.3, 72.0, -4.746), new PositionUtil(7.7, 73.5, -13.68))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(-1.099, 73.0, 5.662), new PositionUtil(-9.089, 75.0, -10.7))
    });

    calloutsMap.put("Stables", new RegionUtil[]{
        createRegion(new PositionUtil(-13.7, 73.5, -25.514), new PositionUtil(-10.461, 72.0, -12.3))
    });

    calloutsMap.put("Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(-12.7, 72.0, -31.422), new PositionUtil(-10.3, 74.5, -32.7))
    });

    calloutsMap.put("A Long", new RegionUtil[]{
        createRegion(new PositionUtil(-15.0, 72.0, -28.25), new PositionUtil(-24.7, 74.5, -52.4)),
        createRegion(new PositionUtil(-15.0, 72.0, -47.3), new PositionUtil(-12.3, 74.5, -53.7))
    });

    calloutsMap.put("Catwalk", new RegionUtil[]{
        createRegion(new PositionUtil(-9.7, 73.0, -47.313), new PositionUtil(-4.505, 74.5, -69.7))
    });

    calloutsMap.put("Snake", new RegionUtil[]{
        createRegion(new PositionUtil(15.56, 74.5, -51.7), new PositionUtil(7.501, 68.0, -52.304)),
        createRegion(new PositionUtil(10.7, 68.0, -52.0), new PositionUtil(7.0, 69.5, -54.7)),
        createRegion(new PositionUtil(11.0, 68.5, -50.6), new PositionUtil(15.0, 74.5, -49.3))
    });

    calloutsMap.put("A", new RegionUtil[]{
        createRegion(new PositionUtil(8.0, 72.0, -24.0), new PositionUtil(-8.7, 73.5, -12.0)),
        createRegion(new PositionUtil(-10.0, 72.0, -30.7), new PositionUtil(-3.3, 73.5, -25.0)),
        createRegion(new PositionUtil(10.7, 72.0, -15.0), new PositionUtil(8.0, 73.5, -26.0))
    });

    calloutsMap.put("T Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-4.0, 72.5, -68.7), new PositionUtil(-6.7, 69.0, -59.3)),
        createRegion(new PositionUtil(-3.7, 74.5, -72.0), new PositionUtil(6.0, 68.0, -52.3)),
        createRegion(new PositionUtil(6.0, 72.99, -70.7), new PositionUtil(10.7, 68.0, -56.3))
    });

    calloutsMap.put("Under Balcony", new RegionUtil[]{
        createRegion(new PositionUtil(9.7, 72.0, -4.0), new PositionUtil(8.0, 73.5, -8.7))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}