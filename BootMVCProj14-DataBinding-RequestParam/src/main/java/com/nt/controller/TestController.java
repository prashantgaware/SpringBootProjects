package com.nt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/save1")
	public ResponseEntity<String> save1(@RequestParam int sno) {
		String response = "id: " + sno + " saved successfully";
		System.out.println(response);
		return ResponseEntity.ok(response);
	}
}
