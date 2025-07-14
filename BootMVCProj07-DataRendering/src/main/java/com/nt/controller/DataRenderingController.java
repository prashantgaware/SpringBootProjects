package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/data-rendering")
@Controller
public class DataRenderingController {
	
	
	@GetMapping("/result1")
	public String showResult1(Map<String, String> map) {
		map.put("name", "Raja");
		map.put("age", "25");
		map.put("address", "Bangalore");
		
		return "result1";
	}

}
