package calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

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
	void checkValidDivisionExpressiontest() {
		expression= new Tokenizer() ;
		boolean result=expression.checkExpression("3 / 5.2");
		assertTrue(result);
	}
	
	@Test
	void checkNulltest() {
		expression= new Tokenizer() ;
		boolean result=expression.checkExpression(null);
		assertFalse(result);
	}
	
	@Test
	void checkInvalidExpressiontest() {
		expression= new Tokenizer() ;
		boolean result=expression.checkExpression("5+6x");
		assertFalse(result);
	}
	
	@Test 
	void setInvalidExpression() {
		try {
			expression= new Tokenizer();
			expression.set("23+5+");
		}catch(InvalidParameterException e) {
			System.out.println(e);
		}
	}
	
	@Test 
	void setValidExpression() {
		try {
			expression= new Tokenizer();
			expression.set("15/3");
		}catch(InvalidParameterException e) {
			System.out.println(e);
		}
	}
	
	
}

