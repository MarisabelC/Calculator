package calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OperatorTest {
	
	static Operator operator;
	
	@BeforeAll 
	static void setup() {
		operator = new Operator();
	}
	
	@Test
	void checkAddTest() {
		double result =operator.add(9.0,6.0);
		assertEquals(15.0,result);
	}
	
	@Test
	void checkAddDoubleTest() {
		double result =operator.add(9.8,6.4);
		System.out.print(result);
		assertEquals(16.2,result,0.001);
	}
	
	
	

}
