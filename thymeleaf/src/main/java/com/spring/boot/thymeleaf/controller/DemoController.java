package com.spring.boot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	// create a mapping for "/hello"
	
	@GetMapping("/")
	public String sayHello() {
		
		
		return "redirect:employees/list";
	}
}

