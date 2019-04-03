package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubstractTest {
	@Test
	public final void SubstracterTest() {
		assertTrue(-3.0 - 0.0 == Substract.Substracter(-3.0, 0.0));
	}

	@Test
	public final void SubstracterTest1() {
		assertTrue(2.0 - 2.0 == Substract.Substracter(2.0,2.0));
	}

	@Test
	public final void SubstracterTest2() {
		assertTrue(-1.0 - 2.0 == Substract.Substracter(-1.0, 2.0));
	}
	
	@Test
	public final void SubstracterTest3() {
		assertTrue(2.0 - -1.0 == Substract.Substracter(2.0, -1.0));
	}
	
	@Test
	public final void SubstracterTest4() {
		assertTrue(0.0 - 2.0 == Substract.Substracter(0.0, 2.0));
	}
	
	@Test
	public final void SubstracterTest5() {
		assertTrue(0.0 - -1.0 == Substract.Substracter(0.0, -1.0));
	}
	
	@Test
	public final void SubstracterTest6() {
		assertTrue(-2.0-0.0 == Substract.Substracter(2.0, 0.0));
	}
	
	@Test
	public final void SubstracterTest7() {
		assertTrue( -1.0 - 0.0 == Substract.Substracter(-1.0, 0.0));
	}
	
	@Test
	public final void SubstracterTest8() {
		assertTrue(-1.0- -1.0 == Substract.Substracter(-1.0, -1.0));
	}
	
	@Test(expected = OutOfRangeException.class)
	public final void SubstracterTest9() {
		assertTrue(Double.MAX_VALUE - Double.MAX_VALUE == Substract.Substracter(Double.MAX_VALUE, Double.MAX_VALUE));
	}
	
	@Test
	public final void SubstracterTest10() {
		assertTrue(Double.MIN_VALUE - 0.0 == Substract.Substracter(Double.MAX_VALUE, 0.0));
	}
	
	@Test
	public final void SubstracterTest11() {
		assertTrue(-1.0 - Double.MAX_VALUE == Substract.Substracter(-1.0, Double.MAX_VALUE));
	}
	
	@Test
	public final void SubstracterTest12() {
		assertTrue(Double.MIN_VALUE - Double.MIN_VALUE == Substract.Substracter(Double.MIN_VALUE, Double.MIN_VALUE));
	}
	
	@Test
	public final void SubstracterTest13() {
		assertTrue(Double.MIN_VALUE - 0.0 == Substract.Substracter(Double.MIN_VALUE, 0.0));
	}
	
	@Test(expected = OutOfRangeException.class)
	public final void SubstracterTest14() {
		assertTrue(-1.0-Double.MIN_VALUE == Substract.Substracter(-1.0, Double.MIN_VALUE));
	}
}
