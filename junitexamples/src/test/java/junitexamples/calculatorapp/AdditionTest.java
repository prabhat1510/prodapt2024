package junitexamples.calculatorapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import org.junit.jupiter.api.Test;

public class AdditionTest {
	
	//private Addition addition ;
	
	@Test
	void testCalculateSuccess() {
		Addition addition =new Addition();
		Integer result = addition.calculate(15, 10);
		assertEquals(25,result);
	}
	
	@Test
	void testCalculateNotSuccess() {
		Addition addition =new Addition();
		Integer result = addition.calculate(11, 10);
		assertNotEquals(25,result);
	}
	
	@Test
	void testCalculateResultNegatives() {
		Addition addition =new Addition();
		Integer result = addition.calculate(15, -20);
		assertEquals(-5,result);
	}
	
	/*
	 * @Test void testCalculateResultNull() { Addition addition =new Addition();
	 * Integer result = addition.calculate(null,null); assertEquals(null,result); }
	 */
}
