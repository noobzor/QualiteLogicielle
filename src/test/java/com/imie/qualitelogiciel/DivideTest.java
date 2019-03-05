package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivideTest {

	@Test
	public final void DividerTest() {
		assertTrue(3.0/1.0 == Divide.Divider(3.0, 1.0));
		assertTrue(3.0/-1.0 == Divide.Divider(3.0, -1.0));
		assertTrue(-3.0/-2.0 == Divide.Divider(-3.0, -2.0));
	}
	
	@Test(expected=ArithmeticException.class)
	public void DividerTestDivisionByZero(){
		Divide.Divider(3.0, 0.0);
	}
}
