package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

	@GetMapping
	public String decirHola() {
		return "Hola1";
	}
}
