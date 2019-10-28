package calculator.app;

public class Token {

	private String value;
	private Type type;
	
	public Token(String value, Type type) {
		this.value= value;
		this.type = type;
	}
	
	public String  getValue() {
		return value;
	}
	
	public boolean isNumeric() {
	   return type == Type.NUMBER;
	}
	
	@Override 
	public boolean equals(Object other) {
		if (other instanceof Token)
			return ((Token)other).getValue().equals(value);
		return false;
	}
	
}
