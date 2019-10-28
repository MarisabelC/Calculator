package calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvaluatorTest {

	Evaluator evaluator;
	
	@Test
	void checkSetExpressionTest() {
		evaluator = new Evaluator();
		evaluator.setExpression("5+2");
	}
	
	@Test
	void checkSetInvalidExpressionTest() {
		evaluator = new Evaluator();
		evaluator.setExpression("5+2-");
	}

	@Test
	void getTotalDivisionTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("5/2");
		double result = evaluator.getTotal();
		assertEquals(2.5, result,0.001);
	}
	
	@Test
	void getTotalMultiplyTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("2.5 x 6");
		double result = evaluator.getTotal();
		assertEquals(15, result);
	}
	
	@Test
	void getTotalModTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("3 % 5");
		double result = evaluator.getTotal();
		assertEquals(3, result);
	}
	
	@Test
	void getTotalSubtractTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("30 - 55");
		double result = evaluator.getTotal();
		assertEquals(-25, result);
	}
	
	@Test
	void getTotalAddTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("30 + 25");
		double result = evaluator.getTotal();
		assertEquals(55, result);
	}
}
