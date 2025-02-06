package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.operations.DatabaseOps;

@SpringBootApplication
public class BootJpaProj01StarterProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootJpaProj01StarterProjectApplication.class, args);
		
		DatabaseOps dbOps = context.getBean(DatabaseOps.class);
		dbOps.addData();
		
	}

}
