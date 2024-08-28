package com.nt.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("order1")
public class Order {
	
	private int orderId;
	private String userName;
	
	@Autowired
	private Product product;
	
	@Qualifier("product2")
	@Autowired
	private Product product2;
	
	public Product getProduct() {
		return product;
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
