package calculator.app;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Evaluator evaluator = new Evaluator();
		String expression;
		
		do {
			System.out.println("Please add the arithmetic expression");
			expression = sc.nextLine(); 
			try {
				evaluator.setExpression(expression);
				System.out.println(expression + " = "+ evaluator.getTotal());
			}catch (ArithmeticException e) {
				System.out.println(e);
			}catch (InvalidParameterException e) {
				System.out.println(e);
			}
			System.out.println("Do you want to calculate anoter arithmetic expression? Y/N");
			expression=sc.nextLine();
		} while(expression.trim().equalsIgnoreCase("y")) ;
		System.out.println("Thank you for using the calculator app");
	}

}
