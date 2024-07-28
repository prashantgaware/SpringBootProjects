package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		
		ApplicationContext factory = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj09-DI-SetterInjection-UserDefinedClass\\applicationContext.xml");
		System.out.println();

		College college = (College) factory.getBean("college");
		Student s1 = college.getStudent();
		System.out.println(s1.toString());
		System.out.println();
		Student s2 = college.getStudent();
		System.out.println(s2.toString());
	}
}
