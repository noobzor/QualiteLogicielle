package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplyTest {
	
	@Test
	public final void MultiplyerTest() {
		assertTrue(3.0*1.0 == Multiply.Multiplyer(3.0, 1.0));
		assertTrue(3.0*-1.0 == Multiply.Multiplyer(3.0, -1.0));
		assertTrue(-3.0*-2.0 == Multiply.Multiplyer(-3.0, -2.0));
	}
}
