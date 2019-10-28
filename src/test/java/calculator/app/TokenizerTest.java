package calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TokenizerTest {
	static Tokenizer expression;
	
	@BeforeAll 
	static void setup() {
		expression = new Tokenizer();
	}
	
	@Test
	void checkSetNulltest() {
		assertThrows(InvalidParameterException.class, () -> {
			expression.set("null");});
	}
	
	@Test
	void checkInvalidExpressionTest() {
		assertThrows(InvalidParameterException.class, () -> {
			expression.set("x5+6");});
	}
	
	@Test 
	void setInvalidExpressionTest() {
		expression= new Tokenizer();
		assertThrows(InvalidParameterException.class, () -> {
			expression.set("23+5+");});
	}
	
	@Test 
	void setValidExpressionTest() {
		expression= new Tokenizer();
		expression.set("15/3");
	}
	
	@Test 
	void checkMoreTokenTest() {
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

