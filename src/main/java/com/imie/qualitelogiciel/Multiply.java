package com.imie.qualitelogiciel;

public class Multiply {
  public static Double multiplyer(Double a, Double b) throws OutOfRangeException {
	if (Double.isInfinite(a * b)) {
		throw new OutOfRangeException();
	} else if (Double.MIN_VALUE / a >= 1.0 && a != 0.0 && b != 0.0) {
		throw new OutOfRangeException();
	}
	return a * b;
  }
}
