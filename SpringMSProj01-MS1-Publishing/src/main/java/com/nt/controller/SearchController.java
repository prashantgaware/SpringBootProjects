package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@GetMapping("/display")
	public ResponseEntity<String> search() {
		return new ResponseEntity<String>("SearchController.Display()", HttpStatus.OK);
	}

}
