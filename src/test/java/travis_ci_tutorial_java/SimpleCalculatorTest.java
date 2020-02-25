package travis_ci_tutorial_java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 5), 10);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(10, 5), 2);
	}
}
