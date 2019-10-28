package calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokenizerTest {
	Tokenizer expression;
	

	@Test
	void checkValidExpressiontest() {
		expression= new Tokenizer() ;
		boolean result=expression.checkExpression("3 + 5");
		assertTrue(result);
	}
	
	@Test
	void checkInvalidExpressiontest() {
		expression= new Tokenizer() ;
		boolean result=expression.checkExpression(null);
		assertFalse(result);
	}

}

