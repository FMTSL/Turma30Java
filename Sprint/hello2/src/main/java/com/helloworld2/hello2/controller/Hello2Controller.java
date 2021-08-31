package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello2")
public class Hello2Controller {
	
	@GetMapping
	public String hello2() {
		return "Tenho como objetivo de aprendizagem essa semana a fixação dos conceitos de REST e API, assim como o uso do Spring para aplicá-lo no projeto integrador do meu grupo.";
	}
	
	

}
