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
	
	@Test 
	void checkMoreToken() {
		expression= new Tokenizer();
		expression.set("8-3");
		boolean result = expression.isMoreToken();
		assertTrue(result);
	}
	
	
	@Test 
	void getNextTokenTest() {
		expression= new Tokenizer();
		expression.set(" 30 % 5");
		expression.isMoreToken();
		Token token= expression.getNextToken();
		assertEquals("30", token.getValue());
	}
	
	@Test
	void getAllTokensTest() {
		Token token;
		expression= new Tokenizer();
		expression.set(" 8 / 5");
		expression.isMoreToken();
		token= expression.getNextToken();
		assertEquals("8", token.getValue());
		expression.isMoreToken();
		token= expression.getNextToken();
		assertEquals("/", token.getValue());
		expression.isMoreToken();
		token= expression.getNextToken();
		assertEquals("5", token.getValue());
		boolean result = expression.isMoreToken();
		assertFalse(result);
	}
	
}

