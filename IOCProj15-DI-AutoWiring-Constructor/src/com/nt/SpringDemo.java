package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj15-DI-AutoWiring-Constructor\\applicationContext.xml");

		Order order = (Order) context.getBean("order");
		System.out.println(order.getProduct());
		System.out.println(order.getTransaction());
	}
}
