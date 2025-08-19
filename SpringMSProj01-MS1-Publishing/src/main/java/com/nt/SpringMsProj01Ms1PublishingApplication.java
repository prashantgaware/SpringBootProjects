package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMsProj01Ms1PublishingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsProj01Ms1PublishingApplication.class, args);
	}

}
