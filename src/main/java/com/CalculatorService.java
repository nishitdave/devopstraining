package com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum")
	public int sum() {
		int a=10,b=10;
		return a+b;
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
