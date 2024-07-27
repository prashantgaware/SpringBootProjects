package com.nt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		BeanFactory factory = 
				new FileSystemXmlApplicationContext("D:\\Practice\\SpringBootProjects\\IOCProj04-StarterProject\\bean.xml");
		
		Object obj = factory.getBean("student1");
		Student student = (Student) obj;
		student.printStudent();
		System.out.println();
		obj = factory.getBean("emp1");
		Employee emp = (Employee) obj;
		System.out.println("Employee ID : " + emp.empId);
		System.out.println("Employee ID : " + emp.empName);
	}
}
