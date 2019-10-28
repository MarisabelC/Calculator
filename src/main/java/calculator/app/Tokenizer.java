package calculator.app;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	private final Pattern PATTERN=  Pattern.compile("(\\d+(\\.\\d+)?)|[-+x/%]+");
	private Matcher expression;
	
	
	public void set(String expression) {
		if (checkExpression(expression) == false)
			throw new InvalidParameterException("Invalid expression"); 
	}
	
	
	public boolean checkExpression(String expression) {
	
		if (expression == null) return false;
		matchPattern(expression);
		int countOperator=0, countNumber=0;
		while (this.expression.find()) {
			String current = this.expression.group();
			if (isNumeric(current)) 
				countNumber++;
			else
				countOperator++;
		}
		this.expression.find(0);
		
		if (countNumber == countOperator+1) {
			return true;
		}
		return false;
	}
	
	private boolean isNumeric(String strNum) {
	    try {
	        Double.parseDouble(strNum);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}
	
	private void matchPattern(String str) {
		 expression = PATTERN.matcher(str);
	}

	
	public boolean isMoreToken() {
		return expression.find();
	}
}
