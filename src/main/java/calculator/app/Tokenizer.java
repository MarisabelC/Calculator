package calculator.app;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	private final Pattern PATTERN=  Pattern.compile("(\\d+(\\.\\d+)?)|[-+x/%]+");
	private Matcher expression;
	
	
	public void set(String expression) throws InvalidParameterException{
		if (checkExpression(expression) == false)
			throw new InvalidParameterException("Invalid expression. Expression must be in the infix form  9 / 2.5 "); 
	}
	
	
	private boolean checkExpression(String expression) {
	
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
		this.expression.reset();
		
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

	public Token getNextToken() {
		String str=expression.group(); 
		Type type= getType(str);
		Token token= new Token(str, type);
		return token;
	}


	private Type getType(String str) {
		Type type;
		if (isNumeric(str))
			type=Type.NUMBER;
		else 
			type= Type.OPERATOR;
		return type;
	}
	
	
	public boolean isMoreToken() {
		return expression.find();
	}
	
}

