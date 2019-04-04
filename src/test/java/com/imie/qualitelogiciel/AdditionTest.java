package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdditionTest {

  @Test
  public final void AdditionTest1() throws OutOfRangeException {
    assertTrue(2.0+2.0 == Addition.additionner(2.0, 2.0));
  }
  
  @Test
  public final void AdditionTest2() throws OutOfRangeException {
    assertTrue(1.0+2.0 == Addition.additionner(1.0, 2.0));
  }

  @Test
  public final void AdditionTest3() throws OutOfRangeException {
    assertTrue(2.0+-1.0 == Addition.additionner(2.0, -1.0));
  }

  @Test
  public final void AdditionTest4() throws OutOfRangeException {
    assertTrue(0.0+2.0 == Addition.additionner(0.0, 2.0));
  }

  @Test
  public final void AdditionTest5() throws OutOfRangeException {
    assertTrue(2.0+-1.0 == Addition.additionner(2.0, -1.0));
  }

  @Test
  public final void AdditionTest6() throws OutOfRangeException {
    assertTrue(2.0+0.0 == Addition.additionner(2.0, 0.0));
  }

  @Test
  public final void AdditionTest7() throws OutOfRangeException {
    assertTrue(-1.0+0.0 == Addition.additionner(-1.0, 0.0));
  }

  @Test
  public final void AdditionTest8() throws OutOfRangeException {
    assertTrue(-1.0+-1.0 == Addition.additionner(-1.0, -1.0));
  }

  @Test(expected = OutOfRangeException.class)
  public final void AdditionTest9() throws OutOfRangeException {
    assertTrue(Double.MAX_VALUE + 1.0 == Addition.additionner(Double.MAX_VALUE, 1.0));
  }

}
