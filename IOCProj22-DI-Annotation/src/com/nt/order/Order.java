package com.nt.order;

import org.springframework.stereotype.Component;

@Component("order")
public class Order {
	
	private int orderId;
	
	
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
