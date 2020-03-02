package com.calculadora.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	
	@GetMapping("/")
	public Integer suma() {
		int a=7;
		int b=78;
		
		return a+b;
	}
	
	@GetMapping("/mul/")
	public Integer multiplicacion() {
		int a=7;
		int b=78;
		
		return a*b;
	}
	@GetMapping("/div/")
	public Double divicion() {
		double a=7;
		double b=78;
	
		return a/b;
	}
}
