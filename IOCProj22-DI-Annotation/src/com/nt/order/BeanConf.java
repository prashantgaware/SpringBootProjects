package com.nt.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConf {

	@Bean("order2")
	public Order getOrderTwo() {
		System.out.println("Order2 is created");
		
		return new Order();
	}
}
