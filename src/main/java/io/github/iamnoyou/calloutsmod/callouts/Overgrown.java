package io.github.iamnoyou.calloutsmod.callouts;


import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Overgrown {

  public static List<CalloutsUtil> createCalloutsList() {
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("baseballaholic", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(22.3, 5.0, -8.3), new PositionUtil(22.3, 5.0, -8.3))
    });

    calloutsMap.put("T Spawn", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(42.3, 10.0, 29.0), new PositionUtil(52.7, 13.5, -6.0))
    });

    calloutsMap.put("T Ramp", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(52.7, 13.5, -6.0), new PositionUtil(38.0, 5.0, -21.0))
    });

    calloutsMap.put("Outside Long", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(37.0, 5.0, -13.0), new PositionUtil(23.3, 8.5, -23.0))
    });

    calloutsMap.put("Top Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(33.0, 4.0, -14.0), new PositionUtil(15.3, 8.5, 3.7))
    });

    calloutsMap.put("Suicide", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(33.0, 7.0, -0.7), new PositionUtil(41.7, 8.5, 4.7))
    });

    calloutsMap.put("A Pillar", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(6.0, 3.0, -8.0), new PositionUtil(-1.0, 5.5, -1.0))
    });

    calloutsMap.put("B Pillar", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(2.0, 6.5, 2.0), new PositionUtil(-5.0, 3.0, 9.0))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(6.0, 3.0, -14.7), new PositionUtil(15.0, 7.5, 12.7))
    });

    calloutsMap.put("Bottom Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-5.0, 3.0, 12.7), new PositionUtil(-10.7, 4.5, -11.7)),
        RegionUtil.createRegion(new PositionUtil(5.0, 3.0, -8.0), new PositionUtil(-5.0, 4.5, -12.7)),
        RegionUtil.createRegion(new PositionUtil(-5.0, 3.0, 9.0), new PositionUtil(6.0, 5.5, 13.7)),
        RegionUtil.createRegion(new PositionUtil(-11.0, 3.0, -5.7), new PositionUtil(-11.7, 4.5, -3.3)),
        RegionUtil.createRegion(new PositionUtil(-11.7, 3.0, 6.7), new PositionUtil(-11.0, 7.5, 4.3)),
        RegionUtil.createRegion(new PositionUtil(-10.7, 3.0, -1.0), new PositionUtil(6.0, 4.5, 2.0))
    });

    calloutsMap.put("Mid Doors", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-11.0, 3.0, 2.7), new PositionUtil(-14.0, 4.5, -1.7))
    });

    calloutsMap.put("Cat", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(0.3, 3.0, -12.0), new PositionUtil(13.7, 6.5, -29.0)),
        RegionUtil.createRegion(new PositionUtil(4.0, 3.0, -29.0), new PositionUtil(-5.699, 4.5, -39.7))
    });

    calloutsMap.put("Truck", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(5.0, 3.0, -29.0), new PositionUtil(10.7, 7.5, -32.7))
    });

    calloutsMap.put("Stairs", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-5.7, 3.5, -39.7), new PositionUtil(-14.7, 9.5, -35.3))
    });

    calloutsMap.put("Short", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-14.701, 8.0, -35.3), new PositionUtil(-21.0, 9.5, -39.7)),
        RegionUtil.createRegion(new PositionUtil(-21.0, 9.5, -37.0), new PositionUtil(-32.0, 6.5, -35.3)),
        RegionUtil.createRegion(new PositionUtil(-29.0, 10.5, -41.0), new PositionUtil(-24.0, 7.0, -38.0))
    });

    calloutsMap.put("Circle", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-21.0, 8.0, -37.0), new PositionUtil(-24.0, 11.5, -41.3))
    });

    calloutsMap.put("Square", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-29.0, 6.5, -37.0), new PositionUtil(-32.0, 10.5, -41.0))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-32.0, 6.0, -35.3), new PositionUtil(-35.0, 9.5, -50.0)),
        RegionUtil.createRegion(new PositionUtil(-35.0, 6.0, -48.7), new PositionUtil(-42.0, 7.5, -44.0)),
        RegionUtil.createRegion(new PositionUtil(-37.0, 6.0, -44.0), new PositionUtil(-44.0, 7.5, -35.3)),
        RegionUtil.createRegion(new PositionUtil(-42.0, 6.0, -43.0), new PositionUtil(-44.0, 7.5, -55.0)),
        RegionUtil.createRegion(new PositionUtil(-44.0, 6.0, -47.3), new PositionUtil(-45.7, 7.5, -58.7))
    });

    calloutsMap.put("A Default", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-37.0, 6.0, -44.0), new PositionUtil(-35.3, 7.5, -42.0))
    });

    calloutsMap.put("Ninja", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-45.7, 6.0, -45.0), new PositionUtil(-44.3, 7.5, -47.0))
    });

    calloutsMap.put("Tree", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-42.0, 6.0, -58.7), new PositionUtil(-38.0, 9.0, -55.0))
    });

    calloutsMap.put("Pocket", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-37.7, 7.5, -55.0), new PositionUtil(-31.3, 4.0, -58.7))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-31.0, 3.5, -50.3), new PositionUtil(-37.0, 7.5, -54.99))
    });

    calloutsMap.put("Elevator", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-22.3, 3.0, -41.0), new PositionUtil(-30.7, 4.5, -48.0))
    });

    calloutsMap.put("Arch", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-44.0, 6.0, -35.3), new PositionUtil(-48.7, 7.5, -39.7))
    });

    calloutsMap.put("A Long", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-31.0, 3.0, -56.7), new PositionUtil(31.7, 7.5, -48.0)),
        RegionUtil.createRegion(new PositionUtil(31.7, 3.0, -48.0), new PositionUtil(-19.7, 7.5, -41.3)),
        RegionUtil.createRegion(new PositionUtil(31.7, 3.0, -41.0), new PositionUtil(23.3, 6.5, -28.3))
    });

    calloutsMap.put("Long Doors", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(30.7, 5.0, -28.0), new PositionUtil(24.0, 9.5, -23.7))
    });

    calloutsMap.put("CT", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-22.3, 3.0, -39.0), new PositionUtil(-30.7, 4.5, -24.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-34.7, 3.0, -24.0), new PositionUtil(-21.3, 6.5, -7.0))
    });

    calloutsMap.put("CT Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-32.7, 3.0, -6.7), new PositionUtil(-16.3, 7.5, 18.0)),
        RegionUtil.createRegion(new PositionUtil(-16.3, 6.0, 18.0), new PositionUtil(-29.7, 8.5, 27.0))
    });

    calloutsMap.put("East Doors", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-17.3, 7.0, 27.7), new PositionUtil(-19.7, 8.5, 27.0))
    });

    calloutsMap.put("West Doors", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-27.3, 7.0, 27.7), new PositionUtil(-29.7, 8.5, 27.0))
    });

    calloutsMap.put("Close Left", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-15.3, 7.0, 45.0), new PositionUtil(-18.0, 8.5, 48.7))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-18.1, 7.0, 48.7), new PositionUtil(-27.0, 10.5, 38.0)),
        RegionUtil.createRegion(new PositionUtil(-27.0, 7.0, 39.0), new PositionUtil(-36.7, 8.5, 34.0)),
        RegionUtil.createRegion(new PositionUtil(-21.0, 7.0, 34.0), new PositionUtil(-33.0, 10.5, 29.3)),
        RegionUtil.createRegion(new PositionUtil(-20.3, 7.0, 34.0), new PositionUtil(-27.0, 8.5, 38.0))
    });

    calloutsMap.put("Under Window", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-36.7, 7.0, 33.0), new PositionUtil(-33.0, 10.5, 29.3))
    });

    calloutsMap.put("Headshot", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-32.3, 7.0, 39.0), new PositionUtil(-36.7, 8.5, 40.7))
    });

    calloutsMap.put("Car", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-20.0, 7.0, 38.0), new PositionUtil(-16.3, 7.0, 29.3))
    });

    calloutsMap.put("B Cubby", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-27.0, 7.0, 43.3), new PositionUtil(-28.7, 8.5, 48.7))
    });

    calloutsMap.put("Panes", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-28.0, 10.0, 47.0), new PositionUtil(-29.137, 12.5, 44.0))
    });

    calloutsMap.put("Outside Tuns", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(37.0, 7.0, 46.0), new PositionUtil(10.0, 10.5, 27.0))
    });

    calloutsMap.put("Upper Tunnels", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-8.0, 10.5, 27.0), new PositionUtil(5.0, 7.0, 46.0)),
        RegionUtil.createRegion(new PositionUtil(-16.0, 7.0, 41.3), new PositionUtil(-7.0, 9.5, 44.7))
    });

    calloutsMap.put("Lower Tunnels", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-3.0, 8.5, 26.0), new PositionUtil(0.0, 3.0, 14.0))
    });

    calloutsMap.put("B Doors", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-21.0, 7.0, 27.0), new PositionUtil(-26.0, 8.5, 31.0))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-35.0, 12.5, 29.0), new PositionUtil(-31.0, 6.5, 19.0))
    });

    calloutsMap.put("T Plat", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(55.0, 7.5, 29.0), new PositionUtil(37.0, 13.5, 46.0))
    });

    return calloutsMap.entrySet().stream()
        .map(entry -> new CalloutsUtil(entry.getKey(), entry.getValue()))
        .collect(Collectors.toList());
  }

}