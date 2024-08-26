package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj16-BeanScopes-Singleton\\applicationContext.xml");

		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		emp1.setId(100);
		System.out.println("ID : " + emp1.getId());
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp1");
		System.out.println("ID : " + emp2.getId());
		System.out.println(emp2);
		
		Employee emp3 = (Employee) context.getBean("emp2");
		System.out.println("ID : " + emp2.getId());
		emp3.setId(101);
		System.out.println("ID : " + emp2.getId());
		System.out.println(emp2);
		
		Employee emp4 = (Employee) context.getBean("emp2");
		System.out.println("ID : " + emp2.getId());
		System.out.println(emp2);
	}
}
