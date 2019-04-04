package com.imie.qualitelogiciel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorInterfaceTest {
	
	@Test
	public final void AdditionTest1() {
		CalculatorInterface calc =new CalculatorInterface();
		calc.operate(5.0);
		assertTrue(calc.nb1 == 5.0);
	}
	
	@Test
	public final void AdditionTest2() {
		CalculatorInterface calc =new CalculatorInterface();
		calc.operate(5.0);
		calc.operate(5.0);
		assertTrue(calc.nb1 == 55.0);
	}
	
	@Test
	public final void AdditionTest3() {
		CalculatorInterface calc =new CalculatorInterface();
		calc.operate(0.0);
		calc.operate(5.0);
		assertTrue(calc.nb1 == 5.0);
	}
}
