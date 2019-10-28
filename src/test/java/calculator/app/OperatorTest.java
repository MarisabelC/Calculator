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
		assertEquals(16.2,result,0.001);
	}
	
	
	@Test 
	void checkSubtractTest() {
		double result =operator.subtract(9,6);
		assertEquals(3,result);
	}

	@Test 
	void checkSubtractNegativeResultTest() {
		double result =operator.subtract(9,16);
		assertEquals(-7,result);
	}
	
	@Test 
	void checkSubtractDoubletNegativeResultTest() {
		double result =operator.subtract(90,26);
		assertEquals(64,result);
	}
	
	@Test
	void checkMultiplyTest() {
		double result =operator.multiply(9,5);
		assertEquals(45,result);
	}
	
	@Test
	void checkMultiplyByZeroTest() {
		double result =operator.multiply(0,5);
		assertEquals(0,result);
	}
	
	@Test
	void checkMultiplyDoubleTest() {
		double result =operator.multiply(2.2,5);
		assertEquals(11,result);
	}
	
	@Test
	void checkDiviveByZeroTest() {
		 assertThrows(ArithmeticException.class, () -> {
		        operator.divide(15, 0);});
	}
	
	@Test
	void checkDivideTest() {
		double result =operator.divide(9,6);
		assertEquals(1.5,result,0.001);
	}
	
	@Test
	void checkDivideDoubleTest() {
		double result =operator.divide(9.3,3.1);
		assertEquals(3,result,0.001);
	}
}
