package calculator.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluatorTest {

	Evaluator evaluator;
	
	@Test
	public void  checkSetExpressionTest() {
		evaluator = new Evaluator();
		evaluator.setExpression("5+2");
	}
	
	@Test
	public void  checkSetInvalidExpressionTest() {
		evaluator = new Evaluator();
		evaluator.setExpression("5+2-");
	}

	@Test
	public void  getTotalDivisionTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("5/2");
		double result = evaluator.getTotal();
		assertEquals(2.5, result,0.001);
	}
	
	@Test
	public void  getTotalMultiplyTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("2.5 x 6");
		double result = evaluator.getTotal();
		assertEquals(15, result,0.001);
	}
	
	@Test
	public void  getTotalModTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("3 % 5");
		double result = evaluator.getTotal();
		assertEquals(3, result,0.001);
	}
	
	@Test
	public void  getTotalSubtractTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("30 - 55");
		double result = evaluator.getTotal();
		assertEquals(-25, result,0.001);
	}
	
	@Test
	public void  getTotalAddTest() {
		evaluator = new Evaluator();
	    evaluator.setExpression("30 + 25");
		double result = evaluator.getTotal();
		assertEquals(55, result,0.001);
	}
}
