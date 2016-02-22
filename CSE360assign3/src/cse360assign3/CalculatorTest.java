package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}
	
	@Test
	public void testGetTotal () {
		Calculator test = new Calculator();
		assertEquals(test.getTotal(),0);
	}
	
	@Test
	public void testAdd () {
		Calculator test = new Calculator();
		test.add(5);
		assertEquals(test.getTotal(),5);
	}
	
	@Test
	public void testSubtract () {
		Calculator test = new Calculator();
		test.add(5);
		test.subtract(1);
		assertEquals(test.getTotal(),4);
	}
	
	@Test
	public void testMultiply () {
		Calculator test = new Calculator();		
		test.add(4);
		test.multiply(2);
		assertEquals(test.getTotal(),8);
	}
	
	@Test
	public void testDivide () {
		Calculator test = new Calculator();
		test.add(8);
		test.divide(2);
		assertEquals(test.getTotal(),4);
		test.divide(0);
		assertEquals(test.getTotal(),0);
	}
	
	@Test
	public void testGetHistory () {
		fail("Not build yet");
	}


}
