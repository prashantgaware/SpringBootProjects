package com.nt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.order.Order;

public class SpringDemo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.register(Order.class);
		context.scan("com.*");
		context.refresh();
		
		Order o1 = context.getBean(Order.class);	// No need to do ant type casting.
		System.out.println(o1);
		System.out.println(o1.getEmployee());
		
	}
}
