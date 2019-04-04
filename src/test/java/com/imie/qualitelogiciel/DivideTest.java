package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivideTest {

  @Test
  public final void DividerTest() {
    assertTrue(Double.isInfinite(Divide.divider(-3.0, 0.0)));
  }

  @Test
  public final void DividerTest1() {
    assertTrue(2.0/2.0 == Divide.divider(2.0,2.0));
  }

  @Test
  public final void DividerTest2() {
    assertTrue(-1.0/2.0 == Divide.divider(-1.0, 2.0));
  }
  
  @Test
  public final void DividerTest3() {
    assertTrue(2.0/-1.0 == Divide.divider(2.0, -1.0));
  }
  
  @Test
  public final void DividerTest4() {
    assertTrue(0.0/2.0 == Divide.divider(0.0, 2.0));
  }
  
  @Test
  public final void DividerTest5() {
    assertTrue(0.0/-1.0 == Divide.divider(0.0, -1.0));
  }
  
  @Test
  public final void DividerTest6() {
    assertTrue(Double.isInfinite(Divide.divider(2.0, 0.0)));
  }
  
  @Test
  public final void DividerTest7() {
    assertTrue(Double.isInfinite(Divide.divider(-1.0, 0.0)));
  }
  
  @Test
  public final void DividerTest8() {
      assertTrue(-1.0/-1.0 == Divide.divider(-1.0, -1.0));
  }
  
  @Test(expected = OutOfRangeException.class)
  public final void DividerTest9() {
    assertTrue(Double.MAX_VALUE/Double.MAX_VALUE == Divide.divider(Double.MAX_VALUE, Double.MAX_VALUE));
  }
  
  @Test
  public final void DividerTest10() {
    assertTrue(Double.isInfinite(Divide.divider(Double.MAX_VALUE, 0.0)));
  }
  
  @Test
  public final void DividerTest11() {
    assertTrue(-1.0/Double.MAX_VALUE == Divide.divider(-1.0, Double.MAX_VALUE));
  }
  
  @Test
  public final void DividerTest12() {
    assertTrue(Double.MIN_VALUE/Double.MIN_VALUE == Divide.divider(Double.MIN_VALUE, Double.MIN_VALUE));
  }
  
  @Test
  public final void DividerTest13() {
    assertTrue(Double.isInfinite(Divide.divider(Double.MIN_VALUE, 0.0)));
  }
  
  @Test
  public final void DividerTest14() {
    assertTrue(-1.0/Double.MIN_VALUE == Divide.divider(-1.0, Double.MIN_VALUE));
  }
}
