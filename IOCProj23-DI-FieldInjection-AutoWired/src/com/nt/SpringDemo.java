package com.nt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.flipkart.Flipkart;
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
		System.out.println("++++++++++++++++++++");
		o1.getEmployee().setId(100);
		o1.getEmployee().setName("Jason");
		System.out.println(o1.getEmployee().getId());
		System.out.println(o1.getEmployee().getName());
		
		System.out.println("=========================");
		
		Flipkart fl = context.getBean(Flipkart.class);
		System.out.println(fl);
		System.out.println(fl.getOrder1());
		System.out.println(fl.getOrder2());
		System.out.println(fl.getOrder1().getEmployee());
		System.out.println(fl.getOrder2().getEmployee());
		System.out.println(fl.getOrder1().getEmployee().getId());
		System.out.println(fl.getOrder1().getEmployee().getName());
		System.out.println(fl.getOrder2().getEmployee().getId());
		System.out.println(fl.getOrder2().getEmployee().getName());
		
		
	}
}
