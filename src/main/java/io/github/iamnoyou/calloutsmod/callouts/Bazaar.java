package io.github.iamnoyou.calloutsmod.callouts;

import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bazaar {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(188.3, 71.0, 35.7), new PositionUtil(196.7, 73.0, 22.0))
    });

    calloutsMap.put("CT", new RegionUtil[]{
        createRegion(new PositionUtil(160.3, 74.0, 21.7), new PositionUtil(208.7, 74.0, 16.0)),
        createRegion(new PositionUtil(211.7, 76.5, 5.0), new PositionUtil(200.0, 72.0, 14.0))
    });

    calloutsMap.put("Trash", new RegionUtil[]{
        createRegion(new PositionUtil(201.3, 74.5, 4.99), new PositionUtil(204.0, 76.5, 3.3))
    });

    calloutsMap.put("Ticket Booth", new RegionUtil[]{
        createRegion(new PositionUtil(212.7, 75.0, 5.0), new PositionUtil(208.0, 80.5, -2.3))
    });

    calloutsMap.put("A", new RegionUtil[]{
        createRegion(new PositionUtil(207.0, 75.0, 1.0), new PositionUtil(200.3, 76.5, -2.0)),
        createRegion(new PositionUtil(196.001, 75.0, -22.99), new PositionUtil(187.0, 76.5, -2.3)),
        createRegion(new PositionUtil(186.0, 75.0, -8.0), new PositionUtil(176.3, 76.5, -0.3))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(201.0, 75.0, -1.3), new PositionUtil(211.7, 76.5, -11.7)),
        createRegion(new PositionUtil(200.0, 75.0, -12.0), new PositionUtil(203.0, 76.5, -21.7)),
        createRegion(new PositionUtil(196.001, 75.0, -15.99), new PositionUtil(198.99, 76.5, -12.001))
    });

    calloutsMap.put("Fire Box", new RegionUtil[]{
        createRegion(new PositionUtil(203.001, 75.0, -21.7), new PositionUtil(206.7, 78.5, -13.0))
    });

    calloutsMap.put("Double", new RegionUtil[]{
        createRegion(new PositionUtil(196.0, 75.0, -16.0), new PositionUtil(200.0, 78.5, -20.0))
    });

    calloutsMap.put("Triple", new RegionUtil[]{
        createRegion(new PositionUtil(201.0, 75.0, -5.0), new PositionUtil(196.0, 79.5, -12.0))
    });

    calloutsMap.put("Dark", new RegionUtil[]{
        createRegion(new PositionUtil(193.3, 75.0, -23.0), new PositionUtil(200.7, 76.5, -27.7))
    });

    calloutsMap.put("Scaffolding", new RegionUtil[]{
        createRegion(new PositionUtil(189.0, 76.0, -23.0), new PositionUtil(201.0, 80.5, -27.7))
    });

    calloutsMap.put("Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(176.3, 75.5, -7.7), new PositionUtil(186.3, 79.5, -15.299))
    });

    calloutsMap.put("Sandwich", new RegionUtil[]{
        createRegion(new PositionUtil(186.0, 75.0, -15.3), new PositionUtil(182.3, 77.0, -17.7))
    });

    calloutsMap.put("Tetris", new RegionUtil[]{
        createRegion(new PositionUtil(185.0, 79.0, -18.0), new PositionUtil(181.3, 75.0, -22.0))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(181.0, 76.5, -25.0), new PositionUtil(189.7, 71.0, -35.0))
    });

    calloutsMap.put("Outside Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(174.0, 71.0, -42.7), new PositionUtil(189.7, 72.5, -35.0))
    });

    calloutsMap.put("Palace", new RegionUtil[]{
        createRegion(new PositionUtil(201.0, 79.0, -23.2), new PositionUtil(206.7, 80.5, -26.0)),
        createRegion(new PositionUtil(206.7, 79.0, -26.0), new PositionUtil(204.3, 80.5, -30.0)),
        createRegion(new PositionUtil(194.0, 79.5, -47.3), new PositionUtil(179.3, 74.0, -50.0)),
        createRegion(new PositionUtil(179.3, 74.0, -50.0), new PositionUtil(182.0, 75.5, -59.7))
    });

    calloutsMap.put("Pillars", new RegionUtil[]{
        createRegion(new PositionUtil(206.7, 80.5, -30.0), new PositionUtil(194.0, 78.0, -51.7))
    });

    calloutsMap.put("T Roof", new RegionUtil[]{
        createRegion(new PositionUtil(174.0, 74.0, -55.7), new PositionUtil(177.0, 76.5, -42.7)),
        createRegion(new PositionUtil(177.0, 76.5, -42.7), new PositionUtil(188.7, 74.5, -45.7))
    });

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(173.3, 71.0, -39.3), new PositionUtil(132.7, 76.5, -62.7))
    });

    calloutsMap.put("Side Alley", new RegionUtil[]{
        createRegion(new PositionUtil(131.7, 74.0, -59.7), new PositionUtil(117.3, 71.0, -48.3)),
        createRegion(new PositionUtil(121.3, 71.0, -47.3), new PositionUtil(126.5, 72.5, -27.3)),
        createRegion(new PositionUtil(143.7, 75.0, -25.3), new PositionUtil(131.7, 71.5, -30.7)),
        createRegion(new PositionUtil(131.7, 71.5, -30.7), new PositionUtil(126.5, 72.5, -27.3))
    });

    calloutsMap.put("Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(129.3, 71.5, -25.3), new PositionUtil(130.7, 73.0, -26.7))
    });

    calloutsMap.put("Cart", new RegionUtil[]{
        createRegion(new PositionUtil(120.7, 71.0, -32.7), new PositionUtil(117.3, 72.5, -25.3))
    });

    calloutsMap.put("Apartments Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(120.3, 71.0, -52.7), new PositionUtil(117.3, 76.5, -33.925)),
        createRegion(new PositionUtil(116.3, 75.0, -38.7), new PositionUtil(116.3, 76.5, -35.3))
    });

    calloutsMap.put("TV", new RegionUtil[]{
        createRegion(new PositionUtil(115.7, 77.5, -38.7), new PositionUtil(111.3, 75.0, -19.3))
    });

    calloutsMap.put("Underpass", new RegionUtil[]{
        createRegion(new PositionUtil(126.7, 77.5, -18.7), new PositionUtil(123.3, 68.0, 5.7)),
        createRegion(new PositionUtil(127.0, 68.0, 5.7), new PositionUtil(154.0, 72.0, 3.3))
    });

    calloutsMap.put("Back Alley", new RegionUtil[]{
        createRegion(new PositionUtil(110.3, 75.0, -18.7), new PositionUtil(122.7, 77.5, 3.7))
    });

    calloutsMap.put("Kitchen", new RegionUtil[]{
        createRegion(new PositionUtil(126.7, 76.0, 9.7), new PositionUtil(118.3, 77.5, 4.3))
    });

    calloutsMap.put("B Apartments", new RegionUtil[]{
        createRegion(new PositionUtil(118.0, 76.0, 4.3), new PositionUtil(111.3, 79.0, 28.0))
    });

    calloutsMap.put("B Plat", new RegionUtil[]{
        createRegion(new PositionUtil(118.3, 77.0, 33.3), new PositionUtil(111.3, 79.8, 28.3))
    });

    calloutsMap.put("Van", new RegionUtil[]{
        createRegion(new PositionUtil(117.0, 75.0, 33.3), new PositionUtil(111.3, 80.0, 41.137))
    });

    calloutsMap.put("Bench", new RegionUtil[]{
        createRegion(new PositionUtil(121.3, 74.0, 42.0), new PositionUtil(134.7, 77.5, 46.7))
    });

    calloutsMap.put("B", new RegionUtil[]{
        createRegion(new PositionUtil(118.3, 74.0, 18.3), new PositionUtil(124.99, 75.5, 41.99)),
        createRegion(new PositionUtil(124.99, 75.5, 41.99), new PositionUtil(146.7, 74.0, 38.0)),
        createRegion(new PositionUtil(146.7, 74.0, 38.0), new PositionUtil(138.001, 75.5, 22.0)),
        createRegion(new PositionUtil(138.0, 74.0, 24.7), new PositionUtil(125.0, 75.5, 18.0))
    });

    calloutsMap.put("B Default", new RegionUtil[]{
        createRegion(new PositionUtil(129.0, 74.0, 29.3), new PositionUtil(126.0, 75.5, 32.7))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(128.3, 74.0, 36.7), new PositionUtil(129.0, 74.0, 33.0)),
        createRegion(new PositionUtil(132.7, 74.0, 26.0), new PositionUtil(129.3, 75.5, 37.0)),
        createRegion(new PositionUtil(133.0, 74.0, 28.3), new PositionUtil(135.0, 75.5, 36.7)),
        createRegion(new PositionUtil(135.0, 75.5, 36.7), new PositionUtil(136.7, 74.0, 29.0))
    });

    calloutsMap.put("Empty", new RegionUtil[]{
        createRegion(new PositionUtil(136.7, 74.0, 29.0), new PositionUtil(135.3, 75.5, 26.3))
    });

    calloutsMap.put("Short Corner", new RegionUtil[]{
        createRegion(new PositionUtil(124.0, 74.0, 13.0), new PositionUtil(122.3, 75.5, 11.3))
    });

    calloutsMap.put("Arches", new RegionUtil[]{
        createRegion(new PositionUtil(124.0, 74.0, 11.3), new PositionUtil(134.7, 75.5, 18.0)),
        createRegion(new PositionUtil(124.0, 74.0, 13.0), new PositionUtil(122.3, 75.5, 18.0))
    });

    calloutsMap.put("E Box", new RegionUtil[]{
        createRegion(new PositionUtil(135.0, 77.5, 18.3), new PositionUtil(146.7, 74.0, 21.7))
    });

    calloutsMap.put("Door", new RegionUtil[]{
        createRegion(new PositionUtil(153.0, 74.0, 41.7), new PositionUtil(147.0, 75.5, 39.3))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        createRegion(new PositionUtil(147.0, 76.5, 26.7), new PositionUtil(149.0, 74.0, 25.0))
    });

    calloutsMap.put("Market", new RegionUtil[]{
        createRegion(new PositionUtil(149.0, 74.0, 24.3), new PositionUtil(153.0, 76.5, 32.7)),
        createRegion(new PositionUtil(158.0, 74.0, 18.3), new PositionUtil(153.3, 76.5, 37.0)),
        createRegion(new PositionUtil(156.7, 74.0, 37.0), new PositionUtil(153.001, 75.5, 41.7))
    });

    calloutsMap.put("Sneaky", new RegionUtil[]{
        createRegion(new PositionUtil(157.0, 74.0, 37.3), new PositionUtil(157.7, 75.5, 40.7))
    });

    calloutsMap.put("Short", new RegionUtil[]{
        createRegion(new PositionUtil(130.3, 74.0, 11.0), new PositionUtil(136.0, 75.5, -2.7)),
        createRegion(new PositionUtil(136.0, 75.5, -2.7), new PositionUtil(149.0, 74.0, 1.7)),
        createRegion(new PositionUtil(142.3, 74.0, -3.0), new PositionUtil(149.0, 76.3, -5.7))
    });

    calloutsMap.put("Ladder Room", new RegionUtil[]{
        createRegion(new PositionUtil(139.3, 74.0, 2.0), new PositionUtil(145.0, 78.0, 9.7))
    });

    calloutsMap.put("Vent", new RegionUtil[]{
        createRegion(new PositionUtil(145.0, 77.5, 9.7), new PositionUtil(152.0, 76.0, 9.3))
    });

    calloutsMap.put("Snipers Nest", new RegionUtil[]{
        createRegion(new PositionUtil(152.3, 74.0, 8.3), new PositionUtil(172.7, 76.5, 12.7)),
        createRegion(new PositionUtil(154.0, 74.5, 8.0), new PositionUtil(158.0, 76.0, 6.0))
    });

    calloutsMap.put("Murder Hole", new RegionUtil[]{
        createRegion(new PositionUtil(166.3, 74.0, 13.0), new PositionUtil(168.0, 75.5, 15.0))
    });

    calloutsMap.put("Boost", new RegionUtil[]{
        createRegion(new PositionUtil(160.7, 71.0, 6.7), new PositionUtil(157.0, 74.0, 5.0))
    });

    calloutsMap.put("Mid Bench", new RegionUtil[]{
        createRegion(new PositionUtil(160.0, 71.5, 3.0), new PositionUtil(160.7, 73.5, 0.0))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        createRegion(new PositionUtil(154.3, 70.5, -0.3), new PositionUtil(159.999, 75.5, -23.0)),
        createRegion(new PositionUtil(159.999, 75.5, -23.0), new PositionUtil(160.7, 71.0, -0.3))
    });

    calloutsMap.put("Bottom Mid", new RegionUtil[]{
        createRegion(new PositionUtil(154.3, 69.5, -0.2), new PositionUtil(160.7, 71.0, 4.99))
    });

    calloutsMap.put("Chair", new RegionUtil[]{
        createRegion(new PositionUtil(165.7, 74.0, -11.3), new PositionUtil(161.001, 76.0, -20.7))
    });

    calloutsMap.put("Top Mid", new RegionUtil[]{
        createRegion(new PositionUtil(145.3, 74.0, -33.7), new PositionUtil(153.0, 75.5, -23.0)),
        createRegion(new PositionUtil(164.0, 74.0, -25.3), new PositionUtil(165.7, 75.5, -33.7))
    });

    calloutsMap.put("Mid Boxes", new RegionUtil[]{
        createRegion(new PositionUtil(153.001, 74.0, -34.7), new PositionUtil(163.7, 78.0, -25.0))
    });

    calloutsMap.put("Connector", new RegionUtil[]{
        createRegion(new PositionUtil(161.001, 71.0, -2.3), new PositionUtil(176.0, 76.5, -5.7)),
        createRegion(new PositionUtil(174.7, 77.5, -6.0), new PositionUtil(163.3, 75.0, -8.7)),
        createRegion(new PositionUtil(163.3, 74.0, -0.3), new PositionUtil(173.7, 77.5, -2.0))
    });

    calloutsMap.put("Jungle", new RegionUtil[]{
        createRegion(new PositionUtil(175.3, 74.0, 12.7), new PositionUtil(184.7, 76.5, 0.0))
    });

    calloutsMap.put("Catwalk", new RegionUtil[]{
        createRegion(new PositionUtil(154.0, 74.0, -23.0), new PositionUtil(149.0, 77.0, 1.7))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}