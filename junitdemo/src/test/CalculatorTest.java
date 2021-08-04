package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import business.Calculator;

public class CalculatorTest {
	private Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		double result=calc.add(10.00,10.55);
		assertEquals(20.55, result,0);
	}

	@Test
	public void testSubtract() {
		double result=calc.subtract(100.5,95);
		assertEquals(5.5, result,0);
	}

	@Test
	public void testMultiply() {
		double result=calc.multiply(100,2.5);
		assertEquals(250, result,0);
	}

	@Test
	public void testDivide() {
		double result=calc.divide(4,2);
		assertEquals(2, result,0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		calc.divide(200,0);	
	}

}