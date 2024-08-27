package com.nt.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order")
public class Order {
	
	private int orderId;
	private String userName;
	
	@Autowired
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Order() {
		System.out.println("Order Created.");
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
