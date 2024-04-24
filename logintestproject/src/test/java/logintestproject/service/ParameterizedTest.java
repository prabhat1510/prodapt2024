package logintestproject.service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest {

	@org.junit.jupiter.params.ParameterizedTest
	@ValueSource(ints = { 2, 4 })
	//@Test
	void checkEvenNumber(int number) {
		assertEquals(0, number % 2, 
		             "Supplied number is not an even number");
	}
}
