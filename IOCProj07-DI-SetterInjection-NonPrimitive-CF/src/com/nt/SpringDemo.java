package com.nt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
//		BeanFactory factory = 
//				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj04-StarterProject\\bean.xml");

		ApplicationContext factory = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj06-DI-SetterInjection\\applicationContext.xml");
		System.out.println();

		/*
		 * Object obj = factory.getBean("product1"); Product product1 = (Product) obj;
		 * product1.printProduct(); System.out.println(); obj =
		 * factory.getBean("product2"); Product product2 = (Product) obj;
		 * product2.printProduct();
		 */

		Product p1 = (Product) factory.getBean("product1");
		p1.printProduct();
		System.out.println();
		Product p2 = (Product) factory.getBean("product2");
		p2.printProduct();
		System.out.println();
		Product p3 = (Product) factory.getBean("product3");
		p3.printProduct();
		System.out.println();
		Order order1 = (Order) factory.getBean("order1");
		System.out.println(order1);
		List<String> items = order1.getFoodItems();
		for(String item : items)
			System.out.println(item);
		List<Double> prices = order1.getPrices();
		prices.stream().forEach(System.out:: println);
		System.out.println();
		Order order2 = (Order) factory.getBean("order2");
		for(String item : items)
			System.out.println(item);
		List<Double> prices1 = order2.getPrices();
		prices1.stream().forEach(System.out::println);
		System.out.println(order2);
		
	}
}
