package com.nt.utilities;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="billing-service")
public interface IBillingServiceConsumerCilent {
	
	@GetMapping("/bill/getAmount")
	public ResponseEntity<String> getAmount();

}
