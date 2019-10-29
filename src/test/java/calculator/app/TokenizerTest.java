package calculator.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;



public class TokenizerTest {
	Tokenizer expression;
	
	@Before 
	public void  setup() {
		expression = new Tokenizer();
	}
	
	@Test (expected = InvalidParameterException.class)
	public void  checkSetNulltest() {
		expression.set("null");
	}
	
	@Test  (expected = InvalidParameterException.class)
	public void  checkInvalidExpressionTest() {
		expression.set("x5+6");
	}
	
	@Test  (expected = InvalidParameterException.class)
	public void  setInvalidExpressionTest() {
		expression.set("23+5+");
	}
	
	@Test 
	public void  setValidExpressionTest() {
		expression.set("15/3");
	}
	
	
	@Test 
	public void  checkMoreTokenTest() {
		expression= new Tokenizer();
		expression.set("8-3");
		boolean result = expression.isMoreToken();
		assertTrue(result);
	}
	
	
	@Test 
	public void  getNextTokenTest() {
		expression= new Tokenizer();
		expression.set(" 30 % 5");
		expression.isMoreToken();
		Token token= expression.getNextToken();
		assertEquals("30", token.getValue());
	}
	
	@Test
	public void  getAllTokensTest() {
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
	
//	@Test
//	public void  getAllTokensWithNegativeNumberTest() {
//		Token token;
//		expression= new Tokenizer();
//		expression.set(" 18 + -5");
//		expression.isMoreToken();
//		token= expression.getNextToken();
//		assertEquals("18", token.getValue());
//		expression.isMoreToken();
//		token= expression.getNextToken();
//		assertEquals("+", token.getValue());
//		expression.isMoreToken();
//		token= expression.getNextToken();
//		assertEquals("-5", token.getValue());
//		boolean result = expression.isMoreToken();
//		assertFalse(result);
//	}
}

