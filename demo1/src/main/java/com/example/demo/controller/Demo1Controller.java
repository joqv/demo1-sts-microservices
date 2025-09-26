package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

	@GetMapping
	public String decirHola() {
		return "Hola1";
	}
}
