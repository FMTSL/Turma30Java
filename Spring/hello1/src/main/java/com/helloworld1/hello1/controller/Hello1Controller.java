package com.helloworld1.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello1")
public class Hello1Controller {
	
	@GetMapping
	public String hello1() {
		return "Estou usando a habilidade de atenção aos detalhes e a mentalidade de persistência!!";
	}
	
}
