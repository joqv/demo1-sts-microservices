package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo4Controller {

	@GetMapping
	public String decirHol4() {
		return "Hola 4";
	}
}
