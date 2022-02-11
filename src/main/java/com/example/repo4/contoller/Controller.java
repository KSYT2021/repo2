package com.example.repo4.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String m1() {
		return "welcome";
	}

	@GetMapping("/demo")
	public String m2() {
		return "demo";
	}
}
