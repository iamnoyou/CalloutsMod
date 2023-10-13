package com.github.iamnoyou.calloutsmod.callouts;


import com.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import com.github.iamnoyou.calloutsmod.util.PositionUtil;
import com.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.List;

public class Temple {

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    RegionUtil tSpawn1 = new RegionUtil(new PositionUtil(-816.0, 73.0, -250.7), new PositionUtil(-803.0, 76.5, -238.3));
    list.add(new CalloutsUtil("T Spawn", new RegionUtil[]{tSpawn1}));
    RegionUtil tRamp1 = new RegionUtil(new PositionUtil(-803.0, 73.0, -246.7), new PositionUtil(-797.3, 77.5, -233.0));
    list.add(new CalloutsUtil("T Ramp", new RegionUtil[]{tRamp1}));
    RegionUtil tEntrance1 = new RegionUtil(new PositionUtil(-797.3, 76.0, -233.0), new PositionUtil(-814.7, 77.5, -227.0));
    list.add(new CalloutsUtil("T Entrance", new RegionUtil[]{tEntrance1}));
    RegionUtil fork1 = new RegionUtil(new PositionUtil(-814.7, 76.0, -224.7), new PositionUtil(-806.3, 79.5, -208.0));
    RegionUtil fork2 = new RegionUtil(new PositionUtil(-815.7, 76.0, -208.0), new PositionUtil(-808.3, 78.0, -200.3));
    list.add(new CalloutsUtil("Fork", new RegionUtil[]{fork1, fork2}));
    RegionUtil sewers1 = new RegionUtil(new PositionUtil(-827.0, 67.0, -232.7), new PositionUtil(-836.95, 68.5, -228.3));
    list.add(new CalloutsUtil("Sewers", new RegionUtil[]{sewers1}));
    RegionUtil snake1 = new RegionUtil(new PositionUtil(-825.0, 68.5, -236.3), new PositionUtil(-835.7, 71.5, -243.0));
    RegionUtil snake2 = new RegionUtil(new PositionUtil(-836.7, 71.0, -243.3), new PositionUtil(-817.0, 73.0, -246.7));
    list.add(new CalloutsUtil("Snake", new RegionUtil[]{snake1, snake2}));
    RegionUtil midDoors1 = new RegionUtil(new PositionUtil(-808.0, 76.0, -202.3), new PositionUtil(-803.0, 77.5, -208.7));
    list.add(new CalloutsUtil("Mid Doors", new RegionUtil[]{midDoors1}));
    RegionUtil botMid1 = new RegionUtil(new PositionUtil(-794.0, 76.0, -209.7), new PositionUtil(-803.7, 77.5, -200.3));
    list.add(new CalloutsUtil("Bottom Mid", new RegionUtil[]{botMid1}));
    RegionUtil mid1 = new RegionUtil(new PositionUtil(-797.3, 76.0, -199.7), new PositionUtil(-802.7, 78.5, -173.0));
    list.add(new CalloutsUtil("Mid", new RegionUtil[]{mid1}));
    RegionUtil topMid1 = new RegionUtil(new PositionUtil(-804.7, 76.0, -172.7), new PositionUtil(-796.0, 79.5, -142.3));
    RegionUtil topMid2 = new RegionUtil(new PositionUtil(-796.0, 79.5, -142.3), new PositionUtil(-793.3, 76.0, -155.7));
    RegionUtil topMid3 = new RegionUtil(new PositionUtil(-805.0, 76.0, -165.7), new PositionUtil(-806.7, 77.5, -156.0));
    RegionUtil topMid4 = new RegionUtil(new PositionUtil(-805.0, 76.0, -156.0), new PositionUtil(-809.7, 77.5, -142.3));
    list.add(new CalloutsUtil("Top Mid", new RegionUtil[]{topMid1, topMid2, topMid3, topMid4}));
    RegionUtil stairs1 = new RegionUtil(new PositionUtil(-796.0, 77.5, -165.3), new PositionUtil(-793.3, 68.0, -176.3));
    list.add(new CalloutsUtil("Stairs", new RegionUtil[]{stairs1}));
    RegionUtil ramp1 = new RegionUtil(new PositionUtil(-797.3, 68.5, -198.7), new PositionUtil(-773.0, 79.0, -192.0));
    list.add(new CalloutsUtil("Ramp", new RegionUtil[]{ramp1}));
    RegionUtil bLong1 = new RegionUtil(new PositionUtil(-794.0, 76.0, -209.7), new PositionUtil(-779.0, 79.5, -199.0));
    list.add(new CalloutsUtil("B Long", new RegionUtil[]{bLong1}));
    RegionUtil elbow1 = new RegionUtil(new PositionUtil(-779.0, 76.0, -199.0), new PositionUtil(-763.3, 79.0, -206.7));
    RegionUtil elbow2 = new RegionUtil(new PositionUtil(-772.7, 76.0, -200.0), new PositionUtil(-766.3, 78.5, -192.0));
    list.add(new CalloutsUtil("Elbow", new RegionUtil[]{elbow1, elbow2}));
    RegionUtil bSite1 = new RegionUtil(new PositionUtil(-774.0, 79.0, -192.0), new PositionUtil(-762.3, 76.0, -177.3));
    RegionUtil bSite2 = new RegionUtil(new PositionUtil(-764.3, 76.0, -177.0), new PositionUtil(-772.7, 76.5, -175.3));
    list.add(new CalloutsUtil("B Site", new RegionUtil[]{bSite1, bSite2}));
    RegionUtil ctSpawn1 = new RegionUtil(new PositionUtil(-802.0, 73.0, -129.0), new PositionUtil(-817.0, 74.5, -119.0));
    list.add(new CalloutsUtil("CT Spawn", new RegionUtil[]{ctSpawn1}));
    RegionUtil ct1 = new RegionUtil(new PositionUtil(-801.0, 73.0, -135.0), new PositionUtil(-774.0, 80.0, -119.0));
    RegionUtil ct2 = new RegionUtil(new PositionUtil(-818.0, 73.0, -119.0), new PositionUtil(-833.0, 77.5, -137.0));
    list.add(new CalloutsUtil("CT", new RegionUtil[]{ct1, ct2}));
    RegionUtil aSite1 = new RegionUtil(new PositionUtil(-833.0, 76.0, -138.0), new PositionUtil(-819.0, 77.5, -151.0));
    RegionUtil aSite2 = new RegionUtil(new PositionUtil(-819.0, 77.5, -152.0), new PositionUtil(-826.0, 76.0, -155.0));
    list.add(new CalloutsUtil("A Site", new RegionUtil[]{aSite1, aSite2}));
    RegionUtil ninja1 = new RegionUtil(new PositionUtil(-831.0, 76.0, -152.0), new PositionUtil(-833.0, 77.5, -155.0));
    list.add(new CalloutsUtil("Ninja", new RegionUtil[]{ninja1}));
    RegionUtil ctBridge1 = new RegionUtil(new PositionUtil(-828.0, 76.0, -172.0), new PositionUtil(-808.0, 77.5, -159.0));
    list.add(new CalloutsUtil("CT Bridge", new RegionUtil[]{ctBridge1}));
    RegionUtil ctTunnels1 = new RegionUtil(new PositionUtil(-773.0, 76.0, -136.0), new PositionUtil(-780.0, 77.5, -161.0));
    list.add(new CalloutsUtil("CT Tunnels", new RegionUtil[]{ctTunnels1}));
    RegionUtil tuns1 = new RegionUtil(new PositionUtil(-765.0, 76.0, -171.0), new PositionUtil(-780.0, 77.5, -162.0));
    list.add(new CalloutsUtil("Tuns", new RegionUtil[]{tuns1}));
    RegionUtil z1 = new RegionUtil(new PositionUtil(-795.0, 76.0, -158.0), new PositionUtil(-781.0, 77.5, -168.0));
    list.add(new CalloutsUtil("Z", new RegionUtil[]{z1}));
    RegionUtil arches1 = new RegionUtil(new PositionUtil(-818.0, 76.0, -152.7), new PositionUtil(810.0, 77.5, -147.5));
    list.add(new CalloutsUtil("Arches", new RegionUtil[]{arches1}));
    RegionUtil bridge1 = new RegionUtil(new PositionUtil(-823.0, 75.5, -177.0), new PositionUtil(-827.0, 77.5, -194.0));
    list.add(new CalloutsUtil("Bridge", new RegionUtil[]{bridge1}));
    RegionUtil tBridge1 = new RegionUtil(new PositionUtil(-828.7, 80.5, -195.3), new PositionUtil(-820.3, 76.0, -206.7));
    list.add(new CalloutsUtil("T Bridge", new RegionUtil[]{tBridge1}));
    RegionUtil tStairs1 = new RegionUtil(new PositionUtil(-813.3, 68.5, -216.3), new PositionUtil(-815.7, 77.5, -209.0));
    list.add(new CalloutsUtil("T Stairs", new RegionUtil[]{tStairs1}));
    RegionUtil under1 = new RegionUtil(new PositionUtil(-819.3, 67.0, -239.7), new PositionUtil(-826.0, 69.5, -177.3));
    RegionUtil under2 = new RegionUtil(new PositionUtil(-827.0, 67.0, -219.7), new PositionUtil(-828.7, 69.5, -176.3));
    RegionUtil under3 = new RegionUtil(new PositionUtil(-819.0, 67.0, -208.3), new PositionUtil(-816.0, 69.5, -220.7));
    RegionUtil under4 = new RegionUtil(new PositionUtil(-816.0, 69.5, -220.7), new PositionUtil(-813.3, 68.0, -216.3));
    RegionUtil under5 = new RegionUtil(new PositionUtil(-819.0, 67.0, -178.3), new PositionUtil(-804.0, 69.5, -109.7));
    RegionUtil under6 = new RegionUtil(new PositionUtil(-804.0, 68.0, -187.0), new PositionUtil(-797.3, 70.0, -198.7));
    RegionUtil under7 = new RegionUtil(new PositionUtil(-797.0, 67.0, -176.3), new PositionUtil(-773.3, 71.0, -191.7));
    RegionUtil under8 = new RegionUtil(new PositionUtil(-793.3, 68.0, -176.3), new PositionUtil(-804.0, 69.5, -180.0));
    list.add(new CalloutsUtil("Under", new RegionUtil[]{under1, under2, under3, under4, under5, under6, under7, under8}));
    RegionUtil pillar1 = new RegionUtil(new PositionUtil(-804.0, 68.0, -180.0), new PositionUtil(-797.0, 69.5, -187.0));
    list.add(new CalloutsUtil("Pillar", new RegionUtil[]{pillar1}));
    return list;
  }

}