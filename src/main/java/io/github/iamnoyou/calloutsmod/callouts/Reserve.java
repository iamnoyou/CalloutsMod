package io.github.iamnoyou.calloutsmod.callouts;


import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reserve {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("Tree Room", new RegionUtil[]{
        createRegion(new PositionUtil(30.3, 44.0, -262.7), new PositionUtil(51.7, 47.5, -252.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(100.7, 44.0, -270.3), new PositionUtil(80.3, 45.5, -282.7)),
        createRegion(new PositionUtil(80.0, 44.0, -263.0), new PositionUtil(58.3, 47.5, -284.137))
    });

    calloutsMap.put("CT Halls", new RegionUtil[]{
        createRegion(new PositionUtil(54.3, 44.0, -262.7), new PositionUtil(91.7, 47.0, -254.3))
    });

    calloutsMap.put("Truck", new RegionUtil[]{
        createRegion(new PositionUtil(101.3, 48.5, -262.137), new PositionUtil(92.0, 46.0, -255.3))
    });

    calloutsMap.put("Elektro", new RegionUtil[]{
        createRegion(new PositionUtil(101.301, 47.5, -262.137), new PositionUtil(108.7, 46.0, -243.0)),
        createRegion(new PositionUtil(101.3, 46.0, -252.7), new PositionUtil(99.3, 47.5, -243.0))
    });

    calloutsMap.put("A", new RegionUtil[]{
        createRegion(new PositionUtil(114.0, 47.5, -241.7), new PositionUtil(99.3, 46.0, -233.0)),
        createRegion(new PositionUtil(113.01, 46.0, -218.3), new PositionUtil(126.0, 47.5, -232.0))
    });

    calloutsMap.put("Forklift", new RegionUtil[]{
        createRegion(new PositionUtil(105.3, 46.0, -232.99), new PositionUtil(113.0, 48.0, -218.3)),
        createRegion(new PositionUtil(108.0, 50.0, -230.3), new PositionUtil(111.3, 52.0, -222.7))
    });

    calloutsMap.put("A Default", new RegionUtil[]{
        createRegion(new PositionUtil(124.0, 46.0, -234.3), new PositionUtil(122.3, 47.5, -237.0))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(116.0, 46.0, -241.7), new PositionUtil(127.99, 47.5, -237.01)),
        createRegion(new PositionUtil(127.99, 46.0, -232.0), new PositionUtil(124.01, 47.5, -236.99))
    });

    calloutsMap.put("Quad", new RegionUtil[]{
        createRegion(new PositionUtil(128.0, 46.0, -242.7), new PositionUtil(135.137, 47.5, -234.299)),
        createRegion(new PositionUtil(134.7, 46.0, -232.3), new PositionUtil(128.0, 46.0, -234.0))
    });

    calloutsMap.put("NBK", new RegionUtil[]{
        createRegion(new PositionUtil(135.137, 47.0, -233.7), new PositionUtil(134.7, 48.5, -232.3))
    });

    calloutsMap.put("Shroud", new RegionUtil[]{
        createRegion(new PositionUtil(124.7, 50.0, -225.3), new PositionUtil(127.7, 52.0, -218.3))
    });

    calloutsMap.put("Squeaky", new RegionUtil[]{
        createRegion(new PositionUtil(129.3, 46.0, -230.0), new PositionUtil(135.7, 49.5, -199.3)),
        createRegion(new PositionUtil(127.7, 46.0, -204.7), new PositionUtil(122.0, 49.2, -194.3)),
        createRegion(new PositionUtil(122.0, 46.0, -201.7), new PositionUtil(117.3, 49.2, -194.3))
    });

    calloutsMap.put("A Long", new RegionUtil[]{
        createRegion(new PositionUtil(116.99, 47.5, -193.3), new PositionUtil(87.0, 44.0, -199.7))
    });

    calloutsMap.put("A Main", new RegionUtil[]{
        createRegion(new PositionUtil(84.3, 44.0, -205.7), new PositionUtil(87.0, 47.5, -212.7)),
        createRegion(new PositionUtil(87.0, 46.0, -215.7), new PositionUtil(126.7, 51.0, -208.0)),
        createRegion(new PositionUtil(126.7, 46.0, -208.0), new PositionUtil(121.0, 47.5, -206.0)),
        createRegion(new PositionUtil(120.7, 46.0, -202.3), new PositionUtil(111.3, 47.5, -208.0))
    });

    calloutsMap.put("Lockers", new RegionUtil[]{
        createRegion(new PositionUtil(110.99, 47.0, -207.99), new PositionUtil(108.3, 50.5, -203.3))
    });

    calloutsMap.put("Boost", new RegionUtil[]{
        createRegion(new PositionUtil(83.0, 44.0, -202.7), new PositionUtil(79.3, 50.0, -211.0)),
        createRegion(new PositionUtil(82.0, 49.0, -203.0), new PositionUtil(86.7, 52.5, -215.0))
    });

    calloutsMap.put("Ticket Booth", new RegionUtil[]{
        createRegion(new PositionUtil(92.0, 50.0, -239.0), new PositionUtil(99.0, 52.0, -242.7))
    });

    calloutsMap.put("Heaven", new RegionUtil[]{
        createRegion(new PositionUtil(50.0, 44.0, -250.7), new PositionUtil(40.3, 50.5, -247.3)),
        createRegion(new PositionUtil(40.7, 49.0, -247.0), new PositionUtil(52.075, 50.5, -238.7))
    });

    calloutsMap.put("Catwalk", new RegionUtil[]{
        createRegion(new PositionUtil(107.99, 53.0, -237.3), new PositionUtil(104.3, 50.0, -218.3)),
        createRegion(new PositionUtil(108.3, 53.0, -237.3), new PositionUtil(97.576, 50.0, -235.3))
    });

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(76.7, 44.0, -139.3), new PositionUtil(52.3, 49.5, -171.7)),
        createRegion(new PositionUtil(63.3, 44.0, -170.3), new PositionUtil(90.7, 47.5, -179.7)),
        createRegion(new PositionUtil(32.3, 44.0, -187.7), new PositionUtil(52.7, 45.5, -161.3)),
        createRegion(new PositionUtil(63.3, 44.0, -181.7), new PositionUtil(78.7, 46.5, -180.3))
    });

    calloutsMap.put("Garage", new RegionUtil[]{
        createRegion(new PositionUtil(78.299, 44.0, -182.66), new PositionUtil(64.3, 47.5, -208.7))
    });

    calloutsMap.put("Useless", new RegionUtil[]{
        createRegion(new PositionUtil(62.7, 44.0, -196.3), new PositionUtil(55.3, 45.5, -207.7))
    });

    calloutsMap.put("B Main", new RegionUtil[]{
        createRegion(new PositionUtil(49.7, 44.0, -189.3), new PositionUtil(43.3, 45.5, -199.7)),
        createRegion(new PositionUtil(54.7, 44.0, -205.7), new PositionUtil(33.3, 45.5, -200.3)),
        createRegion(new PositionUtil(33.3, 44.0, -200.3), new PositionUtil(40.7, 46.0, -222.7)),
        createRegion(new PositionUtil(52.7, 44.0, 223.7), new PositionUtil(40.7, 46.0, -214.7))
    });

    calloutsMap.put("Sun Room", new RegionUtil[]{
        createRegion(new PositionUtil(32.7, 44.0, -198.3), new PositionUtil(23.3, 48.5, -217.7))
    });

    calloutsMap.put("Checkers", new RegionUtil[]{
        createRegion(new PositionUtil(53.3, 44.0, -219.3), new PositionUtil(59.7, 46.5, -244.7)),
        createRegion(new PositionUtil(54.3, 44.0, -237.3), new PositionUtil(54.3, 45.5, -235.3))
    });

    calloutsMap.put("Pit", new RegionUtil[]{
        createRegion(new PositionUtil(33.3, 42.0, -228.3), new PositionUtil(37.7, 45.5, -231.7))
    });

    calloutsMap.put("Headshot", new RegionUtil[]{
        createRegion(new PositionUtil(21.3, 44.0, -244.7), new PositionUtil(32.7, 47.5, -242.3))
    });

    calloutsMap.put("Back Left", new RegionUtil[]{
        createRegion(new PositionUtil(21.3, 45.0, -228.3), new PositionUtil(25.7, 48.5, -233.7))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(21.3, 45.0, -241.7), new PositionUtil(32.7, 49.5, -234.3)),
        createRegion(new PositionUtil(26.3, 45.0, -233.7), new PositionUtil(32.3, 47.0, -228.3)),
        createRegion(new PositionUtil(34.7, 44.0, -236.7), new PositionUtil(32.3, 47.0, -232.3))
    });

    calloutsMap.put("B", new RegionUtil[]{
        createRegion(new PositionUtil(51.7, 44.0, -228.0), new PositionUtil(35.3, 45.5, -244.7)),
        createRegion(new PositionUtil(34.7, 44.0, -244.7), new PositionUtil(33.3, 46.5, -237.3))
    });

    calloutsMap.put("Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(86.7, 44.0, -216.7), new PositionUtil(80.0, 45.5, -211.3))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(79.8, 44.0, -211.3), new PositionUtil(63.316, 47.0, -216.8)),
        createRegion(new PositionUtil(79.7, 44.0, -218.114), new PositionUtil(68.3, 45.5, -219.8)),
        createRegion(new PositionUtil(68.3, 44.0, -220.1), new PositionUtil(78.1, 45.5, -231.7)),
        createRegion(new PositionUtil(72.3, 44.0, -241.7), new PositionUtil(76.6, 45.5, -232.0)),
        createRegion(new PositionUtil(71.9, 44.0, -232.0), new PositionUtil(68.0, 45.5, -238.7)),
        createRegion(new PositionUtil(67.9, 44.0, -233.0), new PositionUtil(63.3, 45.5, -239.7))
    });

    calloutsMap.put("Vent", new RegionUtil[]{
        createRegion(new PositionUtil(63.1, 47.5, -216.3), new PositionUtil(59.3, 48.0, -222.1))
    });

    calloutsMap.put("Mid House", new RegionUtil[]{
        createRegion(new PositionUtil(69.2, 48.0, -216.7), new PositionUtil(63.3, 51.5, -231.2))
    });

    calloutsMap.put("Rail", new RegionUtil[]{
        createRegion(new PositionUtil(79.7, 48.0, -219.7), new PositionUtil(79.0, 49.5, -232.2))
    });

    calloutsMap.put("Sand Bags", new RegionUtil[]{
        createRegion(new PositionUtil(68.0, 44.0, -233.1), new PositionUtil(63.3, 45.5, -230.3))
    });

    calloutsMap.put("Z", new RegionUtil[]{
        createRegion(new PositionUtil(64.7, 46.0, -238.7), new PositionUtil(72.2, 44.5, -241.6)),
        createRegion(new PositionUtil(63.3, 46.5, -242.0), new PositionUtil(75.7, 44.0, -254.0))
    });

    calloutsMap.put("White Box", new RegionUtil[]{
        createRegion(new PositionUtil(76.7, 46.5, -231.7), new PositionUtil(79.7, 48.0, -235.2)),
        createRegion(new PositionUtil(81.2, 45.5, -237.2), new PositionUtil(78.8, 47.0, -235.3))
    });

    calloutsMap.put("Highway", new RegionUtil[]{
        createRegion(new PositionUtil(80.3, 44.5, -242.7), new PositionUtil(92.9, 47.5, -235.3)),
        createRegion(new PositionUtil(76.9, 44.0, -235.3), new PositionUtil(79.5, 44.0, -241.6))
    });

    calloutsMap.put("Top A", new RegionUtil[]{
        createRegion(new PositionUtil(113.7, 51.5, -237.3), new PositionUtil(124.3, 49.0, -231.7))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        createRegion(new PositionUtil(75.7, 47.0, -244.3), new PositionUtil(71.7, 48.5, -245.3))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}