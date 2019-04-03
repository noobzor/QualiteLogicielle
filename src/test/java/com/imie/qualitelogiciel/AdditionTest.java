package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdditionTest {

	@Test
	public final void AdditionTest() {
		assertTrue(2.0+2 == Addition.Additionner(2, 2));
	}
	
	@Test
	public final void AdditionTest() {
		assertTrue(1.0+2 == Addition.Additionner(1, 2));
	}

	@Test
	public final void AdditionTest() {
		assertTrue(2.0+-1 == Addition.Additionner(2, -1));
	}

	@Test
	public final void AdditionTest() {
		assertTrue(0.0+2 == Addition.Additionner(0, 2));
	}

	@Test
	public final void AdditionTest() {
		assertTrue(2.0+-1 == Addition.Additionner(2, -1));
	}

	@Test
	public final void AdditionTest() {
		assertTrue(2.0+0 == Addition.Additionner(2, 0));
	}

	@Test
	public final void AdditionTest() {
		assertTrue(-1.0+0 == Addition.Additionner(-1, 0));
	}

	@Test
	public final void AdditionTest() {
		assertTrue(-1.0+-1 == Addition.Additionner(-1, -1));
	}

	@Test(expected = OutOfRangeException.class)
	public final void AdditionTest() {
		assertTrue(Double.MAX_VALUE + 1 == Addition.Additionner(Double.MAX_VALUE, 1))
	}

}
