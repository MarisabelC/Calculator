package calculator.app;

import java.security.InvalidParameterException;
import java.util.NoSuchElementException;

public class Evaluator {

	private Tokenizer tokenizer;

	public Evaluator() {
		tokenizer = new Tokenizer();
	}

	public void setExpression(String expression) {
		try {
			tokenizer.set(expression);
		} catch (InvalidParameterException e) {
			System.out.println(e);
		}
	}

	public double getTotal() {
		double LHS = Double.parseDouble(getNextToken(tokenizer).getValue());
		String operator = getNextToken(tokenizer).getValue();
		double RHS = Double.parseDouble(getNextToken(tokenizer).getValue());
		return assignOperator(LHS, RHS, operator);
	}

	private Token getNextToken(Tokenizer tokenizer) throws NoSuchElementException {
		if (tokenizer.isMoreToken())
			return tokenizer.getNextToken();
		throw new NoSuchElementException("No more token");
	}

	private double assignOperator(double LHS, double RHS, String operator) {
		Operator total = new Operator();
		switch (operator) {
		case "+":
			return total.add(LHS, RHS);
		case "-":
			return total.subtract(LHS, RHS);
		case "x":
			return total.multiply(LHS, RHS);
		case "/":
			return total.divide(LHS, RHS);
		case "%":
			return total.mod(LHS, RHS);
		default:
		}
		return 0;
	}

}