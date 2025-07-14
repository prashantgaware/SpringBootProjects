package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@RequestMapping("/test")
@Controller
public class TestController {
	
	@GetMapping("/showResult")
	public String showResult(Map<String, Object> map) {
		/*map.put("name", "Raja");
		map.put("age", "25");
		map.put("address", "Bangalore");*/
		
		map.put("colors", List.of("Red", "Green", "Blue"));
		map.put("numbers", Set.of(1, 2, 3, 4, 5));
		map.put("person", Map.of("name", "Raja", "age", 25, "address", "Bangalore"));
		map.put("personList", List.of(
			Map.of("name", "Raja", "age", 25, "address", "Bangalore"),
			Map.of("name", "Sita", "age", 30, "address", "Delhi"),
			Map.of("name", "Gita", "age", 28, "address", "Mumbai"),
			Map.of("name", "Mohan", "age", 35, "address", "Chennai"),
			Map.of("name", "Ravi", "age", 22, "address", "Kolkata")
		));
		return "show_result";
	}
}
