package com.nt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj12-DI-AutoWiring\\applicationContext.xml");
		System.out.println();

		Order order = (Order) context.getBean("order");
		System.out.println(order.toString());
	}
}
