package com.nt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		
		ApplicationContext factory = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj10-DI-SetterInjection-UserDefinedClass-MultipleObjects\\applicationContext.xml");
		System.out.println();

		College college = (College) factory.getBean("college");
		List<Student> students = college.getStudent();
		students.stream().forEach(System.out :: println);
	}
}
