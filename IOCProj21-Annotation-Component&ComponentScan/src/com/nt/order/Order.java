package com.nt.order;

import org.springframework.stereotype.Component;

import com.nt.employee.Employee;

@Component
public class Order {
	
	private int orderId;
	private Employee empId;
	
	public Order() {
		System.out.println("Order Created.");
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Employee getEmpId() {
		return empId;
	}
	public void setEmpId(Employee empId) {
		this.empId = empId;
	}

}
