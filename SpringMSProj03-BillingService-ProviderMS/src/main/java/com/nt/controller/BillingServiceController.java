package com.nt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/bill")
public class BillingServiceController {

	@GetMapping("/getAmount")
	public ResponseEntity<String> getAmount() {
		return new ResponseEntity<String>("The bill amount is Rs. 10000.00", HttpStatus.OK);
	}

}
