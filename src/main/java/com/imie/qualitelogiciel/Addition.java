package com.imie.qualitelogiciel;

public class Addition {

  public static Double additionner(Double a, Double b) throws OutOfRangeException {
	  if (a > 0 && b > 0 && (Double.MAX_VALUE - a) < b) {
		  throw new OutOfRangeException();
	  } else if (a < 0 && b < 0 && (Double.MIN_VALUE - a) < b) {
		  throw new OutOfRangeException();		  
	  }
    return a+b;
  }
}
