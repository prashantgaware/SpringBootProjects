package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.ci.BankAccount;
import com.nt.ci.Customer;

@SpringBootApplication
public class BootProj01ConstructorInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01ConstructorInjectionApplication.class, args);
		
		BankAccount ba = ctx.getBean(BankAccount.class);
		System.out.println(ba);
		System.out.println(ba.getCustomer());
		
	}
	
	@Bean
	public Customer customerTwo() {
		System.out.println("Customer two is created.");
		return new Customer();
	}

}
