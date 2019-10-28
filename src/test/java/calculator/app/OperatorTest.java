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
	
	
	@Test 
	void checkSubstractTest() {
		double result =operator.substract(9,6);
		System.out.print(result);
		assertEquals(3,result);
	}

	@Test 
	void checkSubstractNegativeResultTest() {
		double result =operator.substract(9,16);
		System.out.print(result);
		assertEquals(-7,result);
	}
	
	@Test 
	void checkSubstracDoubletNegativeResultTest() {
		double result =operator.substract(90,26);
		System.out.print(result);
		assertEquals(64,result);
	}
}
