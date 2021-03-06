package calculator.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	private final Pattern PATTERN=  Pattern.compile("(\\d+(\\.\\d+)?)|[-+x/%]+");
	private Matcher expression;
	
	public boolean checkExpression(String expression) {
	
		if (expression == null) return false;
		matchPattern(expression);
		int countOperator=0, countNumber=0;
		Matcher temp = this.expression;
		
		while (temp.find()) {
			String current = temp.group();
//			System.out.println(current);
			if (isNumeric(current)) 
				countNumber++;
			else
				countOperator++;
			
		}
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

}
