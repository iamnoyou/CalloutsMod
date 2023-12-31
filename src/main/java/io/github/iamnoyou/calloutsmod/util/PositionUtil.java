package io.github.iamnoyou.calloutsmod.util;

import lombok.Getter;

@Getter
public class PositionUtil {

  private double x;
  private double y;
  private double z;

  public PositionUtil(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public String toString() {
    return String.format("%.2f, %.2f, %.2f", x, y, z);
  }

}