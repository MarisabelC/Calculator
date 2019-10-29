package calculator.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperatorTest {
	
	Operator operator;
	
	@Before
	public void  setup() {
		operator = new Operator();
	}
	
	@Test
	public void  checkAddTest() {
		double result =operator.add(9.0,6.0);
		assertEquals(15.0,result,0.001);
	}
	
	@Test
	public void  checkAddDoubleTest() {
		double result =operator.add(9.8,6.4);
		assertEquals(16.2,result,0.001);
	}
	
	
	@Test 
	public void  checkSubtractTest() {
		double result =operator.subtract(9,6);
		assertEquals(3,result,0.001);
	}

	@Test 
	public void  checkSubtractNegativeResultTest() {
		double result =operator.subtract(9,16);
		assertEquals(-7,result,0.001);
	}
	
	@Test 
	public void  checkSubtractDoubletNegativeResultTest() {
		double result =operator.subtract(90,26);
		assertEquals(64,result,0.001);
	}
	
	@Test
	public void  checkMultiplyTest() {
		double result =operator.multiply(9,5);
		assertEquals(45,result,0.001);
	}
	
	@Test
	public void  checkMultiplyByZeroTest() {
		double result =operator.multiply(0,5);
		assertEquals(0,result,0.001);
	}
	
	@Test
	public void  checkMultiplyDoubleTest() {
		double result =operator.multiply(2.2,5);
		assertEquals(11,result,0.001);
	}
	
	@Test (expected = ArithmeticException.class)
	public void  checkDiviveByZeroTest() {
		operator.divide(15, 0);
	}
	
	@Test
	public void  checkDivideTest() {
		double result =operator.divide(9,6);
		assertEquals(1.5,result,0.001);
	}
	
	@Test
	public void  checkDivideDoubleTest() {
		double result = operator.divide(9.3,3.1);
		assertEquals(3,result,0.001);
	}
	
	@Test
	public void  checkModTest() {
		double result = operator.mod(9,3);
		assertEquals(0,result,0.0001);
	}
	
	@Test (expected =ArithmeticException.class )
	public void  checkModByZeroTest() {
		 operator.mod(15, 0);
	}
}
