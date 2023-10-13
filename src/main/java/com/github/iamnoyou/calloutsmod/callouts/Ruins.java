package com.github.iamnoyou.calloutsmod.callouts;


import com.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import com.github.iamnoyou.calloutsmod.util.PositionUtil;
import com.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.List;

public class Ruins {

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    RegionUtil tSpawn1 = new RegionUtil(new PositionUtil(2.7, 85.0, 91.7), new PositionUtil(22.7, 79.0, 71.3));
    list.add(new CalloutsUtil("T Spawn", new RegionUtil[]{tSpawn1}));
    RegionUtil tTunnel1 = new RegionUtil(new PositionUtil(4.3, 80.5, 70.4), new PositionUtil(6.7, 79.0, 52.4));
    list.add(new CalloutsUtil("T Tunnel", new RegionUtil[]{tTunnel1}));
    RegionUtil swamp1 = new RegionUtil(new PositionUtil(14.7, 80.5, 51.7), new PositionUtil(7.4, 79.0, 45.3));
    list.add(new CalloutsUtil("Swamp", new RegionUtil[]{swamp1}));
    RegionUtil ruins1 = new RegionUtil(new PositionUtil(-9.5, 85.0, 31.3), new PositionUtil(6.6, 80.5, 51.6));
    list.add(new CalloutsUtil("Ruins", new RegionUtil[]{ruins1}));
    RegionUtil doubleDoors1 = new RegionUtil(new PositionUtil(-10.4, 83.5, 31.3), new PositionUtil(-17.7, 82.0, 40.7));
    list.add(new CalloutsUtil("Double Doors", new RegionUtil[]{doubleDoors1}));
    RegionUtil ramp1 = new RegionUtil(new PositionUtil(-34.7, 85.0, 29.3), new PositionUtil(-18.5, 81.5, 37.7));
    RegionUtil ramp2 = new RegionUtil(new PositionUtil(-35.5, 84.5, 31.3), new PositionUtil(-36.7, 88.0, 34.7));
    list.add(new CalloutsUtil("Ramp", new RegionUtil[]{ramp1, ramp2}));
    RegionUtil lane1 = new RegionUtil(new PositionUtil(-21.3, 84.5, 41.5), new PositionUtil(-26.5, 82.0, 49.7));
    list.add(new CalloutsUtil("Lane", new RegionUtil[]{lane1}));
    RegionUtil banger1 = new RegionUtil(new PositionUtil(-27.4, 83.5, 49.7), new PositionUtil(-32.7, 88.0, 45.3));
    list.add(new CalloutsUtil("Banger", new RegionUtil[]{banger1}));
    RegionUtil outsideCave1 = new RegionUtil(new PositionUtil(-24.7, 85.0, 50.7), new PositionUtil(-20.3, 88.0, 62.4));
    list.add(new CalloutsUtil("Outside Cave", new RegionUtil[]{outsideCave1}));
    RegionUtil cheetah1 = new RegionUtil(new PositionUtil(-30.3, 87.5, 64.7), new PositionUtil(-34.7, 86.0, 52.3));
    list.add(new CalloutsUtil("Cheetah", new RegionUtil[]{cheetah1}));
    RegionUtil caveEntrance1 = new RegionUtil(new PositionUtil(-29.8, 85.0, 62.7), new PositionUtil(-24.1, 89.0, 56.7));
    list.add(new CalloutsUtil("Cave Entrance", new RegionUtil[]{caveEntrance1}));
    RegionUtil snake1 = new RegionUtil(new PositionUtil(-20.3, 86.0, 63.4), new PositionUtil(-25.3, 89.0, 69.6));
    list.add(new CalloutsUtil("Snake", new RegionUtil[]{snake1}));
    RegionUtil dark1 = new RegionUtil(new PositionUtil(-35.4, 86.0, 53.3), new PositionUtil(-39.4, 89.0, 54.7));
    list.add(new CalloutsUtil("Dark", new RegionUtil[]{dark1}));
    RegionUtil cave1 = new RegionUtil(new PositionUtil(-40.3, 86.0, 56.7), new PositionUtil(-53.7, 89.0, 51.3));
    RegionUtil cave2 = new RegionUtil(new PositionUtil(-44.7, 86.0, 50.3), new PositionUtil(-42.3, 89.0, 50.3));
    RegionUtil cave3 = new RegionUtil(new PositionUtil(-52.7, 86.0, 49.7), new PositionUtil(-48.3, 88.0, 50.7));
    list.add(new CalloutsUtil("Cave", new RegionUtil[]{cave1, cave2, cave3}));
    RegionUtil ninja1 = new RegionUtil(new PositionUtil(-38.5, 85.0, 45.5), new PositionUtil(-37.3, 88.0, 49.7));
    list.add(new CalloutsUtil("Ninja", new RegionUtil[]{ninja1}));
    RegionUtil bSite1 = new RegionUtil(new PositionUtil(-35.5, 85.0, 31.3), new PositionUtil(-38.3, 88.0, 44.6));
    RegionUtil bSite2 = new RegionUtil(new PositionUtil(-39.6, 85.0, 31.3), new PositionUtil(-41.6, 87.0, 48.7));
    RegionUtil bSite3 = new RegionUtil(new PositionUtil(-57.7, 85.0, 50.7), new PositionUtil(-52.3, 88.0, 31.3));
    RegionUtil bSite4 = new RegionUtil(new PositionUtil(-51.5, 85.0, 33.3), new PositionUtil(-42.7, 88.0, 39.6));
    list.add(new CalloutsUtil("B Site", new RegionUtil[]{bSite1, bSite2, bSite3, bSite4}));
    RegionUtil pillar1 = new RegionUtil(new PositionUtil(-42.5, 85.0, 48.7), new PositionUtil(-50.6, 88.0, 40.1));
    list.add(new CalloutsUtil("Pillar", new RegionUtil[]{pillar1}));
    RegionUtil bShort1 = new RegionUtil(new PositionUtil(-58.3, 85.0, 49.7), new PositionUtil(-66.6, 88.0, 45.3));
    list.add(new CalloutsUtil("B Short", new RegionUtil[]{bShort1}));
    RegionUtil bLong1 = new RegionUtil(new PositionUtil(-58.2, 85.0, 34.7), new PositionUtil(-71.7, 88.0, 29.3));
    RegionUtil bLong2 = new RegionUtil(new PositionUtil(-72.7, 85.0, 34.4), new PositionUtil(-72.7, 88.0, 31.4));
    list.add(new CalloutsUtil("B Long", new RegionUtil[]{bLong1, bLong2}));
    RegionUtil backAlley1 = new RegionUtil(new PositionUtil(-72.7, 84.5, 35.4), new PositionUtil(-67.3, 86.5, 44.7));
    list.add(new CalloutsUtil("Back Alley", new RegionUtil[]{backAlley1}));
    RegionUtil alley1 = new RegionUtil(new PositionUtil(-67.0, 85.5, 45.5), new PositionUtil(-71.7, 83.5, 67.7));
    RegionUtil alley2 = new RegionUtil(new PositionUtil(-65.6, 85.5, 64.3), new PositionUtil(-66.3, 83.5, 67.6));
    list.add(new CalloutsUtil("Alley", new RegionUtil[]{alley1, alley2}));
    RegionUtil ctCubby1 = new RegionUtil(new PositionUtil(-65.0, 84.0, 67.7), new PositionUtil(-63.3, 87.0, 64.3));
    list.add(new CalloutsUtil("CT Cubby", new RegionUtil[]{ctCubby1}));
    RegionUtil ctSpawn1 = new RegionUtil(new PositionUtil(-95.8, 83.0, 80.7), new PositionUtil(-73.3, 87.0, 68.3));
    list.add(new CalloutsUtil("CT Spawn", new RegionUtil[]{ctSpawn1}));
    RegionUtil midHouse1 = new RegionUtil(new PositionUtil(-70.7, 84.0, 69.3), new PositionUtil(-64.3, 85.5, 74.4));
    list.add(new CalloutsUtil("Mid House", new RegionUtil[]{midHouse1}));
    RegionUtil snipersNest1 = new RegionUtil(new PositionUtil(-62.3, 85.0, 76.3), new PositionUtil(-70.7, 86.5, 81.7));
    RegionUtil snipersNest2 = new RegionUtil(new PositionUtil(-68.7, 86.0, 82.7), new PositionUtil(-64.3, 87.5, 82.7));
    list.add(new CalloutsUtil("Snipers Nest", new RegionUtil[]{snipersNest1, snipersNest2}));
    RegionUtil red1 = new RegionUtil(new PositionUtil(-52.3, 86.0, 75.3), new PositionUtil(-58.7, 87.5, 81.7));
    RegionUtil red2 = new RegionUtil(new PositionUtil(-57.7, 86.0, 82.7), new PositionUtil(-53.3, 87.5, 82.7));
    list.add(new CalloutsUtil("Red", new RegionUtil[]{red1, red2}));
    RegionUtil topMid1 = new RegionUtil(new PositionUtil(-42.2, 83.5, 75.3), new PositionUtil(-49.7, 87.5, 81.5));
    list.add(new CalloutsUtil("Top Mid", new RegionUtil[]{topMid1}));
    RegionUtil pit1 = new RegionUtil(new PositionUtil(-41.7, 83.0, 70.5), new PositionUtil(-37.3, 84.5, 67.3));
    list.add(new CalloutsUtil("Pit", new RegionUtil[]{pit1}));
    RegionUtil mid1 = new RegionUtil(new PositionUtil(-25.6, 83.0, 85.5), new PositionUtil(-41.7, 84.5, 71.4));
    list.add(new CalloutsUtil("Mid", new RegionUtil[]{mid1}));
    RegionUtil lowerMid1 = new RegionUtil(new PositionUtil(-26.7, 84.5, 86.6), new PositionUtil(-21.5, 83.0, 94.6));
    RegionUtil lowerMid2 = new RegionUtil(new PositionUtil(-24.5, 83.0, 85.3), new PositionUtil(-20.3, 84.5, 75.5));
    RegionUtil lowerMid3 = new RegionUtil(new PositionUtil(-19.3, 83.0, 76.3), new PositionUtil(-19.3, 84.5, 80.7));
    list.add(new CalloutsUtil("Lower Mid", new RegionUtil[]{lowerMid1, lowerMid2, lowerMid3}));
    RegionUtil xbox1 = new RegionUtil(new PositionUtil(-20.3, 83.0, 74.3), new PositionUtil(-25.4, 87.5, 70.8));
    list.add(new CalloutsUtil("Xbox", new RegionUtil[]{xbox1}));
    RegionUtil ledge1 = new RegionUtil(new PositionUtil(-26.4, 86.0, 70.3), new PositionUtil(-36.5, 87.5, 71.3));
    list.add(new CalloutsUtil("Ledge", new RegionUtil[]{ledge1}));
    RegionUtil yard1 = new RegionUtil(new PositionUtil(-20.4, 84.5, 94.7), new PositionUtil(-14.4, 82.0, 92.3));
    RegionUtil yard2 = new RegionUtil(new PositionUtil(2.5, 82.0, 92.4), new PositionUtil(-13.3, 83.5, 118.7));
    list.add(new CalloutsUtil("Yard", new RegionUtil[]{yard1, yard2}));
    RegionUtil aStairs1 = new RegionUtil(new PositionUtil(-14.7, 82.0, 102.3), new PositionUtil(-17.7, 83.5, 118.7));
    RegionUtil aStairs2 = new RegionUtil(new PositionUtil(-16.7, 82.0, 119.7), new PositionUtil(-14.3, 83.5, 119.7));
    RegionUtil aStairs3 = new RegionUtil(new PositionUtil(-17.3, 83.0, 107.5), new PositionUtil(-21.7, 86.5, 113.7));
    list.add(new CalloutsUtil("A Stairs", new RegionUtil[]{aStairs1, aStairs2, aStairs3}));
    RegionUtil aMain1 = new RegionUtil(new PositionUtil(-28.3, 84.0, 121.7), new PositionUtil(-42.7, 85.5, 108.3));
    RegionUtil aMain2 = new RegionUtil(new PositionUtil(-44.3, 84.0, 108.3), new PositionUtil(-49.7, 85.5, 122.7));
    RegionUtil aMain3 = new RegionUtil(new PositionUtil(-50.7, 84.0, 119.7), new PositionUtil(-50.7, 85.5, 114.3));
    RegionUtil aMain4 = new RegionUtil(new PositionUtil(-48.7, 86.5, 107.3), new PositionUtil(-45.3, 85.0, 107.3));
    list.add(new CalloutsUtil("A Main", new RegionUtil[]{aMain1, aMain2, aMain3, aMain4}));
    RegionUtil outsideAMain1 = new RegionUtil(new PositionUtil(-57.6, 85.5, 119.7), new PositionUtil(-51.5, 84.0, 115.3));
    RegionUtil outsideAMain2 = new RegionUtil(new PositionUtil(-55.3, 84.0, 114.3), new PositionUtil(-57.5, 85.5, 114.3));
    list.add(new CalloutsUtil("Outside A Main", new RegionUtil[]{outsideAMain1, outsideAMain2}));
    RegionUtil aSite1 = new RegionUtil(new PositionUtil(-58.3, 84.0, 119.7), new PositionUtil(-65.3, 85.5, 98.2));
    RegionUtil aSite2 = new RegionUtil(new PositionUtil(-63.5, 84.0, 89.3), new PositionUtil(-59.4, 85.5, 97.3));
    list.add(new CalloutsUtil("A Site", new RegionUtil[]{aSite1, aSite2}));
    RegionUtil bigBox1 = new RegionUtil(new PositionUtil(-66.4, 84.0, 106.5), new PositionUtil(-72.6, 85.5, 113.6));
    list.add(new CalloutsUtil("Big Box", new RegionUtil[]{bigBox1}));
    RegionUtil backsiteA1 = new RegionUtil(new PositionUtil(-65.4, 84.0, 119.7), new PositionUtil(-79.7, 88.0, 114.7));
    RegionUtil backsiteA2 = new RegionUtil(new PositionUtil(-79.7, 84.0, 113.4), new PositionUtil(-73.6, 85.5, 102.3));
    list.add(new CalloutsUtil("Backsite A", new RegionUtil[]{backsiteA1, backsiteA2}));
    RegionUtil triple1 = new RegionUtil(new PositionUtil(-65.4, 84.0, 97.5), new PositionUtil(-72.5, 88.5, 89.3));
    list.add(new CalloutsUtil("Triple", new RegionUtil[]{triple1}));
    RegionUtil temple1 = new RegionUtil(new PositionUtil(-76.3, 86.5, 101.5), new PositionUtil(-84.7, 84.0, 83.3));
    RegionUtil temple2 = new RegionUtil(new PositionUtil(-75.3, 85.0, 99.7), new PositionUtil(-75.3, 86.5, 95.3));
    RegionUtil temple3 = new RegionUtil(new PositionUtil(-85.7, 86.5, 95.3), new PositionUtil(-85.7, 85.0, 99.7));
    RegionUtil temple4 = new RegionUtil(new PositionUtil(-82.3, 86.0, 100.7), new PositionUtil(-83.7, 87.0, 100.7));
    list.add(new CalloutsUtil("Temple", new RegionUtil[]{temple1, temple2, temple3, temple4}));
    RegionUtil tree1 = new RegionUtil(new PositionUtil(-57.3, 86.0, 105.3), new PositionUtil(-55.3, 87.5, 113.5));
    list.add(new CalloutsUtil("Tree", new RegionUtil[]{tree1}));
    RegionUtil donut1 = new RegionUtil(new PositionUtil(-57.3, 85.5, 100.7), new PositionUtil(-57.3, 87.0, 95.3));
    RegionUtil donut2 = new RegionUtil(new PositionUtil(-57.8, 84.5, 96.3), new PositionUtil(-47.5, 86.5, 99.7));
    RegionUtil donut3 = new RegionUtil(new PositionUtil(-52.7, 86.0, 100.7), new PositionUtil(-50.3, 87.5, 100.7));
    RegionUtil donut4 = new RegionUtil(new PositionUtil(-52.7, 86.0, 95.3), new PositionUtil(-50.3, 87.5, 95.3));
    RegionUtil donut5 = new RegionUtil(new PositionUtil(-35.3, 85.0, 92.3), new PositionUtil(-44.7, 86.5, 103.7));
    RegionUtil donut6 = new RegionUtil(new PositionUtil(-45.7, 85.0, 102.7), new PositionUtil(-45.7, 86.5, 93.3));
    RegionUtil donut7 = new RegionUtil(new PositionUtil(-46.7, 88.0, 94.3), new PositionUtil(-46.7, 85.0, 101.7));
    RegionUtil donut8 = new RegionUtil(new PositionUtil(-34.3, 85.0, 102.7), new PositionUtil(-34.3, 86.5, 93.3));
    RegionUtil donut9 = new RegionUtil(new PositionUtil(-33.3, 86.5, 102.7), new PositionUtil(-33.3, 86.5, 101.7));
    RegionUtil donut10 = new RegionUtil(new PositionUtil(-35.3, 83.0, 84.7), new PositionUtil(-41.7, 86.5, 91.6));
    list.add(new CalloutsUtil("Donut", new RegionUtil[]{donut1, donut2, donut3, donut4, donut5, donut6, donut7, donut8, donut9, donut10}));
    RegionUtil street1 = new RegionUtil(new PositionUtil(-73.5, 84.0, 92.7), new PositionUtil(-76.7, 85.5, 81.6));
    list.add(new CalloutsUtil("Street", new RegionUtil[]{street1}));
    return list;
  }

}