package travis_ci_tutorial_java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 0);
	}
}
