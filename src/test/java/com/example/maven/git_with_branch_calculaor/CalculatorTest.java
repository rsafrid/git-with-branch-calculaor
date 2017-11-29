package com.example.maven.git_with_branch_calculaor;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());

	@Test
	public void testAddMethod() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber + secondNumber;
		LOG.info("Testing the method add with "+ firstNumber + " and " + secondNumber);
		assertEquals(c.add(firstNumber, secondNumber), result);
		}
	}

	@Test
	public void testSubtractMethod() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber - secondNumber;
		LOG.info("Testing the method subtract with "+ firstNumber + " and " + secondNumber);
		assertEquals(c.subtract(firstNumber, secondNumber), result);
		}
	}
	
	@Test
	public void testMultiplyMethod() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber * secondNumber;
		LOG.info("Testing the method multiply with "+ firstNumber + " and " + secondNumber);
		assertEquals(c.multiply(firstNumber, secondNumber), result);
		}
	}
	
	@Test
	public void testDivisionMethod() {
		DecimalFormat df = new DecimalFormat("#.##");
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;
		
		LOG.info("Testing the method division with "+ firstNumber + " and " + secondNumber);
		assertEquals(Math.round(c.division(firstNumber, secondNumber)), Math.round(result));
		
		for(int i = 0; i < 10; i++) {
		firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
		secondNumber = 0.0;
		result = -0.123456789;
		LOG.info("Testing the method division with "+ firstNumber + " and " + secondNumber);
		assertEquals(Math.round(c.division(firstNumber, secondNumber)), Math.round(result));
		
		firstNumber = 0.0;
		secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
		result = firstNumber / secondNumber;
		LOG.info("Testing the method division with "+ firstNumber + " and " + secondNumber);
		assertEquals(Math.round(c.division(firstNumber, secondNumber)), Math.round(result));
		
		firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
		secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
		result = firstNumber / secondNumber;
		LOG.info("Testing the method division with "+ firstNumber + " and " + secondNumber);
		assertEquals(Math.round(c.division(firstNumber, secondNumber)), Math.round(result));
		}
	}
}
