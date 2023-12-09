package io.github.iamnoyou.calloutsmod.callouts;

import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Alleyway {

  public static List<CalloutsUtil> createCalloutsList() {
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("T Spawn", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-818.6, 79.0, -150.7), new PositionUtil(-828.7, 84.5, -118.3)),
        RegionUtil.createRegion(new PositionUtil(-829.5, 80.0, -119.3), new PositionUtil(-830.6, 81.5, -121.7)),
        RegionUtil.createRegion(new PositionUtil(-831.7, 81.5, -118.3), new PositionUtil(-842.7, 79.0, -133.6)),
        RegionUtil.createRegion(new PositionUtil(-849.7, 78.0, -134.3), new PositionUtil(-840.3, 81.5, -153.7)),
        RegionUtil.createRegion(new PositionUtil(-839.3, 79.0, -148.3), new PositionUtil(-839.3, 80.5, -149.7)),
        RegionUtil.createRegion(new PositionUtil(-844.3, 82.5, -133.3), new PositionUtil(-846.7, 79.5, -133.4)),
        RegionUtil.createRegion(new PositionUtil(-839.3, 80.5, -134.3), new PositionUtil(-834.6, 78.0, -146.7)),
        RegionUtil.createRegion(new PositionUtil(-833.5, 78.0, -143.3), new PositionUtil(-825.7, 80.5, -146.7)),
        RegionUtil.createRegion(new PositionUtil(-833.7, 81.5, -147.7), new PositionUtil(-829.3, 78.5, -147.7))
    });

    calloutsMap.put("Hay Bales", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-817.7, 79.0, -150.3), new PositionUtil(-812.7, 83.5, -153.7))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-811.7, 79.5, -150.3), new PositionUtil(-803.5, 83.5, -153.7))
    });

    calloutsMap.put("T Stairs", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-817.2, 79.0, -149.3), new PositionUtil(-813.0, 82.5, -143.3)),
        RegionUtil.createRegion(new PositionUtil(-817.7, 81.0, -142.5), new PositionUtil(-816.4, 85.5, -132.3))
    });

    calloutsMap.put("Living Room", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-815.5, 84.0, -132.3), new PositionUtil(-810.3, 86.5, -141.7)),
        RegionUtil.createRegion(new PositionUtil(-809.6, 84.0, -139.7), new PositionUtil(-809.6, 85.5, -137.3)),
        RegionUtil.createRegion(new PositionUtil(-813.6, 84.5, -131.6), new PositionUtil(-811.3, 85.5, -131.5)),
        RegionUtil.createRegion(new PositionUtil(-808.4, 84.0, -137.5), new PositionUtil(-797.3, 86.5, -140.7)),
        RegionUtil.createRegion(new PositionUtil(-808.4, 84.0, -137.5), new PositionUtil(-797.3, 86.5, -140.7))
    });

    calloutsMap.put("Kitchen", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-808.7, 84.0, -136.3), new PositionUtil(-805.3, 85.5, -135.3)),
        RegionUtil.createRegion(new PositionUtil(-808.7, 84.0, -136.3), new PositionUtil(-805.3, 85.5, -135.3))
    });

    calloutsMap.put("T Balcony", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-803.7, 85.0, -130.6), new PositionUtil(-796.3, 87.0, -135.7))
    });

    calloutsMap.put("Bridge", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-810.9, 84.0, -130.7), new PositionUtil(-814.9, 87.5, -124.3))
    });

    calloutsMap.put("Alt Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-817.4, 80.0, -130.7), new PositionUtil(-782.7, 84.0, -124.6))
    });

    calloutsMap.put("Apartment Stairs", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-784.7, 82.0, -135.7), new PositionUtil(-779.3, 86.0, -129.8))
    });

    calloutsMap.put("Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-779.3, 82.0, -136.7), new PositionUtil(-784.7, 85.0, -141.3)),
        RegionUtil.createRegion(new PositionUtil(-793.3, 82.0, -149.7), new PositionUtil(-770.5, 84.5, -142.3))
    });

    calloutsMap.put("Bottom Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-803.6, 82.0, -149.4), new PositionUtil(-794.4, 85.0, -142.3)),
        RegionUtil.createRegion(new PositionUtil(-803.7, 82.0, -149.5), new PositionUtil(-799.3, 85.0, -154.3))
    });

    calloutsMap.put("Back Alley", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-796.7, 82.0, -123.5), new PositionUtil(-784.1, 84.0, -110.3)),
        RegionUtil.createRegion(new PositionUtil(-796.7, 82.0, -123.6), new PositionUtil(-794.3, 83.5, -113.6))
    });

    calloutsMap.put("T Apartments", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-797.5, 82.0, -117.3), new PositionUtil(-814.7, 86.5, -123.3)),
        RegionUtil.createRegion(new PositionUtil(-814.7, 86.5, -116.3), new PositionUtil(-812.3, 84.0, -114.3)),
        RegionUtil.createRegion(new PositionUtil(-811.3, 84.5, -123.5), new PositionUtil(-813.7, 86.0, -123.5))
    });

    calloutsMap.put("Mexico", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-795.7, 79.5, -131.8), new PositionUtil(-795.3, 80.0, -149.7))
    });

    calloutsMap.put("Bench", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-781.3, 82.0, -149.7), new PositionUtil(-785.7, 87.0, -149.7))
    });

    calloutsMap.put("Top Mid", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-769.7, 83.0, -141.3), new PositionUtil(-764.3, 85.0, -149.7)),
        RegionUtil.createRegion(new PositionUtil(-764.3, 83.0, -140.7), new PositionUtil(-769.7, 87.0, -134.7))
    });

    calloutsMap.put("Lane", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-769.7, 83.0, -133.5), new PositionUtil(-756.8, 84.5, -127.3))
    });

    calloutsMap.put("Patio", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-769.7, 86.5, -130.8), new PositionUtil(-755.5, 88.5, -127.3))
    });

    calloutsMap.put("Truck", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-755.4, 83.0, -127.3), new PositionUtil(-745.6, 88.0, -130.5))
    });

    calloutsMap.put("Pit", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-735.3, 82.0, -129.7), new PositionUtil(-739.3, 84.5, -116.3))
    });

    calloutsMap.put("Side Pit", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-740.4, 83.0, -116.3), new PositionUtil(-748.7, 84.5, -119.6))
    });

    calloutsMap.put("Under Balcony", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-746.5, 82.0, -120.4), new PositionUtil(-750.7, 84.5, -126.7))
    });

    calloutsMap.put("Close Apartments", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-751.5, 86.0, -125.7), new PositionUtil(-754.6, 88.0, -119.3))
    });

    calloutsMap.put("Balcony", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-746.7, 86.0, -120.7), new PositionUtil(-750.7, 88.5, -126.4))
    });

    calloutsMap.put("Apartments", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-755.5, 86.0, -121.6), new PositionUtil(-770.2, 87.5, -119.3)),
        RegionUtil.createRegion(new PositionUtil(-771.3, 86.0, -122.6), new PositionUtil(-773.5, 87.5, -130.2))
    });

    calloutsMap.put("Window", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-775.3, 86.0, -131.7), new PositionUtil(-780.6, 88.0, -123.3)),
        RegionUtil.createRegion(new PositionUtil(-774.5, 86.0, -130.7), new PositionUtil(-774.5, 88.0, -129.3))
    });

    calloutsMap.put("Bedroom", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-775.3, 86.0, -120.7), new PositionUtil(-777.7, 87.5, -116.3)),
        RegionUtil.createRegion(new PositionUtil(-774.5, 86.0, -119.7), new PositionUtil(-774.6, 87.5, -118.4))
    });

    calloutsMap.put("T Boiler", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-771.3, 85.0, -117.5), new PositionUtil(-773.7, 83.0, -109.8)),
        RegionUtil.createRegion(new PositionUtil(-781.7, 82.0, -122.6), new PositionUtil(-779.3, 84.5, -107.3)),
        RegionUtil.createRegion(new PositionUtil(-783.7, 82.0, -107.3), new PositionUtil(-782.7, 85.5, -116.7))
    });

    calloutsMap.put("Graveyard", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-739.6, 83.0, -130.5), new PositionUtil(-736.6, 88.5, -145.7))
    });

    calloutsMap.put("Close Left", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-752.7, 84.0, -135.3), new PositionUtil(-754.7, 87.5, -135.3))
    });

    calloutsMap.put("Backsite A", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-753.2, 84.0, -138.5), new PositionUtil(-754.7, 87.0, -150.3))
    });

    calloutsMap.put("Front A", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-740.4, 83.0, -134.4), new PositionUtil(-745.0, 85.5, -149.4))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-751.5, 84.0, -149.7), new PositionUtil(-746.5, 88.0, -134.4))
    });

    calloutsMap.put("Moto", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-745.7, 84.0, -150.4), new PositionUtil(-739.4, 85.5, -157.7))
    });

    calloutsMap.put("A Long", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-740.3, 84.0, -158.7), new PositionUtil(-764.3, 85.5, -163.7)),
        RegionUtil.createRegion(new PositionUtil(-765.8, 85.5, -160.6), new PositionUtil(-769.7, 84.0, -151.6)),
        RegionUtil.createRegion(new PositionUtil(-764.3, 84.0, -151.3), new PositionUtil(-764.3, 85.5, -156.7))
    });

    calloutsMap.put("Cubby", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-769.4, 85.5, -161.3), new PositionUtil(-770.7, 84.0, -163.1))
    });

    calloutsMap.put("Boiler", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-773.7, 87.0, -132.7), new PositionUtil(-769.4, 83.0, -139.7))
    });

    calloutsMap.put("Library", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-737.7, 84.0, -159.3), new PositionUtil(-732.3, 85.5, -159.4)),
        RegionUtil.createRegion(new PositionUtil(-739.7, 84.0, -160.3), new PositionUtil(-732.3, 86.5, -166.7)),
    });

    calloutsMap.put("CT Kitchen", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-733.7, 84.0, -170.3), new PositionUtil(-733.3, 86.5, -174.3)),
        RegionUtil.createRegion(new PositionUtil(-734.3, 84.0, -167.5), new PositionUtil(-743.7, 86.5, -173.3)),
    });

    calloutsMap.put("Arch", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-759.6, 84.0, -182.7), new PositionUtil(-755.3, 86.5, -163.9))
    });

    calloutsMap.put("Speedway", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-760.6, 84.0, -175.3), new PositionUtil(-761.7, 86.5, -202.9)),
        RegionUtil.createRegion(new PositionUtil(-758.7, 83.0, -202.6), new PositionUtil(-759.3, 86.5, -184.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-754.5, 86.5, -182.7), new PositionUtil(-735.3, 83.0, -195.7)),
        RegionUtil.createRegion(new PositionUtil(-740.3, 83.0, -196.4), new PositionUtil(-756.7, 87.0, -208.7)),
        RegionUtil.createRegion(new PositionUtil(-753.6, 84.0, -181.4), new PositionUtil(-731.7, 87.5, -175.3)),
        RegionUtil.createRegion(new PositionUtil(-742.3, 84.0, -174.6), new PositionUtil(-743.7, 85.5, -174.6))
    });

    calloutsMap.put("Ice Cream", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-759.5, 83.0, -203.3), new PositionUtil(-773.3, 86.5, -208.7))
    });

    calloutsMap.put("Tree", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-769.3, 83.0, -202.7), new PositionUtil(-772.5, 84.5, -201.3))
    });

    calloutsMap.put("CT", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-773.5, 83.0, -204.2), new PositionUtil(-781.4, 84.5, -201.3)),
        RegionUtil.createRegion(new PositionUtil(-774.7, 83.0, -208.3), new PositionUtil(-776.7, 84.5, -205.5))
    });

    calloutsMap.put("Construction", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-772.3, 83.0, -211.3), new PositionUtil(-781.7, 86.0, -220.7)),
        RegionUtil.createRegion(new PositionUtil(-779.3, 83.0, -210.7), new PositionUtil(-781.7, 86.0, -207.3)),
        RegionUtil.createRegion(new PositionUtil(-771.3, 83.0, -212.3), new PositionUtil(-771.3, 84.5, -213.7)),
        RegionUtil.createRegion(new PositionUtil(-782.6, 83.0, -219.7), new PositionUtil(-783.3, 84.5, -218.3))
    });

    calloutsMap.put("Sand Bags", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-782.4, 83.5, -211.3), new PositionUtil(-788.7, 87.5, -215.7))
    });

    calloutsMap.put("Garden", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-794.7, 86.5, -218.6), new PositionUtil(-784.3, 85.0, -224.7))
    });

    calloutsMap.put("Coffin", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-794.5, 84.0, -211.7), new PositionUtil(-790.3, 87.5, -217.3))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-790.3, 84.0, -209.7), new PositionUtil(-801.7, 90.0, -200.6)),
        RegionUtil.createRegion(new PositionUtil(-800.7, 84.0, -212.3), new PositionUtil(-795.7, 85.5, -211.5)),
        RegionUtil.createRegion(new PositionUtil(-798.3, 84.0, -213.7), new PositionUtil(-799.7, 85.5, -213.7)),
        RegionUtil.createRegion(new PositionUtil(-801.7, 84.0, -200.5), new PositionUtil(-789.7, 89.0, -198.6)),
        RegionUtil.createRegion(new PositionUtil(-789.5, 83.5, -200.3), new PositionUtil(-789.5, 86.0, -208.7))
    });

    calloutsMap.put("Dark", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-802.5, 84.0, -208.7), new PositionUtil(-806.7, 90.0, -212.7)),
        RegionUtil.createRegion(new PositionUtil(-805.7, 84.0, -213.7), new PositionUtil(-804.3, 85.5, -213.7))
    });

    calloutsMap.put("Backsite B", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-802.7, 84.0, -207.5), new PositionUtil(-807.7, 85.5, -203.3))
    });

    calloutsMap.put("Quad", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-803.3, 84.0, -202.3), new PositionUtil(-806.7, 85.5, -196.3))
    });

    calloutsMap.put("2nd", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-798.7, 84.0, -200.3), new PositionUtil(-802.5, 85.5, -196.3))
    });

    calloutsMap.put("Boost", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-798.0, 87.5, -198.3), new PositionUtil(-794.7, 90.0, -197.3))
    });

    calloutsMap.put("1st", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-794.7, 84.0, -197.7), new PositionUtil(-789.7, 90.0, -196.3))
    });

    calloutsMap.put("Grill", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-788.7, 83.0, -205.7), new PositionUtil(-784.3, 86.5, -208.7))
    });

    calloutsMap.put("Front B", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-782.7, 83.0, -204.7), new PositionUtil(-788.7, 84.5, -195.3)),
        RegionUtil.createRegion(new PositionUtil(-781.3, 83.0, -195.7), new PositionUtil(-781.3, 84.0, -194.3))
    });

    calloutsMap.put("Top Banana", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-783.5, 83.0, -194.9), new PositionUtil(-783.3, 86.5, -181.3)),
        RegionUtil.createRegion(new PositionUtil(-789.3, 83.0, -181.3), new PositionUtil(-792.5, 84.5, -186.7))
    });

    calloutsMap.put("Car", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-793.4, 83.0, -181.3), new PositionUtil(-797.7, 84.5, -186.7))
    });

    calloutsMap.put("Banana", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-795.3, 83.0, -180.6), new PositionUtil(-800.7, 84.5, -180.6)),
        RegionUtil.createRegion(new PositionUtil(-792.3, 84.5, -179.8), new PositionUtil(-804.7, 82.0, -168.7)),
        RegionUtil.createRegion(new PositionUtil(-795.3, 82.0, -167.6), new PositionUtil(-802.7, 83.5, -160.3))
    });

    calloutsMap.put("Logs", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-803.7, 82.0, -167.3), new PositionUtil(-807.7, 85.0, -162.3))
    });

    calloutsMap.put("Bottom Banana", new RegionUtil[]{
        RegionUtil.createRegion(new PositionUtil(-799.3, 82.0, -154.5), new PositionUtil(-802.7, 83.5, -161.5))
    });

    return calloutsMap.entrySet().stream()
        .map(entry -> new CalloutsUtil(entry.getKey(), entry.getValue()))
        .collect(Collectors.toList());
  }

}