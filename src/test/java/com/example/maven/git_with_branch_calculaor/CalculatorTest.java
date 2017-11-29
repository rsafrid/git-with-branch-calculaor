package com.example.maven.git_with_branch_calculaor;

import static org.junit.Assert.*;

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

}
