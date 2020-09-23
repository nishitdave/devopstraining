package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {
	
	@Test
	public void testSum() {
		int a=10,b=10;
		CalculatorService ms = new CalculatorService();
		Assertions.assertEquals(ms.sum(a,b), 20);
	}
	
	@Test
	public void testSubstract() {
		int a=10,b=20;
		CalculatorService ms = new CalculatorService();
		Assertions.assertEquals(ms.substract(), 10);
	}
	
	@Test
	public void testMultiply() {
		int a=10,b=10;
		CalculatorService ms = new CalculatorService();
		Assertions.assertEquals(ms.multiply(), 100);
	}
	
	@Test
	public void testDivide() {
		int a=10,b=10;
		CalculatorService ms = new CalculatorService();
		Assertions.assertEquals(ms.division(), 1);
	}

}
