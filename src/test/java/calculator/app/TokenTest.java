package calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokenTest {

	Token token;
	@Test
	void isNumericTest() {
		token = new Token("68", Type.NUMBER);
		boolean result = token.isNumeric();
		assertTrue(result);
	}

	@Test
	void isOperatorTest() {
		token = new Token("-", Type.OPERATOR);
		boolean result = token.isNumeric();
		assertFalse(result);
	}
}
