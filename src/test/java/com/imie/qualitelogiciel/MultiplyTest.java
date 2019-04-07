package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplyTest {

  @Test
  public final void multiplyerTest1() throws OutOfRangeException {
    assertTrue(2.0 * 2.0 == Multiply.multiplyer(2.0, 2.0));
  }

  @Test
  public final void multiplyerTest2() throws OutOfRangeException {
    assertTrue(-1.0 * 2.0 == Multiply.multiplyer(-1.0, 2.0));
  }

  @Test
  public final void multiplyerTest3() throws OutOfRangeException {
    assertTrue(2.0 * -1.0 == Multiply.multiplyer(2.0, -1.0));
  }

  @Test
  public final void multiplyerTest4() throws OutOfRangeException {
    assertTrue(0.0 * 2.0 == Multiply.multiplyer(0.0, 2.0));
  }

  @Test
  public final void multiplyerTest5() throws OutOfRangeException {
    assertTrue(0.0 * -1.0 == Multiply.multiplyer(0.0, -1.0));
  }

  @Test
  public final void multiplyerTest6() throws OutOfRangeException {
    assertTrue(2.0 * 0.0 == Multiply.multiplyer(2.0, 0.0));
  }

  @Test
  public final void multiplyerTest7() throws OutOfRangeException {
    assertTrue(-1.0 * 0.0 == Multiply.multiplyer(-1.0, 0.0));
  }

  @Test
  public final void multiplyerTest8() throws OutOfRangeException {
    assertTrue(-1.0 * -1.0 == Multiply.multiplyer(-1.0, -1.0));
  }

  @Test(expected = OutOfRangeException.class)
  public final void multiplyerTest9() throws OutOfRangeException {
    assertTrue(Double.MAX_VALUE * Double.MAX_VALUE == Multiply.multiplyer(Double.MAX_VALUE, Double.MAX_VALUE));
  }

  @Test
  public final void multiplyerTest10() throws OutOfRangeException {
    assertTrue(Double.MAX_VALUE * 0.0 == Multiply.multiplyer(Double.MAX_VALUE, 0.0));
  }

  @Test
  public final void multiplyerTest11() throws OutOfRangeException {
    assertTrue(-1.0 * Double.MAX_VALUE == Multiply.multiplyer(-1.0, Double.MAX_VALUE));
  }

  @Test(expected = OutOfRangeException.class)
  public final void multiplyerTest12() throws OutOfRangeException {
    assertTrue(Double.MIN_VALUE * Double.MIN_VALUE == Multiply.multiplyer(Double.MIN_VALUE, Double.MIN_VALUE));
  }

  @Test
  public final void multiplyerTest13() throws OutOfRangeException {
    assertTrue(Double.MIN_VALUE * 0.0 == Multiply.multiplyer(Double.MIN_VALUE, 0.0));
  }

  @Test
  public final void multiplyerTest14() throws OutOfRangeException {
    assertTrue(-1.0 * Double.MIN_VALUE == Multiply.multiplyer(-1.0, Double.MIN_VALUE));
  }

}
