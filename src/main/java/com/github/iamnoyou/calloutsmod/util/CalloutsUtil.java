package com.github.iamnoyou.calloutsmod.util;

import lombok.Getter;

@Getter
public class CalloutsUtil {

  public String name;
  public RegionUtil[] regions;

  public CalloutsUtil(String name, RegionUtil[] regions) {
    this.name = name;
    this.regions = regions;
  }

}