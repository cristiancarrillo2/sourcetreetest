package com.ejemplo1.ejemplospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@RequestMapping("/")
	public Integer sumaRest() {
		int a= 5;
		int b=20;
		return a+b;
	}
}
