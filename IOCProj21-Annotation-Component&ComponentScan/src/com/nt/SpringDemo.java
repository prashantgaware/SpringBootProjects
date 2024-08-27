package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.employee.Employee;
import com.nt.order.Order;

public class SpringDemo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);

		
		 Employee emp1 = (Employee) context.getBean("emp1"); System.out.println(emp1);
		 emp1.setId(100); System.out.println("ID : " + emp1.getId());
		 System.out.println(emp1);
		  
		 Employee emp2 = (Employee) context.getBean("emp2"); emp2.setId(101);
		 emp2.setName("Jack"); System.out.println("ID : " + emp2.getId());
		 System.out.println("Name : " + emp2.getName()); System.out.println(emp2);
		 
		 Employee emp3 = (Employee) context.getBean("emp3");
		 System.out.println("ID : " + emp3.getId()); emp3.setId(101);
		 System.out.println("ID : " + emp3.getId()); System.out.println(emp3);
		  
		  
		 Order o1 = (Order) context.getBean("order1"); System.out.println("OId : " +
		 o1.getOrderId() + ", EmpId : " + o1.getEmpId()); System.out.println(o1);
		 
		
	}
}
