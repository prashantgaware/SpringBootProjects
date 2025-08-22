package com.nt.utilities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerCilent {

	@Autowired
	private LoadBalancerClient discoveryClient;
	
	public String getBillingServiceUrl() {
		ServiceInstance instances = discoveryClient.choose("billing-service");
		String url = instances.getUri().toString() + "/bill/getAmount";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		String responseContent = response.getBody();
		return responseContent;
	}
}
