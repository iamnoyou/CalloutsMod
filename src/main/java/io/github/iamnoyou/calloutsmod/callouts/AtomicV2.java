package io.github.iamnoyou.calloutsmod.callouts;

import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtomicV2 {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();


    calloutsMap.put("Deep T", new RegionUtil[]{
        createRegion(new PositionUtil(-888.7, 102.0, -210.7), new PositionUtil(-829.3, 106.5, -196.3)),
        createRegion(new PositionUtil(-890.7, 103.0, -208.7), new PositionUtil(-890.7, 104.5, -206.3)),
        createRegion(new PositionUtil(-843.7, 103.0, -195.3), new PositionUtil(-833.3, 104.5, -195.3))
    });

    calloutsMap.put("Cage", new RegionUtil[]{
        createRegion(new PositionUtil(-823.1, 103.0, -209.7), new PositionUtil(-813.3, 105.5, -218.7))
    });

    calloutsMap.put("Outside", new RegionUtil[]{
        createRegion(new PositionUtil(-818.3, 103.0, -208.7), new PositionUtil(-827.7, 104.5, -192.7)),
        createRegion(new PositionUtil(-813.6, 103.0, -197.7), new PositionUtil(-813.6, 104.5, -192.5)),
        createRegion(new PositionUtil(-809.5, 104.5, -168.3), new PositionUtil(-827.7, 103.0, -191.3)),
        createRegion(new PositionUtil(-808.7, 103.0, -168.3), new PositionUtil(-803.6, 104.5, -173.4)),
        createRegion(new PositionUtil(-798.3, 103.0, -164.3), new PositionUtil(-802.7, 104.5, -173.5)),
        createRegion(new PositionUtil(-795.7, 103.0, -182.7), new PositionUtil(-772.6, 104.5, -172.6))
    });

    calloutsMap.put("Under Silo", new RegionUtil[]{
        createRegion(new PositionUtil(-808.5, 103.0, -174.5), new PositionUtil(-796.3, 107.0, -188.7))
    });

    calloutsMap.put("Green", new RegionUtil[]{
        createRegion(new PositionUtil(-795.6, 103.0, -173.5), new PositionUtil(-783.6, 107.5, -162.3))
    });

    calloutsMap.put("Outside Secret", new RegionUtil[]{
        createRegion(new PositionUtil(-783.0, 103.0, -170.8), new PositionUtil(-772.3, 104.5, -161.9))
    });

    calloutsMap.put("Mini Roof", new RegionUtil[]{
        createRegion(new PositionUtil(-795.6, 108.0, -188.7), new PositionUtil(-784.0, 111.0, -183.4)),
        createRegion(new PositionUtil(-792.7, 107.0, -182.7), new PositionUtil(-787.4, 108.5, -182.7))
    });

    calloutsMap.put("Outside Mini", new RegionUtil[]{
        createRegion(new PositionUtil(-779.4, 104.5, -188.7), new PositionUtil(-783.7, 103.0, -183.4)),
        createRegion(new PositionUtil(-772.8, 103.0, -183.4), new PositionUtil(-778.7, 104.5, -190.2))
    });

    calloutsMap.put("Garage", new RegionUtil[]{
        createRegion(new PositionUtil(-771.4, 103.0, -172.4), new PositionUtil(-753.3, 104.5, -181.3)),
        createRegion(new PositionUtil(-753.3, 103.0, -182.5), new PositionUtil(-764.7, 104.5, -183.7)),
        createRegion(new PositionUtil(-762.7, 103.0, -184.4), new PositionUtil(-755.3, 104.5, -185.7)),
        createRegion(new PositionUtil(-771.6, 103.0, -183.6), new PositionUtil(-770.3, 104.5, -182.6))
    });

    calloutsMap.put("Credit Card", new RegionUtil[]{
        createRegion(new PositionUtil(-770.6, 103.0, -184.7), new PositionUtil(-766.3, 104.5, -184.3))
    });

    calloutsMap.put("Red", new RegionUtil[]{
        createRegion(new PositionUtil(-771.3, 103.0, -185.3), new PositionUtil(-754.3, 108.5, -193.5))
    });

    calloutsMap.put("Top Garage", new RegionUtil[]{
        createRegion(new PositionUtil(-766.3, 108.0, -184.6), new PositionUtil(-770.6, 110.5, -172.3))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(-754.3, 103.0, -194.4), new PositionUtil(-758.4, 104.5, -197.7)),
        createRegion(new PositionUtil(-759.3, 103.0, -205.7), new PositionUtil(-768.6, 106.5, -196.8)),
        createRegion(new PositionUtil(-762.1, 105.0, -209.4), new PositionUtil(-745.7, 107.5, -219.7))
    });

    calloutsMap.put("Blue Box", new RegionUtil[]{
        createRegion(new PositionUtil(-778.7, 103.0, -191.1), new PositionUtil(-772.4, 106.5, -200.5))
    });

    calloutsMap.put("Outside Hell", new RegionUtil[]{
        createRegion(new PositionUtil(-778.7, 103.0, -202.6), new PositionUtil(-769.2, 107.5, -206.7))
    });

    calloutsMap.put("CT Box", new RegionUtil[]{
        createRegion(new PositionUtil(-758.7, 105.0, -208.3), new PositionUtil(-756.3, 106.5, -204.3))
    });

    calloutsMap.put("CT Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(-768.7, 103.0, -207.5), new PositionUtil(-763.3, 105.5, -219.7))
    });

    calloutsMap.put("Deep CT", new RegionUtil[]{
        createRegion(new PositionUtil(-744.3, 105.0, -219.7), new PositionUtil(-731.6, 107.5, 205.3)),
        createRegion(new PositionUtil(-730.3, 105.0, -205.3), new PositionUtil(-727.3, 107.5, -220.1))
    });

    calloutsMap.put("Air Cooler", new RegionUtil[]{
        createRegion(new PositionUtil(-778.7, 107.0, -207.6), new PositionUtil(-769.4, 109.5, -219.7))
    });

    calloutsMap.put("Heaven", new RegionUtil[]{
        createRegion(new PositionUtil(-774.2, 110.0, -212.1), new PositionUtil(-769.1, 113.5, -219.7)),
        createRegion(new PositionUtil(-775.4, 111.0, -215.3), new PositionUtil(-779.4, 112.5, -217.7))
    });

    calloutsMap.put("Lockers", new RegionUtil[]{
        createRegion(new PositionUtil(-770.3, 103.0, -211.7), new PositionUtil(-777.7, 104.5, -207.9))
    });

    calloutsMap.put("Hell", new RegionUtil[]{
        createRegion(new PositionUtil(-770.4, 103.0, -213.3), new PositionUtil(-777.7, 104.5, -219.6))
    });

    calloutsMap.put("Turnpike", new RegionUtil[]{
        createRegion(new PositionUtil(-774.3, 103.0, -220.3), new PositionUtil(-779.6, 104.5, -228.7))
    });

    calloutsMap.put("Stack", new RegionUtil[]{
        createRegion(new PositionUtil(-783.5, 103.0, -225.5), new PositionUtil(-780.3, 104.5, -220.3))
    });

    calloutsMap.put("Boost", new RegionUtil[]{
        createRegion(new PositionUtil(-791.7, 103.0, -220.3), new PositionUtil(-799.7, 104.5, -225.5))
    });

    calloutsMap.put("Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-799.7, 103.0, -233.5), new PositionUtil(-780.7, 106.5, -226.5)),
        createRegion(new PositionUtil(-799.7, 104.0, -234.6), new PositionUtil(-780.3, 100.0, -241.7))
    });

    calloutsMap.put("Headshot", new RegionUtil[]{
        createRegion(new PositionUtil(-785.3, 100.0, -242.4), new PositionUtil(-794.7, 101.5, -245.7)),
        createRegion(new PositionUtil(-792.7, 100.0, -246.7), new PositionUtil(-787.3, 101.5, -246.7))
    });

    calloutsMap.put("Bottom Ramp", new RegionUtil[]{
        createRegion(new PositionUtil(-786.5, 99.5, -237.8), new PositionUtil(-796.7, 96.0, -224.6)),
        createRegion(new PositionUtil(-785.4, 96.0, -224.3), new PositionUtil(-783.3, 97.5, -226.7)),
        createRegion(new PositionUtil(-796.7, 96.0, -220.4), new PositionUtil(-783.4, 97.5, -221.4)),
        createRegion(new PositionUtil(-782.3, 96.0, -219.7), new PositionUtil(-797.7, 97.5, -219.7))
    });

    calloutsMap.put("Toxic", new RegionUtil[]{
        createRegion(new PositionUtil(-798.7, 96.0, -218.7), new PositionUtil(-793.2, 97.5, -212.6))
    });

    calloutsMap.put("B Topsite", new RegionUtil[]{
        createRegion(new PositionUtil(-797.1, 96.0, -211.6), new PositionUtil(-798.7, 98.5, -194.3)),
        createRegion(new PositionUtil(-796.9, 96.0, -194.3), new PositionUtil(-781.3, 98.5, -195.5)),
        createRegion(new PositionUtil(-782.9, 96.0, -197.4), new PositionUtil(-780.3, 98.5, -208.3))
    });

    calloutsMap.put("Control", new RegionUtil[]{
        createRegion(new PositionUtil(-781.3, 96.0, -218.7), new PositionUtil(-770.4, 96.0, -209.4)),
        createRegion(new PositionUtil(-770.3, 97.0, -208.2), new PositionUtil(-772.7, 92.0, -204.4))
    });

    calloutsMap.put("B Silo", new RegionUtil[]{
        createRegion(new PositionUtil(-788.7, 93.0, -197.7), new PositionUtil(-791.3, 99.5, -200.3))
    });

    calloutsMap.put("B Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(-785.3, 92.0, -197.6), new PositionUtil(-781.3, 96.5, -194.3))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(-781.5, 92.0, -200.6), new PositionUtil(-787.4, 93.5, -211.4)),
        createRegion(new PositionUtil(-788.4, 92.0, -211.7), new PositionUtil(-798.7, 93.5, -201.6)),
        createRegion(new PositionUtil(-786.0, 92.0, -194.3), new PositionUtil(-798.4, 93.5, -197.6))
    });

    calloutsMap.put("Single", new RegionUtil[]{
        createRegion(new PositionUtil(-800.5, 92.0, -195.3), new PositionUtil(-799.3, 93.5, -197.7))
    });

    calloutsMap.put("De Con", new RegionUtil[]{
        createRegion(new PositionUtil(-805.7, 92.0, -188.3), new PositionUtil(-801.5, 94.0, -197.7))
    });

    calloutsMap.put("Back Vents", new RegionUtil[]{
        createRegion(new PositionUtil(-807.7, 92.0, -183.3), new PositionUtil(-777.6, 97.5, -186.7))
    });

    calloutsMap.put("Vents", new RegionUtil[]{
        createRegion(new PositionUtil(-798.7, 103.0, -194.7), new PositionUtil(-793.7, 104.5, -191.3)),
        createRegion(new PositionUtil(-789.3, 97.0, -187.4), new PositionUtil(-790.7, 98.0, -188.6)),
        createRegion(new PositionUtil(-781.3, 97.0, -189.3), new PositionUtil(-796.6, 102.5, -190.3)),
        createRegion(new PositionUtil(-777.4, 97.0, -191.3), new PositionUtil(-782.7, 98.0, -192.7))
    });

    calloutsMap.put("Double", new RegionUtil[]{
        createRegion(new PositionUtil(-769.3, 92.0, -203.7), new PositionUtil(-780.3, 93.5, -200.3)),
        createRegion(new PositionUtil(-780.3, 92.0, -204.7), new PositionUtil(-774.3, 93.5, -204.7))
    });

    calloutsMap.put("Tuns", new RegionUtil[]{
        createRegion(new PositionUtil(-776.7, 92.0, -200.5), new PositionUtil(-773.5, 97.5, -172.3))
    });

    calloutsMap.put("Secret", new RegionUtil[]{
        createRegion(new PositionUtil(-772.3, 96.0, -172.3), new PositionUtil(-760.3, 97.5, -176.7)),
        createRegion(new PositionUtil(-759.3, 96.0, -175.7), new PositionUtil(-759.3, 97.5, -172.3)),
        createRegion(new PositionUtil(-770.9, 96.0, -177.7), new PositionUtil(-770.3, 97.5, -177.7)),
        createRegion(new PositionUtil(-766.7, 96.0, -171.6), new PositionUtil(-763.3, 100.5, -163.3)),
        createRegion(new PositionUtil(-767.3, 100.0, -163.3), new PositionUtil(-771.6, 104.5, -165.4)),
        createRegion(new PositionUtil(-771.6, 103.0, -166.4), new PositionUtil(-766.3, 106.5, -170.7))
    });

    calloutsMap.put("Trophy", new RegionUtil[]{
        createRegion(new PositionUtil(-800.5, 103.0, -228.7), new PositionUtil(-805.7, 104.5, -221.3))
    });

    calloutsMap.put("Radio", new RegionUtil[]{
        createRegion(new PositionUtil(-801.3, 103.0, -219.7), new PositionUtil(-810.7, 105.5, -211.5))
    });

    calloutsMap.put("Lobby Entrance", new RegionUtil[]{
        createRegion(new PositionUtil(-812.4, 103.0, -199.3), new PositionUtil(-816.7, 104.5, -207.7)),
        createRegion(new PositionUtil(-816.7, 103.0, -208.4), new PositionUtil(-813.3, 104.0, -208.6))
    });

    calloutsMap.put("Lobby", new RegionUtil[]{
        createRegion(new PositionUtil(-811.6, 103.0, -199.3), new PositionUtil(-804.4, 104.5, -210.7)),
        createRegion(new PositionUtil(-801.5, 103.0, -201.3), new PositionUtil(-802.4, 104.0, -210.7))
    });

    calloutsMap.put("Top Lobby", new RegionUtil[]{
        createRegion(new PositionUtil(-803.3, 106.0, -199.3), new PositionUtil(-801.3, 107.5, -210.7))
    });

    calloutsMap.put("T Roof", new RegionUtil[]{
        createRegion(new PositionUtil(-801.4, 110.0, -218.7), new PositionUtil(-812.5, 113.5, -198.2)),
        createRegion(new PositionUtil(-813.5, 110.0, -198.2), new PositionUtil(-818.8, 113.5, -208.4)),
        createRegion(new PositionUtil(-818.6, 107.0, -197.7), new PositionUtil(-806.3, 110.0, -192.5)),
        createRegion(new PositionUtil(-805.4, 107.0, -193.3), new PositionUtil(-801.3, 111.5, -197.7))
    });

    calloutsMap.put("Silo", new RegionUtil[]{
        createRegion(new PositionUtil(-801.3, 110.0, -192.6), new PositionUtil(-808.7, 113.5, -183.4)),
        createRegion(new PositionUtil(-809.5, 111.0, -185.4), new PositionUtil(-809.5, 112.5, -187.4)),
        createRegion(new PositionUtil(-800.4, 111.0, -188.7), new PositionUtil(-800.4, 112.5, -183.5)),
        createRegion(new PositionUtil(-799.3, 111.0, -185.3), new PositionUtil(-799.3, 112.5, -187.5))
    });

    calloutsMap.put("Squeaky", new RegionUtil[]{
        createRegion(new PositionUtil(-811.7, 103.0, -197.7), new PositionUtil(-801.3, 104.5, -194.3)),
        createRegion(new PositionUtil(-800.6, 104.0, -195.3), new PositionUtil(-799.5, 103.0, -196.7))
    });

    calloutsMap.put("Yellow", new RegionUtil[]{
        createRegion(new PositionUtil(-800.5, 103.0, -201.3), new PositionUtil(-796.3, 104.5, -206.4)),
        createRegion(new PositionUtil(-798.7, 104.0, -200.3), new PositionUtil(-796.3, 104.5, -200.3))
    });

    calloutsMap.put("Top Yellow", new RegionUtil[]{
        createRegion(new PositionUtil(-798.7, 107.0, -206.5), new PositionUtil(-795.4, 108.5, -199.4))
    });

    calloutsMap.put("Tetris", new RegionUtil[]{
        createRegion(new PositionUtil(-792.3, 103.0, -199.7), new PositionUtil(-794.7, 107.5, -203.3))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(-794.7, 103.0, -204.7), new PositionUtil(-781.3, 104.5, -217.7)),
        createRegion(new PositionUtil(-795.5, 103.0, -207.3), new PositionUtil(-798.7, 106.5, -217.7)),
        createRegion(new PositionUtil(-791.5, 103.0, -203.6), new PositionUtil(-781.3, 104.5, -195.6)),
        createRegion(new PositionUtil(-792.6, 103.0, -195.4), new PositionUtil(-798.7, 104.5, -198.7))
    });

    calloutsMap.put("CT Vent", new RegionUtil[]{
        createRegion(new PositionUtil(-786.3, 103.0, -191.3), new PositionUtil(-781.3, 104.5, -194.4))
    });

    calloutsMap.put("Mini", new RegionUtil[]{
        createRegion(new PositionUtil(-792.7, 103.0, -190.5), new PositionUtil(-787.3, 104.5, -190.6)),
        createRegion(new PositionUtil(-784.5, 103.0, -187.7), new PositionUtil(-785.7, 104.5, -185.3)),
        createRegion(new PositionUtil(-793.7, 103.0, -189.7), new PositionUtil(-786.3, 104.5, -184.3))
    });

    calloutsMap.put("A Silo", new RegionUtil[]{
        createRegion(new PositionUtil(-791.3, 103.0, -208.7), new PositionUtil(-784.7, 111.0, -211.3))
    });

    calloutsMap.put("Rafters", new RegionUtil[]{
        createRegion(new PositionUtil(-781.3, 111.0, -205.3), new PositionUtil(-780.3, 112.5, -218.7)),
        createRegion(new PositionUtil(-781.5, 111.0, -205.3), new PositionUtil(-799.7, 112.5, -218.7))
    });

    calloutsMap.put("Mustang", new RegionUtil[]{
        createRegion(new PositionUtil(-799.7, 111.0, -217.5), new PositionUtil(-799.7, 112.5, -205.3))
    });

    calloutsMap.put("Dark", new RegionUtil[]{
        createRegion(new PositionUtil(-781.3, 92.0, -212.6), new PositionUtil(-784.7, 93.5, -216.7))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}