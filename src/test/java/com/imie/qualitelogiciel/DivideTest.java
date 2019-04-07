package com.imie.qualitelogiciel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivideTest {

  @Test
  public final void dividerTest() {
    assertTrue(Double.isInfinite(Divide.divider(-3.0, 0.0)));
  }

  @Test
  public final void dividerTest1() {
    assertEquals((Double) (2.0 / 2.0), Divide.divider(2.0,2.0));
  }

  @Test
  public final void dividerTest2() {
    assertEquals((Double) (-1.0 / 2.0), Divide.divider(-1.0, 2.0));
  }

  @Test
  public final void dividerTest3() {
    assertEquals((Double) (2.0 / -1.0), Divide.divider(2.0, -1.0));
  }

  @Test
  public final void dividerTest4() {
    assertEquals((Double) (0.0 / 2.0), Divide.divider(0.0, 2.0));
  }

  @Test
  public final void dividerTest5() {
    assertEquals((Double) (0.0 / -1.0), Divide.divider(0.0, -1.0));
  }

  @Test
  public final void dividerTest6() {
    assertTrue(Double.isInfinite(Divide.divider(2.0, 0.0)));
  }

  @Test
  public final void dividerTest7() {
    assertTrue(Double.isInfinite(Divide.divider(-1.0, 0.0)));
  }

  @Test
  public final void dividerTest8() {
      assertEquals((Double) (-1.0 / -1.0), Divide.divider(-1.0, -1.0));
  }

  @Test
  public final void dividerTest9() {
    assertEquals((Double) (1.0), Divide.divider(Double.MAX_VALUE, Double.MAX_VALUE));
  }

  @Test
  public final void dividerTest10() {
    assertTrue(Double.isInfinite(Divide.divider(Double.MAX_VALUE, 0.0)));
  }

  @Test
  public final void dividerTest11() {
    assertEquals((Double) (-1.0 / Double.MAX_VALUE), Divide.divider(-1.0, Double.MAX_VALUE));
  }

  @Test
  public final void dividerTest12() {
    assertEquals((Double) (Double.MIN_VALUE / Double.MIN_VALUE), Divide.divider(Double.MIN_VALUE, Double.MIN_VALUE));
  }

  @Test
  public final void dividerTest13() {
    assertTrue(Double.isInfinite(Divide.divider(Double.MIN_VALUE, 0.0)));
  }

  @Test
  public final void dividerTest14() {
    assertEquals((Double) (-1.0 / Double.MIN_VALUE), Divide.divider(-1.0, Double.MIN_VALUE));
  }
}
