package com.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

	@GetMapping(path = "/display")
	public String helloWorld() {
		return "Hello World";
	}
}