package com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum/{num1}/{num2}")
	public int sum(@PathVariable Integer num1, @PathVariable Integer num2) {
		return num1+num2;
	}
	
	@GetMapping("/substract")
	public int substract() {
		int a=10,b=20;
		return b-a;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		int a=10,b=10;
		return a*b;
	}
	
	@GetMapping("/division")
	public int division() {
		int a=10,b=10;
		return a/b;
	}

}
