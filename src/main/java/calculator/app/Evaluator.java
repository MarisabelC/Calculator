package calculator.app;

import java.security.InvalidParameterException;
import java.util.NoSuchElementException;

public class Evaluator {
	
	private Tokenizer tokenizer;
	

	public Evaluator() {
		tokenizer= new Tokenizer();
	}
	
	public void setExpression(String expression) {
		try {
			tokenizer.set(expression);
		}catch(InvalidParameterException e) {
			System.out.println(e);
		}
	}
	
	


}
