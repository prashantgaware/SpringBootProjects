package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.utilities.BillingServiceConsumerCilent;


@RestController
@RequestMapping("/shopping")
public class ShoppingServiceController {
	
	@Autowired
	private BillingServiceConsumerCilent billingServiceConsumerCilent;

	@GetMapping("/getItems")
	public ResponseEntity<String> getItems() {
		// Call the billing service to get the bill amount
		String billAmount = billingServiceConsumerCilent.getBillingServiceUrl();
		return new ResponseEntity<String>(
				"The items are are: ['Jeans', 'Shirts'] :: " + billAmount, 
				HttpStatus.OK);
	}
	
	
}
