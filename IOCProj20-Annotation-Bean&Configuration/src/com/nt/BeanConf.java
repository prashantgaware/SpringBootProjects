package com.nt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class BeanConf {

	@Bean("emp1")
	public Employee getEmp1() {
		System.out.println("Emp1 created");
		Employee employee = new Employee();
		return employee;
	}
	
	@Bean("emp3")
	public Employee getEmp3() {
		System.out.println("Emp3 created");
		Employee employee = new Employee();
		return employee;
	}
	
	@Bean("emp2")
	public Employee getEmp2() {
		System.out.println("Emp2 created");
		Employee employee = new Employee();
		return employee;
	}
	
	@Bean("order1")
	public Order order1() {
		Order order1 = new Order();
		order1.setOrderId(1);
		order1.setEmpId(getEmp1());
		
		return order1;
	}
}
