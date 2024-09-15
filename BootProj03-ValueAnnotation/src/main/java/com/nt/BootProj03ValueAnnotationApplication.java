package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.fk.Order;

@SpringBootApplication
public class BootProj03ValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj03ValueAnnotationApplication.class, args);
		
		Order order = ctx.getBean(Order.class);
		System.out.println(order);
		System.out.println(order.getProduct());
	}

}
