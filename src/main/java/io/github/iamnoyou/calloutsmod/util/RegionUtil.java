package io.github.iamnoyou.calloutsmod.util;

import lombok.Getter;

@Getter
public class RegionUtil {

  private PositionUtil pos1;
  private PositionUtil pos2;

  public RegionUtil(PositionUtil pos1, PositionUtil pos2) {
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
    if (!(pos.getX() < this.getMinX()) && !(pos.getX() > this.getMaxX())) {
      if (!(pos.getY() < this.getMinY()) && !(pos.getY() > this.getMaxY())) {
        return !(pos.getZ() < this.getMinZ()) && !(pos.getZ() > this.getMaxZ());
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}