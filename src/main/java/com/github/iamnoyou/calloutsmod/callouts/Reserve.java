package com.github.iamnoyou.calloutsmod.callouts;


import com.github.iamnoyou.calloutsmod.util.CalloutsUtil;
import com.github.iamnoyou.calloutsmod.util.PositionUtil;
import com.github.iamnoyou.calloutsmod.util.RegionUtil;
import java.util.ArrayList;
import java.util.List;

public class Reserve {

  public static List<CalloutsUtil> createCallouts() {
    List<CalloutsUtil> list = new ArrayList<>();
    RegionUtil treeRoom1 = new RegionUtil(new PositionUtil(30.3, 44.0, -262.7), new PositionUtil(51.7, 47.5, -252.3));
    list.add(new CalloutsUtil("Tree Room", new RegionUtil[]{treeRoom1}));
    RegionUtil ctSpawn1 = new RegionUtil(new PositionUtil(100.7, 44.0, -270.3), new PositionUtil(80.3, 45.5, -282.7));
    RegionUtil ctSpawn2 = new RegionUtil(new PositionUtil(80.0, 44.0, -263.0), new PositionUtil(58.3, 47.5, -284.137));
    list.add(new CalloutsUtil("CT Spawn", new RegionUtil[]{ctSpawn1, ctSpawn2}));
    RegionUtil ctHalls1 = new RegionUtil(new PositionUtil(54.3, 44.0, -262.7), new PositionUtil(91.7, 47.0, -254.3));
    list.add(new CalloutsUtil("CT Halls", new RegionUtil[]{ctHalls1}));
    RegionUtil truck1 = new RegionUtil(new PositionUtil(101.3, 48.5, -262.137), new PositionUtil(92.0, 46.0, -255.3));
    list.add(new CalloutsUtil("Truck", new RegionUtil[]{truck1}));
    RegionUtil elektro1 = new RegionUtil(new PositionUtil(101.301, 47.5, -262.137), new PositionUtil(108.7, 46.0, -243.0));
    RegionUtil elektro2 = new RegionUtil(new PositionUtil(101.3, 46.0, -252.7), new PositionUtil(99.3, 47.5, -243.0));
    list.add(new CalloutsUtil("Elektro", new RegionUtil[]{elektro1, elektro2}));
    RegionUtil a1 = new RegionUtil(new PositionUtil(114.0, 47.5, -241.7), new PositionUtil(99.3, 46.0, -233.0));
    RegionUtil a2 = new RegionUtil(new PositionUtil(113.01, 46.0, -218.3), new PositionUtil(126.0, 47.5, -232.0));
    list.add(new CalloutsUtil("A", new RegionUtil[]{a1, a2}));
    RegionUtil forklift1 = new RegionUtil(new PositionUtil(105.3, 46.0, -232.99), new PositionUtil(113.0, 48.0, -218.3));
    RegionUtil forklift2 = new RegionUtil(new PositionUtil(108.0, 50.0, -230.3), new PositionUtil(111.3, 52.0, -222.7));
    list.add(new CalloutsUtil("Forklift", new RegionUtil[]{forklift1, forklift2}));
    RegionUtil aDefault1 = new RegionUtil(new PositionUtil(124.0, 46.0, -234.3), new PositionUtil(122.3, 47.5, -237.0));
    list.add(new CalloutsUtil("A Default", new RegionUtil[]{aDefault1}));
    RegionUtil aSite1 = new RegionUtil(new PositionUtil(116.0, 46.0, -241.7), new PositionUtil(127.99, 47.5, -237.01));
    RegionUtil aSite2 = new RegionUtil(new PositionUtil(127.99, 46.0, -232.0), new PositionUtil(124.01, 47.5, -236.99));
    list.add(new CalloutsUtil("A Site", new RegionUtil[]{aSite1, aSite2}));
    RegionUtil quad1 = new RegionUtil(new PositionUtil(128.0, 46.0, -242.7), new PositionUtil(135.137, 47.5, -234.299));
    RegionUtil quad2 = new RegionUtil(new PositionUtil(134.7, 46.0, -232.3), new PositionUtil(128.0, 46.0, -234.0));
    list.add(new CalloutsUtil("Quad", new RegionUtil[]{quad1, quad2}));
    RegionUtil nbk1 = new RegionUtil(new PositionUtil(135.137, 47.0, -233.7), new PositionUtil(134.7, 48.5, -232.3));
    list.add(new CalloutsUtil("NBK", new RegionUtil[]{nbk1}));
    RegionUtil shroud1 = new RegionUtil(new PositionUtil(124.7, 50.0, -225.3), new PositionUtil(127.7, 52.0, -218.3));
    list.add(new CalloutsUtil("Shroud", new RegionUtil[]{shroud1}));
    RegionUtil squeaky1 = new RegionUtil(new PositionUtil(129.3, 46.0, -230.0), new PositionUtil(135.7, 49.5, -199.3));
    RegionUtil squeaky2 = new RegionUtil(new PositionUtil(127.7, 46.0, -204.7), new PositionUtil(122.0, 49.2, -194.3));
    RegionUtil squeaky3 = new RegionUtil(new PositionUtil(122.0, 46.0, -201.7), new PositionUtil(117.3, 49.2, -194.3));
    list.add(new CalloutsUtil("Squeaky", new RegionUtil[]{squeaky1, squeaky2, squeaky3}));
    RegionUtil aLong1 = new RegionUtil(new PositionUtil(116.99, 47.5, -193.3), new PositionUtil(87.0, 44.0, -199.7));
    list.add(new CalloutsUtil("A Long", new RegionUtil[]{aLong1}));
    RegionUtil aMain1 = new RegionUtil(new PositionUtil(84.3, 44.0, -205.7), new PositionUtil(87.0, 47.5, -212.7));
    RegionUtil aMain2 = new RegionUtil(new PositionUtil(87.0, 46.0, -215.7), new PositionUtil(126.7, 51.0, -208.0));
    RegionUtil aMain3 = new RegionUtil(new PositionUtil(126.7, 46.0, -208.0), new PositionUtil(121.0, 47.5, -206.0));
    RegionUtil aMain4 = new RegionUtil(new PositionUtil(120.7, 46.0, -202.3), new PositionUtil(111.3, 47.5, -208.0));
    list.add(new CalloutsUtil("A Main", new RegionUtil[]{aMain1, aMain2, aMain3, aMain4}));
    RegionUtil lockers1 = new RegionUtil(new PositionUtil(110.99, 47.0, -207.99), new PositionUtil(108.3, 50.5, -203.3));
    list.add(new CalloutsUtil("Lockers", new RegionUtil[]{lockers1}));
    RegionUtil boost1 = new RegionUtil(new PositionUtil(83.0, 44.0, -202.7), new PositionUtil(79.3, 50.0, -211.0));
    RegionUtil boost2 = new RegionUtil(new PositionUtil(82.0, 49.0, -203.0), new PositionUtil(86.7, 52.5, -215.0));
    list.add(new CalloutsUtil("Boost", new RegionUtil[]{boost1, boost2}));
    RegionUtil ticketBooth1 = new RegionUtil(new PositionUtil(92.0, 50.0, -239.0), new PositionUtil(99.0, 52.0, -242.7));
    list.add(new CalloutsUtil("Ticket Booth", new RegionUtil[]{ticketBooth1}));
    RegionUtil heaven1 = new RegionUtil(new PositionUtil(50.0, 44.0, -250.7), new PositionUtil(40.3, 50.5, -247.3));
    RegionUtil heaven2 = new RegionUtil(new PositionUtil(40.7, 49.0, -247.0), new PositionUtil(52.075, 50.5, -238.7));
    list.add(new CalloutsUtil("Heaven", new RegionUtil[]{heaven1, heaven2}));
    RegionUtil catwalk1 = new RegionUtil(new PositionUtil(107.99, 53.0, -237.3), new PositionUtil(104.3, 50.0, -218.3));
    RegionUtil catwalk2 = new RegionUtil(new PositionUtil(108.3, 53.0, -237.3), new PositionUtil(97.576, 50.0, -235.3));
    list.add(new CalloutsUtil("Catwalk", new RegionUtil[]{catwalk1, catwalk2}));
    RegionUtil tSpawn1 = new RegionUtil(new PositionUtil(76.7, 44.0, -139.3), new PositionUtil(52.3, 49.5, -171.7));
    RegionUtil tSpawn2 = new RegionUtil(new PositionUtil(63.3, 44.0, -170.3), new PositionUtil(90.7, 47.5, -179.7));
    RegionUtil tSpawn3 = new RegionUtil(new PositionUtil(32.3, 44.0, -187.7), new PositionUtil(52.7, 45.5, -161.3));
    RegionUtil tSpawn4 = new RegionUtil(new PositionUtil(63.3, 44.0, -181.7), new PositionUtil(78.7, 46.5, -180.3));
    list.add(new CalloutsUtil("T Spawn", new RegionUtil[]{tSpawn1, tSpawn2, tSpawn3, tSpawn4}));
    RegionUtil garage1 = new RegionUtil(new PositionUtil(78.299, 44.0, -182.66), new PositionUtil(64.3, 47.5, -208.7));
    list.add(new CalloutsUtil("Garage", new RegionUtil[]{garage1}));
    RegionUtil useless1 = new RegionUtil(new PositionUtil(62.7, 44.0, -196.3), new PositionUtil(55.3, 45.5, -207.7));
    list.add(new CalloutsUtil("Useless", new RegionUtil[]{useless1}));
    RegionUtil bMain1 = new RegionUtil(new PositionUtil(49.7, 44.0, -189.3), new PositionUtil(43.3, 45.5, -199.7));
    RegionUtil bMain2 = new RegionUtil(new PositionUtil(54.7, 44.0, -205.7), new PositionUtil(33.3, 45.5, -200.3));
    RegionUtil bMain3 = new RegionUtil(new PositionUtil(33.3, 44.0, -200.3), new PositionUtil(40.7, 46.0, -222.7));
    RegionUtil bMain4 = new RegionUtil(new PositionUtil(52.7, 44.0, 223.7), new PositionUtil(40.7, 46.0, -214.7));
    list.add(new CalloutsUtil("B Main", new RegionUtil[]{bMain1, bMain2, bMain3, bMain4}));
    RegionUtil sunRoom1 = new RegionUtil(new PositionUtil(32.7, 44.0, -198.3), new PositionUtil(23.3, 48.5, -217.7));
    list.add(new CalloutsUtil("Sun Room", new RegionUtil[]{sunRoom1}));
    RegionUtil checkers1 = new RegionUtil(new PositionUtil(53.3, 44.0, -219.3), new PositionUtil(59.7, 46.5, -244.7));
    RegionUtil checkers2 = new RegionUtil(new PositionUtil(54.3, 44.0, -237.3), new PositionUtil(54.3, 45.5, -235.3));
    list.add(new CalloutsUtil("Checkers", new RegionUtil[]{checkers1, checkers2}));
    RegionUtil pit1 = new RegionUtil(new PositionUtil(33.3, 42.0, -228.3), new PositionUtil(37.7, 45.5, -231.7));
    list.add(new CalloutsUtil("Pit", new RegionUtil[]{pit1}));
    RegionUtil headshot1 = new RegionUtil(new PositionUtil(21.3, 44.0, -244.7), new PositionUtil(32.7, 47.5, -242.3));
    list.add(new CalloutsUtil("Headshot", new RegionUtil[]{headshot1}));
    RegionUtil backLeft1 = new RegionUtil(new PositionUtil(21.3, 45.0, -228.3), new PositionUtil(25.7, 48.5, -233.7));
    list.add(new CalloutsUtil("Back Left", new RegionUtil[]{backLeft1}));
    RegionUtil bSite1 = new RegionUtil(new PositionUtil(21.3, 45.0, -241.7), new PositionUtil(32.7, 49.5, -234.3));
    RegionUtil bSite2 = new RegionUtil(new PositionUtil(26.3, 45.0, -233.7), new PositionUtil(32.3, 47.0, -228.3));
    RegionUtil bSite3 = new RegionUtil(new PositionUtil(34.7, 44.0, -236.7), new PositionUtil(32.3, 47.0, -232.3));
    list.add(new CalloutsUtil("B Site", new RegionUtil[]{bSite1, bSite2, bSite3}));
    RegionUtil b1 = new RegionUtil(new PositionUtil(51.7, 44.0, -228.0), new PositionUtil(35.3, 45.5, -244.7));
    RegionUtil b2 = new RegionUtil(new PositionUtil(34.7, 44.0, -244.7), new PositionUtil(33.3, 46.5, -237.3));
    list.add(new CalloutsUtil("B", new RegionUtil[]{b1, b2}));
    RegionUtil cubby1 = new RegionUtil(new PositionUtil(86.7, 44.0, -216.7), new PositionUtil(80.0, 45.5, -211.3));
    list.add(new CalloutsUtil("Cubby", new RegionUtil[]{cubby1}));
    RegionUtil mid1 = new RegionUtil(new PositionUtil(79.8, 44.0, -211.3), new PositionUtil(63.316, 47.0, -216.8));
    RegionUtil mid2 = new RegionUtil(new PositionUtil(79.7, 44.0, -218.114), new PositionUtil(68.3, 45.5, -219.8));
    RegionUtil mid3 = new RegionUtil(new PositionUtil(68.3, 44.0, -220.1), new PositionUtil(78.1, 45.5, -231.7));
    RegionUtil mid4 = new RegionUtil(new PositionUtil(72.3, 44.0, -241.7), new PositionUtil(76.6, 45.5, -232.0));
    RegionUtil mid5 = new RegionUtil(new PositionUtil(71.9, 44.0, -232.0), new PositionUtil(68.0, 45.5, -238.7));
    RegionUtil mid6 = new RegionUtil(new PositionUtil(67.9, 44.0, -233.0), new PositionUtil(63.3, 45.5, -239.7));
    list.add(new CalloutsUtil("Mid", new RegionUtil[]{mid1, mid2, mid3, mid4, mid5, mid6}));
    RegionUtil vent1 = new RegionUtil(new PositionUtil(63.1, 47.5, -216.3), new PositionUtil(59.3, 48.0, -222.1));
    list.add(new CalloutsUtil("Vent", new RegionUtil[]{vent1}));
    RegionUtil midHouse1 = new RegionUtil(new PositionUtil(69.2, 48.0, -216.7), new PositionUtil(63.3, 51.5, -231.2));
    list.add(new CalloutsUtil("Mid House", new RegionUtil[]{midHouse1}));
    RegionUtil rail1 = new RegionUtil(new PositionUtil(79.7, 48.0, -219.7), new PositionUtil(79.0, 49.5, -232.2));
    list.add(new CalloutsUtil("Rail", new RegionUtil[]{rail1}));
    RegionUtil sandBags1 = new RegionUtil(new PositionUtil(68.0, 44.0, -233.1), new PositionUtil(63.3, 45.5, -230.3));
    list.add(new CalloutsUtil("Sand Bags", new RegionUtil[]{sandBags1}));
    RegionUtil z1 = new RegionUtil(new PositionUtil(64.7, 46.0, -238.7), new PositionUtil(72.2, 44.5, -241.6));
    RegionUtil z2 = new RegionUtil(new PositionUtil(63.3, 46.5, -242.0), new PositionUtil(75.7, 44.0, -254.0));
    list.add(new CalloutsUtil("Z", new RegionUtil[]{z1, z2}));
    RegionUtil whiteBox1 = new RegionUtil(new PositionUtil(76.7, 46.5, -231.7), new PositionUtil(79.7, 48.0, -235.2));
    RegionUtil whiteBox2 = new RegionUtil(new PositionUtil(81.2, 45.5, -237.2), new PositionUtil(78.8, 47.0, -235.3));
    list.add(new CalloutsUtil("White Box", new RegionUtil[]{whiteBox1, whiteBox2}));
    RegionUtil highway1 = new RegionUtil(new PositionUtil(80.3, 44.5, -242.7), new PositionUtil(92.9, 47.5, -235.3));
    RegionUtil highway2 = new RegionUtil(new PositionUtil(76.9, 44.0, -235.3), new PositionUtil(79.5, 44.0, -241.6));
    list.add(new CalloutsUtil("Highway", new RegionUtil[]{highway1, highway2}));
    RegionUtil topA1 = new RegionUtil(new PositionUtil(113.7, 51.5, -237.3), new PositionUtil(124.3, 49.0, -231.7));
    list.add(new CalloutsUtil("Top A", new RegionUtil[]{topA1}));
    RegionUtil window1 = new RegionUtil(new PositionUtil(75.7, 47.0, -244.3), new PositionUtil(71.7, 48.5, -245.3));
    list.add(new CalloutsUtil("Window", new RegionUtil[]{window1}));
    return list;
  }

}