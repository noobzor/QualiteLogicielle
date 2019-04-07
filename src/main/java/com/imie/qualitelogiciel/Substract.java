package com.imie.qualitelogiciel;

public class Substract {

  public static Double substracter(final Double a, final Double b) throws OutOfRangeException {
    if (a > 0 && b < 0 && (Double.MAX_VALUE - a) < b) {
      throw new OutOfRangeException();
    } else if (a < 0 && b > 0 && (Double.MAX_VALUE + a) <= Math.abs(b)) {
      throw new OutOfRangeException();
    }
    return a - b;
  }
}
