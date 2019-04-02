package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplyTest {
	
	@Test
	public final void MultiplyerTest1() {
		assertTrue(2.0*2.0 == Multiply.Multiplyer(2.0,2.0));
	}

	@Test
	public final void MultiplyerTest2() {
		assertTrue(-1.0*2.0 == Multiply.Multiplyer(-1.0, 2.0));
	}
	
	@Test
	public final void MultiplyerTest3() {
		assertTrue(2.0*-1.0 == Multiply.Multiplyer(2.0, -1.0));
	}
	
	@Test
	public final void MultiplyerTest4() {
		assertTrue(0.0*2.0 == Multiply.Multiplyer(0.0, 2.0));
	}
	
	@Test
	public final void MultiplyerTest5() {
		assertTrue(0.0*-1.0 == Multiply.Multiplyer(0.0, -1.0));
	}
	
	@Test
	public final void MultiplyerTest6() {
		assertTrue(2.0*0.0 == Multiply.Multiplyer(2.0, 0.0));
	}
	
	@Test
	public final void MultiplyerTest7() {
		assertTrue(-1.0*0.0 == Multiply.Multiplyer(-1.0, 0.0));
	}
	
	@Test
	public final void MultiplyerTest8() {
		assertTrue(-1.0*-1.0 == Multiply.Multiplyer(-1.0, -1.0));
	}
	
	@Test
	public final void MultiplyerTest9() {
		assertTrue(Double.MAX_VALUE*Double.MAX_VALUE == Multiply.Multiplyer(Double.MAX_VALUE, Double.MAX_VALUE));
	}
	
	@Test
	public final void MultiplyerTest10() {
		assertTrue(Double.MAX_VALUE*0.0 == Multiply.Multiplyer(Double.MAX_VALUE, 0.0));
	}
	
	@Test
	public final void MultiplyerTest11() {
		assertTrue(-1.0*Double.MAX_VALUE == Multiply.Multiplyer(-1.0, Double.MAX_VALUE));
	}
	
	@Test
	public final void MultiplyerTest12() {
		assertTrue(Double.MIN_VALUE*Double.MIN_VALUE == Multiply.Multiplyer(Double.MIN_VALUE, Double.MIN_VALUE));
	}
	
	@Test
	public final void MultiplyerTest13() {
		assertTrue(Double.MIN_VALUE*0.0 == Multiply.Multiplyer(Double.MIN_VALUE, 0.0));
	}
	
	@Test
	public final void MultiplyerTest14() {
		assertTrue(-1.0*Double.MIN_VALUE == Multiply.Multiplyer(-1.0, Double.MIN_VALUE));
	}

}
