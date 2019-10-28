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

}
