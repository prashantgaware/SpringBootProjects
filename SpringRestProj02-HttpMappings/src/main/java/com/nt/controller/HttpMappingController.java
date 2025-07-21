package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PutExchange;

@RestController
@RequestMapping("/http-mapping")
public class HttpMappingController {

	@GetMapping("/get")
	public ResponseEntity<String> getMapping() {
		return new ResponseEntity<>("Get-Mapping", HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> postMapping() {
		return new ResponseEntity<>("Post-Mapping", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteMapping() {
		return new ResponseEntity<>("Delete-Mapping", HttpStatus.OK);
	}
	
	@PutExchange("/put")
	public ResponseEntity<String> putMapping() {
		return new ResponseEntity<>("Put-Mapping", HttpStatus.OK);
	}
	
	@PatchMapping("/patch")
	public ResponseEntity<String> patchtMapping() {
		return new ResponseEntity<>("Patch-Mapping", HttpStatus.CREATED);
	}
}
