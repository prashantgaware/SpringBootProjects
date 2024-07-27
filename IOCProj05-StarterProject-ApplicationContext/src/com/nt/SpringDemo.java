package com.nt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
//		BeanFactory factory = 
//				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj04-StarterProject\\bean.xml");
	
		
		ApplicationContext factory = 
				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj04-StarterProject\\bean.xml");
		System.out.println();
		
		Object obj = factory.getBean("student1");
		Student student = (Student) obj;
		student.printStudent();
		System.out.println();
		obj = factory.getBean("emp1");
		Employee emp = (Employee) obj;
		emp.printEmp();
		
	}
}
