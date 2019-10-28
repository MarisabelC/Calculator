package calculator.app;

public class Operator {

	public double add(double LHS, double RHS) {
		return LHS + RHS;
	}

	public double subtract(double LHS, double RHS) {
		return LHS-RHS;
	}
	
	public double multiply(double LHS, double RHS) {
		return LHS*RHS;
	}
	
	public double divide(double dividend, double divisor) throws ArithmeticException{
		if (isDivisorEqualsZero(divisor))
			throw new ArithmeticException("/ by zero");
		return dividend/divisor;
	}
	
	private boolean isDivisorEqualsZero(double divisor) {
		return divisor == 0;
	}

	public double mod(double LHS, double RHS)throws ArithmeticException{
		if (isDivisorEqualsZero(RHS))
			throw new ArithmeticException("/ by zero");
		return (LHS % RHS + RHS) % RHS;
	}

	

}
