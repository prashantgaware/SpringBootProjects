package com.nt;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
//		BeanFactory factory = 
//				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj04-StarterProject\\bean.xml");

		ApplicationContext factory = new FileSystemXmlApplicationContext(
				"D:\\Practice\\SpringBootProjects\\IOCProj08-DI-SetterInjection-NonPrimitive-Set-Hashmap\\applicationContext.xml");
		System.out.println();

		Student s1 = (Student) factory.getBean("s1");
//		System.out.println(s1);
		Set<String> subjects = s1.getSubjects();
		subjects.stream().forEach(System.out::println);
		System.out.println(s1.getSubMarks());
		System.out.println();
		
		Student s2 = (Student) factory.getBean("s2");
		Set<String> sub = s2.getSubjects();
		sub.stream().forEach(System.out :: println);
		System.out.println(s2.getSubMarks());
	}
}
