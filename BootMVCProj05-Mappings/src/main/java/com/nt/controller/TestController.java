package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

	@GetMapping("/home")
	public String showHome() {
		return "welcome";
	}
	
	@GetMapping("/getAllData")
	public String getAll() {
		return "forward:wish/getAllData";
	}
}
