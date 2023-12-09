package io.github.iamnoyou.calloutsmod.util;

import lombok.Getter;

@Getter
public class RegionUtil {

  private PositionUtil pos1;
  private PositionUtil pos2;

  public RegionUtil(PositionUtil pos1, PositionUtil pos2) {
    if (pos1 == null || pos2 == null) {
      throw new IllegalArgumentException("Positions cannot be null! Position 1: " + pos1 + " : Position 2: " + pos2);
    }

    this.pos1 = pos1;
    this.pos2 = pos2;
  }

  public double getMinX() {
    return Math.min(this.pos1.getX(), this.pos2.getX());
  }

  public double getMinY() {
    return Math.min(this.pos1.getY(), this.pos2.getY());
  }

  public double getMinZ() {
    return Math.min(this.pos1.getZ(), this.pos2.getZ());
  }

  public double getMaxX() {
    return Math.max(this.pos1.getX(), this.pos2.getX());
  }

  public double getMaxY() {
    return Math.max(this.pos1.getY(), this.pos2.getY());
  }

  public double getMaxZ() {
    return Math.max(this.pos1.getZ(), this.pos2.getZ());
  }

  public boolean isInside(PositionUtil pos) {
    double x = pos.getX();
    double y = pos.getY();
    double z = pos.getZ();

    return x >= getMinX() && x <= getMaxX() &&
        y >= getMinY() && y <= getMaxY() &&
        z >= getMinZ() && z <= getMaxZ();
  }

  public static RegionUtil createRegion(PositionUtil pos1, PositionUtil pos2) {
    return new RegionUtil(pos1, pos2);
  }
}