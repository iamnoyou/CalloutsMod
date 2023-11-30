package io.github.iamnoyou.calloutsmod.callouts;

import io.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import io.github.iamnoyou.calloutsmod.util.PositionUtil;
import io.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Derailed {

  private static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }

  public static List<CalloutsUtil> createCalloutsList() {
    List<CalloutsUtil> list = new ArrayList<>();
    Map<String, RegionUtil[]> calloutsMap = new HashMap<>();

    calloutsMap.put("T Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(693.4, 52.0, -2160.3), new PositionUtil(734.7, 54.5, -2170.7)),
        createRegion(new PositionUtil(722.7, 53.0, -2171.4), new PositionUtil(713.3, 54.5, -2175.1)),
        createRegion(new PositionUtil(713.9, 53.0, -2175.7), new PositionUtil(714.7, 54.5, -2175.7)),
        createRegion(new PositionUtil(692.3, 52.0, -2160.3), new PositionUtil(685.6, 55.0, -2156.2)),
        createRegion(new PositionUtil(686.4, 52.0, -2161.3), new PositionUtil(692.7, 53.5, -2181.5))
    });

    calloutsMap.put("Dumpster", new RegionUtil[]{
        createRegion(new PositionUtil(684.6, 52.0, -2162.2), new PositionUtil(681.3, 57.0, -2170.7))
    });

    calloutsMap.put("T Alley", new RegionUtil[]{
        createRegion(new PositionUtil(680.5, 52.0, -2165.7), new PositionUtil(649.7, 55.5, -2158.3)),
        createRegion(new PositionUtil(658.3, 52.0, -2166.7), new PositionUtil(669.7, 55.0, -2170.7))
    });

    calloutsMap.put("Pigeons", new RegionUtil[]{
        createRegion(new PositionUtil(648.7, 52.0, -2166.7), new PositionUtil(635.3, 56.0, -2157.3))
    });

    calloutsMap.put("Ivy", new RegionUtil[]{
        createRegion(new PositionUtil(642.7, 52.0, -2167.3), new PositionUtil(636.3, 53.5, -2186.7)),
        createRegion(new PositionUtil(638.3, 52.0, -2187.4), new PositionUtil(641.7, 53.5, -2187.5))
    });

    calloutsMap.put("A1", new RegionUtil[]{
        createRegion(new PositionUtil(630.4, 52.0, -2206.1), new PositionUtil(649.7, 53.5, -2208.7))
    });

    calloutsMap.put("A2", new RegionUtil[]{
        createRegion(new PositionUtil(645.7, 52.0, -2202.3), new PositionUtil(630.4, 53.5, -2204.8))
    });

    calloutsMap.put("A3", new RegionUtil[]{
        createRegion(new PositionUtil(649.6, 52.0, -2188.3), new PositionUtil(631.7, 53.5, -2192.7))
    });

    calloutsMap.put("A", new RegionUtil[]{
        createRegion(new PositionUtil(654.0, 52.0, -2199.0), new PositionUtil(662.0, 53.5, -2193.0)),
        createRegion(new PositionUtil(684.7, 52.0, -2209.7), new PositionUtil(678.0, 53.5, -2194.0))
    });

    calloutsMap.put("CT Tuns", new RegionUtil[]{
        createRegion(new PositionUtil(630.5, 52.0, -2188.3), new PositionUtil(625.3, 53.5, -2212.7)),
        createRegion(new PositionUtil(626.3, 52.0, -2213.4), new PositionUtil(628.7, 53.5, -2213.4))
    });

    calloutsMap.put("CT Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(629.7, 53.5, -2214.3), new PositionUtil(625.3, 49.0, -2225.4))
    });

    calloutsMap.put("CT Spawn", new RegionUtil[]{
        createRegion(new PositionUtil(624.8, 49.0, -2226.3), new PositionUtil(637.7, 52.0, -2239.4)),
        createRegion(new PositionUtil(638.6, 49.0, -2223.3), new PositionUtil(639.6, 50.5, -2225.7))
    });

    calloutsMap.put("CT Hall", new RegionUtil[]{
        createRegion(new PositionUtil(625.3, 49.0, -2243.4), new PositionUtil(639.6, 52.0, -2247.7))
    });

    calloutsMap.put("Cloud", new RegionUtil[]{
        createRegion(new PositionUtil(640.5, 49.0, -2247.7), new PositionUtil(651.4, 54.5, -2244.3))
    });

    calloutsMap.put("Headshot", new RegionUtil[]{
        createRegion(new PositionUtil(652.2, 53.0, -2247.7), new PositionUtil(655.7, 56.5, -2244.3))
    });

    calloutsMap.put("Cat", new RegionUtil[]{
        createRegion(new PositionUtil(687.2, 56.0, -2247.7), new PositionUtil(656.4, 57.5, -2244.4))
    });

    calloutsMap.put("Ladder", new RegionUtil[]{
        createRegion(new PositionUtil(688.4, 58.0, -2244.5), new PositionUtil(689.6, 48.0, -2242.6))
    });

    calloutsMap.put("Upper", new RegionUtil[]{
        createRegion(new PositionUtil(688.5, 56.0, -2245.7), new PositionUtil(689.7, 57.5, -2247.7)),
        createRegion(new PositionUtil(690.4, 56.0, -2246.7), new PositionUtil(690.4, 57.5, -2245.3)),
        createRegion(new PositionUtil(691.4, 57.5, -2247.7), new PositionUtil(700.7, 55.0, -2244.4))
    });

    calloutsMap.put("B Halls", new RegionUtil[]{
        createRegion(new PositionUtil(696.3, 55.0, -2243.5), new PositionUtil(703.7, 58.5, -2215.3)),
        createRegion(new PositionUtil(687.3, 60.5, -2215.6), new PositionUtil(696.5, 56.5, -2217.7))
    });

    calloutsMap.put("Lower", new RegionUtil[]{
        createRegion(new PositionUtil(695.6, 56.5, -2223.3), new PositionUtil(690.1, 49.5, -2225.6))
    });

    calloutsMap.put("Sidewalk", new RegionUtil[]{
        createRegion(new PositionUtil(689.5, 49.0, -2223.3), new PositionUtil(655.7, 50.5, -2225.7))
    });

    calloutsMap.put("White", new RegionUtil[]{
        createRegion(new PositionUtil(685.3, 48.0, -2226.3), new PositionUtil(670.2, 55.0, -2229.5))
    });

    calloutsMap.put("B Site", new RegionUtil[]{
        createRegion(new PositionUtil(669.5, 48.0, -2229.5), new PositionUtil(658.6, 49.5, -2226.3)),
        createRegion(new PositionUtil(667.5, 48.0, -2243.7), new PositionUtil(684.1, 49.5, -2238.2))
    });

    calloutsMap.put("Bread", new RegionUtil[]{
        createRegion(new PositionUtil(657.3, 48.0, -2226.3), new PositionUtil(644.7, 55.0, -2228.7))
    });

    calloutsMap.put("Backsite B", new RegionUtil[]{
        createRegion(new PositionUtil(644.4, 52.5, -2223.3), new PositionUtil(640.3, 48.0, -2243.7)),
        createRegion(new PositionUtil(649.4, 48.0, -2243.7), new PositionUtil(645.5, 51.0, -2230.3))
    });

    calloutsMap.put("Yellow", new RegionUtil[]{
        createRegion(new PositionUtil(662.4, 48.0, -2230.4), new PositionUtil(650.3, 55.0, -2238.0))
    });

    calloutsMap.put("Oil", new RegionUtil[]{
        createRegion(new PositionUtil(651.3, 48.0, -2239.4), new PositionUtil(667.5, 55.0, -2243.7))
    });

    calloutsMap.put("Bomb Train", new RegionUtil[]{
        createRegion(new PositionUtil(666.8, 48.0, -2230.4), new PositionUtil(684.3, 51.5, -2237.5))
    });

    calloutsMap.put("Spools", new RegionUtil[]{
        createRegion(new PositionUtil(689.7, 48.0, -2241.4), new PositionUtil(685.5, 53.0, -2235.7))
    });

    calloutsMap.put("Summit", new RegionUtil[]{
        createRegion(new PositionUtil(663.4, 48.0, -2237.0), new PositionUtil(666.1, 49.5, -2232.5))
    });

    calloutsMap.put("Top Popdog", new RegionUtil[]{
        createRegion(new PositionUtil(687.3, 59.0, -2214.6), new PositionUtil(695.2, 60.5, -2206.3))
    });

    calloutsMap.put("Popdog", new RegionUtil[]{
        createRegion(new PositionUtil(691.7, 52.0, -2210.3), new PositionUtil(681.3, 56.5, -2213.7)),
        createRegion(new PositionUtil(685.7, 52.0, -2214.1), new PositionUtil(683.3, 53.5, -2214.1))
    });

    calloutsMap.put("T Halls", new RegionUtil[]{
        createRegion(new PositionUtil(696.3, 59.0, -2214.7), new PositionUtil(698.7, 60.5, -2186.5)),
        createRegion(new PositionUtil(687.3, 59.0, -2206.3), new PositionUtil(695.5, 60.5, -2207.7))
    });

    calloutsMap.put("Showers", new RegionUtil[]{
        createRegion(new PositionUtil(686.3, 59.0, -2192.3), new PositionUtil(693.7, 61.5, -2204.7)),
        createRegion(new PositionUtil(690.6, 61.0, -2189.6), new PositionUtil(688.3, 59.0, -2191.1))
    });

    calloutsMap.put("Kitchen", new RegionUtil[]{
        createRegion(new PositionUtil(694.7, 60.0, -2179.3), new PositionUtil(687.3, 62.5, -2188.7)),
        createRegion(new PositionUtil(695.1, 61.0, -2184.7), new PositionUtil(695.1, 62.0, -2180.3))
    });

    calloutsMap.put("T Stairs", new RegionUtil[]{
        createRegion(new PositionUtil(698.7, 60.0, -2185.4), new PositionUtil(695.3, 55.0, -2171.3)),
        createRegion(new PositionUtil(698.7, 52.0, -2170.5), new PositionUtil(696.3, 53.5, -2170.5)),
        createRegion(new PositionUtil(698.7, 52.0, -2171.0), new PositionUtil(695.3, 55.0, -2177.3))
    });

    calloutsMap.put("T Con", new RegionUtil[]{
        createRegion(new PositionUtil(696.7, 52.0, -2183.3), new PositionUtil(686.3, 54.5, -2194.7))
    });

    calloutsMap.put("Blue", new RegionUtil[]{
        createRegion(new PositionUtil(684.7, 52.0, -2187.4), new PositionUtil(669.6, 57.5, -2192.6))
    });

    calloutsMap.put("Green", new RegionUtil[]{
        createRegion(new PositionUtil(668.4, 52.0, -2192.7), new PositionUtil(650.3, 58.5, -2188.5))
    });

    calloutsMap.put("Sandwich", new RegionUtil[]{
        createRegion(new PositionUtil(671.4, 52.0, -2187.3), new PositionUtil(666.3, 53.5, -2192.0))
    });

    calloutsMap.put("Hell", new RegionUtil[]{
        createRegion(new PositionUtil(650.3, 52.0, -2187.5), new PositionUtil(662.7, 53.5, -2185.5))
    });

    calloutsMap.put("Olof", new RegionUtil[]{
        createRegion(new PositionUtil(672.3, 52.0, -2186.6), new PositionUtil(684.7, 53.5, -2185.3))
    });

    calloutsMap.put("Red", new RegionUtil[]{
        createRegion(new PositionUtil(675.8, 52.0, -2194.0), new PositionUtil(662.4, 57.5, -2198.4))
    });

    calloutsMap.put("A Site", new RegionUtil[]{
        createRegion(new PositionUtil(668.5, 52.0, -2199.3), new PositionUtil(653.4, 55.5, -2205.5)),
        createRegion(new PositionUtil(649.3, 52.0, -2199.7), new PositionUtil(653.5, 53.5, -2209.4)),
        createRegion(new PositionUtil(654.5, 52.0, -2206.7), new PositionUtil(674.6, 53.5, -2209.7)),
        createRegion(new PositionUtil(674.1, 52.0, -2199.6), new PositionUtil(668.6, 53.5, -2205.4))
    });

    calloutsMap.put("Camera", new RegionUtil[]{
        createRegion(new PositionUtil(649.3, 52.0, -2195.3), new PositionUtil(652.4, 55.5, -2199.7))
    });

    calloutsMap.put("Cubby", new RegionUtil[]{
        createRegion(new PositionUtil(650.3, 52.0, -2210.4), new PositionUtil(653.3, 58.5, -2212.7))
    });

    calloutsMap.put("Heaven", new RegionUtil[]{
        createRegion(new PositionUtil(658.7, 59.0, -2209.8), new PositionUtil(652.3, 61.5, -2212.7))
    });

    calloutsMap.put("Z", new RegionUtil[]{
        createRegion(new PositionUtil(664.1, 52.0, -2218.7), new PositionUtil(658.3, 53.5, -2212.6)),
        createRegion(new PositionUtil(664.1, 52.0, -2216.3), new PositionUtil(647.3, 53.5, -2218.4)),
        createRegion(new PositionUtil(647.3, 53.5, -2219.6), new PositionUtil(651.7, 51.0, -2222.5)),
        createRegion(new PositionUtil(661.7, 52.0, -2210.4), new PositionUtil(658.3, 53.5, -2211.6)),
        createRegion(new PositionUtil(656.6, 49.0, -2223.3), new PositionUtil(640.6, 53.5, -2225.5))
    });

    calloutsMap.put("Old Bomb", new RegionUtil[]{
        createRegion(new PositionUtil(649.6, 52.0, -2208.7), new PositionUtil(646.2, 53.5, -2202.3))
    });

    calloutsMap.put("EBox", new RegionUtil[]{
        createRegion(new PositionUtil(678.0, 52.0, -2199.0), new PositionUtil(675.0, 53.5, -2204.0))
    });

    for (Map.Entry<String, RegionUtil[]> entry : calloutsMap.entrySet()) {
      list.add(new CalloutsUtil(entry.getKey(), entry.getValue()));
    }

    return list;
  }

}