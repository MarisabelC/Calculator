package calculator.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class TokenTest {

	Token token;
	@Test
	public void  isNumericTest() {
		token = new Token("68", Type.NUMBER);
		boolean result = token.isNumeric();
		assertTrue(result);
	}

	@Test
	public void  isOperatorTest() {
		token = new Token("-", Type.OPERATOR);
		boolean result = token.isNumeric();
		assertFalse(result);
	}
	
	@Test
	public void  getNumericValueTest() {
		token = new Token("896", Type.NUMBER);
		String result = token.getValue();
		assertEquals("896", result);
	}
	
	@Test
	public void  getOperatorValueTest() {
		token = new Token("%", Type.OPERATOR);
		String result = token.getValue();
		assertEquals("%", result);
	}
	
}
