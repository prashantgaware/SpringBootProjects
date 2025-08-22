package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMsProj03BillingServiceProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsProj03BillingServiceProviderMsApplication.class, args);
	}

}
