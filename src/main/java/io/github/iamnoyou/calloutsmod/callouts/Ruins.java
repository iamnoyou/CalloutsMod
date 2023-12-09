package io.github.iamnoyou.calloutsmod.callouts;


import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ruins {

  public static List<CalloutsUtil> createCalloutsList() {
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("T Spawn", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(2.7, 85.0, 91.7), new PositionUtil(22.7, 79.0, 71.3))
    });

    calloutsMap.put("T Tunnel", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(4.3, 80.5, 70.4), new PositionUtil(6.7, 79.0, 52.4))
    });

    calloutsMap.put("Swamp", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(14.7, 80.5, 51.7), new PositionUtil(7.4, 79.0, 45.3))
    });

    calloutsMap.put("Ruins", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-9.5, 85.0, 31.3), new PositionUtil(6.6, 80.5, 51.6))
    });

    calloutsMap.put("Double Doors", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-10.4, 83.5, 31.3), new PositionUtil(-17.7, 82.0, 40.7))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-34.7, 85.0, 29.3), new PositionUtil(-18.5, 81.5, 37.7)),
        RegionUtil.createRegion(new PositionUtil(-35.5, 84.5, 31.3), new PositionUtil(-36.7, 88.0, 34.7))
    });

    calloutsMap.put("Lane", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-21.3, 84.5, 41.5), new PositionUtil(-26.5, 82.0, 49.7))
    });

    calloutsMap.put("Banger", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-27.4, 83.5, 49.7), new PositionUtil(-32.7, 88.0, 45.3))
    });

    calloutsMap.put("Outside Cave", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-24.7, 85.0, 50.7), new PositionUtil(-20.3, 88.0, 62.4))
    });

    calloutsMap.put("Cheetah", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-30.3, 87.5, 64.7), new PositionUtil(-34.7, 86.0, 52.3))
    });

    calloutsMap.put("Cave Entrance", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-29.8, 85.0, 62.7), new PositionUtil(-24.1, 89.0, 56.7))
    });

    calloutsMap.put("Snake", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-20.3, 86.0, 63.4), new PositionUtil(-25.3, 89.0, 69.6))
    });

    calloutsMap.put("Dark", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-35.4, 86.0, 53.3), new PositionUtil(-39.4, 89.0, 54.7))
    });

    calloutsMap.put("Cave", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-40.3, 86.0, 56.7), new PositionUtil(-53.7, 89.0, 51.3)),
        RegionUtil.createRegion(new PositionUtil(-44.7, 86.0, 50.3), new PositionUtil(-42.3, 89.0, 50.3)),
        RegionUtil.createRegion(new PositionUtil(-52.7, 86.0, 49.7), new PositionUtil(-48.3, 88.0, 50.7))
    });

    calloutsMap.put("Ninja", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-38.5, 85.0, 45.5), new PositionUtil(-37.3, 88.0, 49.7))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-35.5, 85.0, 31.3), new PositionUtil(-38.3, 88.0, 44.6)),
        RegionUtil.createRegion(new PositionUtil(-39.6, 85.0, 31.3), new PositionUtil(-41.6, 87.0, 48.7)),
        RegionUtil.createRegion(new PositionUtil(-57.7, 85.0, 50.7), new PositionUtil(-52.3, 88.0, 31.3)),
        RegionUtil.createRegion(new PositionUtil(-51.5, 85.0, 33.3), new PositionUtil(-42.7, 88.0, 39.6))
    });

    calloutsMap.put("Pillar", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-42.5, 85.0, 48.7), new PositionUtil(-50.6, 88.0, 40.1))
    });

    calloutsMap.put("B Short", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-58.3, 85.0, 49.7), new PositionUtil(-66.6, 88.0, 45.3))
    });

    calloutsMap.put("B Long", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-58.2, 85.0, 34.7), new PositionUtil(-71.7, 88.0, 29.3)),
        RegionUtil.createRegion(new PositionUtil(-72.7, 85.0, 34.4), new PositionUtil(-72.7, 88.0, 31.4))
    });

    calloutsMap.put("Back Alley", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-72.7, 84.5, 35.4), new PositionUtil(-67.3, 86.5, 44.7))
    });

    calloutsMap.put("Alley", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-67.0, 85.5, 45.5), new PositionUtil(-71.7, 83.5, 67.7)),
        RegionUtil.createRegion(new PositionUtil(-65.6, 85.5, 64.3), new PositionUtil(-66.3, 83.5, 67.6))
    });

    calloutsMap.put("CT Cubby", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-65.0, 84.0, 67.7), new PositionUtil(-63.3, 87.0, 64.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-95.8, 83.0, 80.7), new PositionUtil(-73.3, 87.0, 68.3))
    });

    calloutsMap.put("Mid House", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-70.7, 84.0, 69.3), new PositionUtil(-64.3, 85.5, 74.4))
    });

    calloutsMap.put("Snipers Nest", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-62.3, 85.0, 76.3), new PositionUtil(-70.7, 86.5, 81.7)),
        RegionUtil.createRegion(new PositionUtil(-68.7, 86.0, 82.7), new PositionUtil(-64.3, 87.5, 82.7))
    });

    calloutsMap.put("Red", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-52.3, 86.0, 75.3), new PositionUtil(-58.7, 87.5, 81.7)),
        RegionUtil.createRegion(new PositionUtil(-57.7, 86.0, 82.7), new PositionUtil(-53.3, 87.5, 82.7))
    });

    calloutsMap.put("Top Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-42.2, 83.5, 75.3), new PositionUtil(-49.7, 87.5, 81.5))
    });

    calloutsMap.put("Pit", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-41.7, 83.0, 70.5), new PositionUtil(-37.3, 84.5, 67.3))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-25.6, 83.0, 85.5), new PositionUtil(-41.7, 84.5, 71.4))
    });

    calloutsMap.put("Lower Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-26.7, 84.5, 86.6), new PositionUtil(-21.5, 83.0, 94.6)),
        RegionUtil.createRegion(new PositionUtil(-24.5, 83.0, 85.3), new PositionUtil(-20.3, 84.5, 75.5)),
        RegionUtil.createRegion(new PositionUtil(-19.3, 83.0, 76.3), new PositionUtil(-19.3, 84.5, 80.7))
    });

    calloutsMap.put("Xbox", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-20.3, 83.0, 74.3), new PositionUtil(-25.4, 87.5, 70.8))
    });

    calloutsMap.put("Ledge", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-26.4, 86.0, 70.3), new PositionUtil(-36.5, 87.5, 71.3))
    });

    calloutsMap.put("Yard", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-20.4, 84.5, 94.7), new PositionUtil(-14.4, 82.0, 92.3)),
        RegionUtil.createRegion(new PositionUtil(2.5, 82.0, 92.4), new PositionUtil(-13.3, 83.5, 118.7))
    });

    calloutsMap.put("A Stairs", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-14.7, 82.0, 102.3), new PositionUtil(-17.7, 83.5, 118.7)),
        RegionUtil.createRegion(new PositionUtil(-16.7, 82.0, 119.7), new PositionUtil(-14.3, 83.5, 119.7)),
        RegionUtil.createRegion(new PositionUtil(-17.3, 83.0, 107.5), new PositionUtil(-21.7, 86.5, 113.7))
    });

    calloutsMap.put("A Main", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-28.3, 84.0, 121.7), new PositionUtil(-42.7, 85.5, 108.3)),
        RegionUtil.createRegion(new PositionUtil(-44.3, 84.0, 108.3), new PositionUtil(-49.7, 85.5, 122.7)),
        RegionUtil.createRegion(new PositionUtil(-50.7, 84.0, 119.7), new PositionUtil(-50.7, 85.5, 114.3)),
        RegionUtil.createRegion(new PositionUtil(-48.7, 86.5, 107.3), new PositionUtil(-45.3, 85.0, 107.3))
    });

    calloutsMap.put("Outside A Main", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-57.6, 85.5, 119.7), new PositionUtil(-51.5, 84.0, 115.3)),
        RegionUtil.createRegion(new PositionUtil(-55.3, 84.0, 114.3), new PositionUtil(-57.5, 85.5, 114.3))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-58.3, 84.0, 119.7), new PositionUtil(-65.3, 85.5, 98.2)),
        RegionUtil.createRegion(new PositionUtil(-63.5, 84.0, 89.3), new PositionUtil(-59.4, 85.5, 97.3))
    });

    calloutsMap.put("Big Box", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-66.4, 84.0, 106.5), new PositionUtil(-72.6, 85.5, 113.6))
    });

    calloutsMap.put("Backsite A", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-65.4, 84.0, 119.7), new PositionUtil(-79.7, 88.0, 114.7)),
        RegionUtil.createRegion(new PositionUtil(-79.7, 84.0, 113.4), new PositionUtil(-73.6, 85.5, 102.3))
    });

    calloutsMap.put("Triple", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-65.4, 84.0, 97.5), new PositionUtil(-72.5, 88.5, 89.3))
    });

    calloutsMap.put("Temple", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-76.3, 86.5, 101.5), new PositionUtil(-84.7, 84.0, 83.3)),
        RegionUtil.createRegion(new PositionUtil(-75.3, 85.0, 99.7), new PositionUtil(-75.3, 86.5, 95.3)),
        RegionUtil.createRegion(new PositionUtil(-85.7, 86.5, 95.3), new PositionUtil(-85.7, 85.0, 99.7)),
        RegionUtil.createRegion(new PositionUtil(-82.3, 86.0, 100.7), new PositionUtil(-83.7, 87.0, 100.7))
    });

    calloutsMap.put("Tree", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-57.3, 86.0, 105.3), new PositionUtil(-55.3, 87.5, 113.5))
    });

    calloutsMap.put("Donut", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-57.3, 85.5, 100.7), new PositionUtil(-57.3, 87.0, 95.3)),
        RegionUtil.createRegion(new PositionUtil(-57.8, 84.5, 96.3), new PositionUtil(-47.5, 86.5, 99.7)),
        RegionUtil.createRegion(new PositionUtil(-52.7, 86.0, 100.7), new PositionUtil(-50.3, 87.5, 100.7)),
        RegionUtil.createRegion(new PositionUtil(-52.7, 86.0, 95.3), new PositionUtil(-50.3, 87.5, 95.3)),
        RegionUtil.createRegion(new PositionUtil(-35.3, 85.0, 92.3), new PositionUtil(-44.7, 86.5, 103.7)),
        RegionUtil.createRegion(new PositionUtil(-45.7, 85.0, 102.7), new PositionUtil(-45.7, 86.5, 93.3)),
        RegionUtil.createRegion(new PositionUtil(-46.7, 88.0, 94.3), new PositionUtil(-46.7, 85.0, 101.7)),
        RegionUtil.createRegion(new PositionUtil(-34.3, 85.0, 102.7), new PositionUtil(-34.3, 86.5, 93.3)),
        RegionUtil.createRegion(new PositionUtil(-33.3, 86.5, 102.7), new PositionUtil(-33.3, 86.5, 101.7)),
        RegionUtil.createRegion(new PositionUtil(-35.3, 83.0, 84.7), new PositionUtil(-41.7, 86.5, 91.6))
    });

    calloutsMap.put("Street", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-73.5, 84.0, 92.7), new PositionUtil(-76.7, 85.5, 81.6))
    });

    return calloutsMap.entrySet().stream()
        .map(entry -> new CalloutsUtil(entry.getKey(), entry.getValue()))
        .collect(Collectors.toList());
  }

}