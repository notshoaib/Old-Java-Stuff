package com.fdmgroup.javaintro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testEvaluateSingleDigitSuccess() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("6");

		assertTrue(result == 6.0);

	}
	@Test
	public void testEvaluateDifferentSingleDigitSuccess() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("7");

		assertTrue(result == 7.0);

	}
	@Test
	public void testEvaluateDifferentLetter() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("a");

		assertTrue(result == -1);

	}
	
	@Test
	public void testEvaluateReturnsAddition() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("5+2");

		assertTrue(result == 7.0);

	}
	
	@Test
	public void testEvaluateReturnsSubtraction() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("1-2");

		assertTrue(result == -1.0);

	}
	@Test
	public void testEvaluateReturnsAddSub() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("9-4-2+2");

		assertTrue(result == 5.0);

	}
	@Test
	public void testEvaluateMultiply() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("9*2+2*2*10/5+5");

		assertTrue(result == 31.0);

	}
	@Test
	public void testEvaluateDivide() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("6/6");

		assertTrue(result == 1.0);

	}
	@Test
	public void testEvaluateAll() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("-5*2-2*3+4/2+1-1+7-3");

		assertTrue(result ==-10.0);

	}
	
	@Test
	public void testEvaluateNegativeAddition() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("-2-2-3-5");

		assertTrue(result == -12.0);

	}
	@Test
	public void testEvaluateNegativeAdditionAndMultiplication() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("-2-2*6");

		assertTrue(result == -14.0);

	}
	
	@Test
	public void testEvaluateNegativeMultiplication() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("-5*3");

		assertTrue(result ==-15.0);

	}
	@Test
	public void testEvaluateNegativeMultiplicationTreeTimes() {

		Calculator calc = new Calculator();
		double result = calc.evaluate("-5*-3*-4");

		assertTrue(result ==-60.0);

	}

}
