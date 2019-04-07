package com.imie.qualitelogiciel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstractTest {
  @Test
  public final void substracterTest() throws OutOfRangeException {
	assertEquals((Double) (-3.0 - 0.0), Substract.substracter(-3.0, 0.0));
	// assert negative and 0
  }

  @Test
  public final void substracterTest1() throws OutOfRangeException {
	assertEquals((Double) (2.0 - 2.0), Substract.substracter(2.0, 2.0));
	// assert positive and positive
  }

  @Test
  public final void substracterTest2() throws OutOfRangeException {
	assertEquals((Double) (-1.0 - 2.0), Substract.substracter(-1.0, 2.0));
  }

  @Test
  public final void substracterTest3() throws OutOfRangeException {
	assertEquals((Double) (2.0 - -1.0), Substract.substracter(2.0, -1.0));
  }

  @Test
  public final void substracterTest4() throws OutOfRangeException {
	assertEquals((Double) (0.0 - 2.0), Substract.substracter(0.0, 2.0));
  }

  @Test
  public final void substracterTest5() throws OutOfRangeException {
	assertEquals((Double) (0.0 - -1.0), Substract.substracter(0.0, -1.0));
  }

  @Test
  public final void substracterTest6() throws OutOfRangeException {
	assertEquals((Double) (-2.0 - 0.0), Substract.substracter(-2.0, 0.0));
  }

  @Test
  public final void substracterTest7() throws OutOfRangeException {
	assertEquals((Double) (-1.0 - 0.0), Substract.substracter(-1.0, 0.0));
  }

  @Test
  public final void substracterTest8() throws OutOfRangeException {
	assertEquals((Double) (-1.0 - -1.0), Substract.substracter(-1.0, -1.0));
  }

  @Test
  public final void substracterTest9() throws OutOfRangeException {
	assertEquals((Double) (Double.MAX_VALUE - Double.MAX_VALUE),
	  Substract.substracter(Double.MAX_VALUE, Double.MAX_VALUE));
  }

  @Test
  public final void substracterTest10() throws OutOfRangeException {
	assertEquals((Double) (Double.MIN_VALUE - 0.0), Substract.substracter(Double.MIN_VALUE, 0.0));
  }

  @Test(expected = OutOfRangeException.class)
  public final void substracterTest11() throws OutOfRangeException {
	assertEquals((Double) (-1.0 - Double.MAX_VALUE), Substract.substracter(-1.0, Double.MAX_VALUE));
  }

  @Test
  public final void substracterTest12() throws OutOfRangeException {
	assertEquals((Double) (Double.MIN_VALUE - Double.MIN_VALUE),
	  Substract.substracter(Double.MIN_VALUE, Double.MIN_VALUE));
  }

  @Test
  public final void substracterTest13() throws OutOfRangeException {
    assertEquals((Double) (Double.MIN_VALUE - 0.0), Substract.substracter(Double.MIN_VALUE, 0.0));
  }

  @Test
  public final void substracterTest14() throws OutOfRangeException {
    assertEquals((Double) (-1.0 - Double.MIN_VALUE), Substract.substracter(-1.0, Double.MIN_VALUE));
  }
}
