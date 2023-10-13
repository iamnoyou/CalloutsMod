package com.github.iamnoyou.calloutsmod.callouts;

import com.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import com.github.iamnoyou.calloutsmod.util.PositionUtil;
import com.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrier {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("CT Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(43.7, 2.0, 45.3), new PositionUtil(39.3, 7.5, 41.0))
    });

    calloutsMap.put("CT Box", new RegionUtil[]{
        createRegion(new PositionUtil(36.0, 7.0, 47.0), new PositionUtil(39.0, 8.5, 44.3))
    });

    calloutsMap.put("Storage", new RegionUtil[]{
        createRegion(new PositionUtil(37.3, 6.0, 41.7), new PositionUtil(47.7, 9.5, 26.3))
    });

    calloutsMap.put("Small", new RegionUtil[]{
        createRegion(new PositionUtil(49.3, 6.0, 32.7), new PositionUtil(59.7, 9.5, 18.0))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        createRegion(new PositionUtil(62.0, 6.0, 26.7), new PositionUtil(69.7, 7.5, 12.3))
    });

    calloutsMap.put("A Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(54.3, 2.0, 13.7), new PositionUtil(57.7, 7.5, 17.3))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(54.3, 2.0, 13.0), new PositionUtil(63.0, 6.5, -5.7))
    });

    calloutsMap.put("Under CT Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(63.001, 2.0, -5.7), new PositionUtil(69.7, 3.5, 10.7))
    });

    calloutsMap.put("CT Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(68.0, 6.0, 11.0), new PositionUtil(65.0, 8.5, -7.0))
    });

    calloutsMap.put("Under Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(60.7, 2.0, -7.0), new PositionUtil(54.3, 5.0, -19.0))
    });

    calloutsMap.put("A Long", new RegionUtil[]{
        createRegion(new PositionUtil(54.3, 2.0, -19.3), new PositionUtil(64.0, 3.5, -47.7)),
        createRegion(new PositionUtil(57.0, 2.0, -47.7), new PositionUtil(65.7, 3.5, -41.0))
    });

    calloutsMap.put("Long Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(64.0, 2.0, -41.0), new PositionUtil(65.7, 3.5, -39.3))
    });

    calloutsMap.put("Generator Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(64.0, 2.0, -36.7), new PositionUtil(69.7, 8.5, -25.3))
    });

    calloutsMap.put("Generator", new RegionUtil[]{
        createRegion(new PositionUtil(63.3, 7.0, -23.7), new PositionUtil(74.7, 9.5, -7.3))
    });

    calloutsMap.put("Bridge", new RegionUtil[]{
        createRegion(new PositionUtil(63.0, 7.5, -13.3), new PositionUtil(52.7, 9.5, -17.7))
    });

    calloutsMap.put("Boilers", new RegionUtil[]{
        createRegion(new PositionUtil(43.3, 7.0, -18.7), new PositionUtil(51.7, 8.5, -2.0)),
        createRegion(new PositionUtil(51.7, 7.0, -1.3), new PositionUtil(47.3, 8.5, -2.0))
    });

    calloutsMap.put("Garage Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(45.7, 8.5, -2.0), new PositionUtil(43.3, 2.5, 3.0))
    });

    calloutsMap.put("Speedway", new RegionUtil[]{
        createRegion(new PositionUtil(36.3, 2.0, -40.3), new PositionUtil(54.0, 3.5, -47.0)),
        createRegion(new PositionUtil(54.0, 2.0, -47.7), new PositionUtil(51.3, 3.5, -47.0)),
        createRegion(new PositionUtil(42.7, 2.0, -46.0), new PositionUtil(33.3, 3.5, -61.0))
    });

    calloutsMap.put("A Plat", new RegionUtil[]{
        createRegion(new PositionUtil(48.7, 2.5, -62.7), new PositionUtil(42.7, 5.5, -47.0)),
        createRegion(new PositionUtil(45.0, 5.0, -49.0), new PositionUtil(43.0, 6.5, -45.0))
    });

    calloutsMap.put("Plane", new RegionUtil[]{
        createRegion(new PositionUtil(10.0, 2.0, -52.0), new PositionUtil(30.0, 5.5, -71.7))
    });

    calloutsMap.put("Z", new RegionUtil[]{
        createRegion(new PositionUtil(39.7, 2.0, -40.0), new PositionUtil(33.3, 3.5, -33.0))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(21.3, 2.0, -35.7), new PositionUtil(33.0, 3.5, -24.3)),
        createRegion(new PositionUtil(33.0, 2.0, -32.7), new PositionUtil(40.7, 3.5, -24.0)),
        createRegion(new PositionUtil(40.7, 2.0, -24.0), new PositionUtil(21.3, 3.5, -21.0))
    });

    calloutsMap.put("Pillars", new RegionUtil[]{
        createRegion(new PositionUtil(21.3, 2.0, -16.3), new PositionUtil(40.7, 3.5, -21.0))
    });

    calloutsMap.put("Breakables", new RegionUtil[]{
        createRegion(new PositionUtil(9.7, 2.0, -24.7), new PositionUtil(4.0, 5.5, -18.3))
    });

    calloutsMap.put("B Short", new RegionUtil[]{
        createRegion(new PositionUtil(0.7, 2.0, -18.0), new PositionUtil(3.7, 3.5, -3.0))
    });

    calloutsMap.put("Banana", new RegionUtil[]{
        createRegion(new PositionUtil(0.5, 2.0, -14.0), new PositionUtil(-14.7, 3.5, -21.7)),
        createRegion(new PositionUtil(-19.7, 2.0, -14.7), new PositionUtil(-7.3, 3.5, 0.0))
    });

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(-28.0, 6.5, -42.0), new PositionUtil(-7.0, 2.0, -58.0))
    });

    calloutsMap.put("Pallet", new RegionUtil[]{
        createRegion(new PositionUtil(-3.0, 2.0, -42.0), new PositionUtil(-8.0, 3.5, -39.0)),
        createRegion(new PositionUtil(-11.0, 2.0, -39.0), new PositionUtil(-3.0, 3.5, -27.0))
    });

    calloutsMap.put("T Main", new RegionUtil[]{
        createRegion(new PositionUtil(-5.0, 2.0, -59.0), new PositionUtil(5.0, 6.5, -42.0)),
        createRegion(new PositionUtil(10.0, 2.0, -63.0), new PositionUtil(5.0, 3.5, -47.0)),
        createRegion(new PositionUtil(5.0, 2.0, -42.0), new PositionUtil(-4.0, 5.5, -27.0)),
        createRegion(new PositionUtil(5.0, 2.0, -34.0), new PositionUtil(15.0, 3.5, -29.0)),
        createRegion(new PositionUtil(12.0, 2.0, -34.0), new PositionUtil(15.0, 3.5, -40.0)),
        createRegion(new PositionUtil(12.0, 2.0, -40.0), new PositionUtil(33.0, 3.5, -50.0)),
        createRegion(new PositionUtil(4.7, 2.0, -28.0), new PositionUtil(-2.7, 5.5, -22.0))
    });

    calloutsMap.put("Forklift", new RegionUtil[]{
        createRegion(new PositionUtil(5.0, 2.0, -46.0), new PositionUtil(12.0, 8.0, -34.0))
    });

    calloutsMap.put("Carpet", new RegionUtil[]{
        createRegion(new PositionUtil(15.0, 2.0, -40.0), new PositionUtil(25.0, 8.0, -37.0))
    });

    calloutsMap.put("B Long", new RegionUtil[]{
        createRegion(new PositionUtil(-4.0, 2.0, -3.0), new PositionUtil(24.0, 5.5, 3.0)),
        createRegion(new PositionUtil(-14.0, 2.0, 2.0), new PositionUtil(-2.0, 3.5, 11.0))
    });

    calloutsMap.put("Square", new RegionUtil[]{
        createRegion(new PositionUtil(23.9, 2.0, 25.3), new PositionUtil(7.3, 3.5, 43.7))
    });

    calloutsMap.put("CT Halls", new RegionUtil[]{
        createRegion(new PositionUtil(25.0, 2.0, 34.7), new PositionUtil(38.7, 3.5, 13.0)),
        createRegion(new PositionUtil(38.7, 3.5, 13.0), new PositionUtil(34.0, 2.0, 5.0))
    });

    calloutsMap.put("Garage", new RegionUtil[]{
        createRegion(new PositionUtil(39.0, 1.5, 5.0), new PositionUtil(48.7, 4.5, 14.7))
    });

    calloutsMap.put("Ninja", new RegionUtil[]{
        createRegion(new PositionUtil(29.7, 2.0, 4.0), new PositionUtil(28.3, 3.5, 5.7))
    });

    calloutsMap.put("B Default", new RegionUtil[]{
        createRegion(new PositionUtil(34.0, 2.0, -4.0), new PositionUtil(36.0, 3.5, -3.3))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(30.0, 2.0, 3.7), new PositionUtil(34.0, 3.5, -6.0)),
        createRegion(new PositionUtil(30.0, 2.0, 3.7), new PositionUtil(39.0, 3.5, -3.0)),
        createRegion(new PositionUtil(39.0, 2.0, -3.0), new PositionUtil(36.0, 3.5, -7.0)),
        createRegion(new PositionUtil(36.0, 2.0, -7.0), new PositionUtil(32.0, 3.5, -4.0)),
        createRegion(new PositionUtil(33.7, 2.0, -4.0), new PositionUtil(30.0, 3.5, 3.7)),
        createRegion(new PositionUtil(33.7, 2.0, -3.0), new PositionUtil(28.3, 6.5, -5.7)),
        createRegion(new PositionUtil(37.7, 2.0, -10.0), new PositionUtil(28.0, 3.5, -11.7))
    });

    calloutsMap.put("Toothpaste", new RegionUtil[]{
        createRegion(new PositionUtil(39.0, 2.0, -1.3), new PositionUtil(40.7, 3.5, -6.7))
    });

    calloutsMap.put("Triple", new RegionUtil[]{
        createRegion(new PositionUtil(38.0, 2.0, -7.0), new PositionUtil(40.7, 6.5, -11.7))
    });

    calloutsMap.put("Blue", new RegionUtil[]{
        createRegion(new PositionUtil(28.3, 2.0, -6.3), new PositionUtil(32.0, 7.5, -10.0))
    });

    calloutsMap.put("White Doors", new RegionUtil[]{
        createRegion(new PositionUtil(29.7, 2.0, 3.7), new PositionUtil(23.1, 3.5, -2.7))
    });

    calloutsMap.put("East", new RegionUtil[]{
        createRegion(new PositionUtil(39.7, 2.0, -16.0), new PositionUtil(34.3, 3.5, -13.0))
    });

    calloutsMap.put("Center", new RegionUtil[]{
        createRegion(new PositionUtil(34.3, 2.0, -15.3), new PositionUtil(29.7, 3.5, -13.0))
    });

    calloutsMap.put("West", new RegionUtil[]{
        createRegion(new PositionUtil(24.3, 2.0, -16.0), new PositionUtil(27.7, 3.5, -6.3))
    });

    calloutsMap.put("Lobby", new RegionUtil[]{
        createRegion(new PositionUtil(10.6, 2.0, 22.7), new PositionUtil(-1.8, 6.0, 6.3)),
        createRegion(new PositionUtil(10.6, 2.0, 22.7), new PositionUtil(20.7, 6.0, 3.0))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(38.7, 2.0, 58.7), new PositionUtil(18.0, 3.5, 43.0))
    });

    calloutsMap.put("Tank", new RegionUtil[]{
        createRegion(new PositionUtil(32.0, 2.0, -65.0), new PositionUtil(41.7, 3.5, -71.7))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}