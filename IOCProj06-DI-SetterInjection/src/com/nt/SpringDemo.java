package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
//		BeanFactory factory = 
//				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj04-StarterProject\\bean.xml");
	
		
		ApplicationContext factory = 
				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj06-DI-SetterInjection\\applicationContext.xml");
		System.out.println();
		
		Object obj = factory.getBean("product1");
		Product product1 = (Product) obj;
		product1.printProduct();
		System.out.println();
		obj = factory.getBean("product2");
		Product product2 = (Product) obj;
		product2.printProduct();
		
	}
}
