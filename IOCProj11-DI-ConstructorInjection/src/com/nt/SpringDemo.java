package com.nt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		
		ApplicationContext factory = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj11-DI-ConstructorInjection\\applicationContext.xml");
		System.out.println();

		Employee emp1 = (Employee) factory.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) factory.getBean("emp2");
		System.out.println(emp2);
	}
}
