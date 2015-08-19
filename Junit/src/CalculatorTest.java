import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	Calculator calc=new Calculator();
	@Test
	public void testAdd() {
		
		assertEquals(9, calc.add(3, 6));
	}

	@Test
	public void testSubtract() {
		assertEquals(3,calc.subtract(6, 3));
	}

}
