package com.nt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/save1")
	public ResponseEntity<String> save1(@RequestParam int sno, @RequestParam String sname) {
		String response = "id: " + sno + ", name: " + sname;
		System.out.println(response);
		return ResponseEntity.ok(response);
	}
}
