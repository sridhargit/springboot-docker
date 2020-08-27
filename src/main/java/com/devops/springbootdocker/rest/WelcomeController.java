package com.devops.springbootdocker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("welcome")
	public String welcome() {
		return "Deployed docker based spring boot app";
	}
	
}
