package com.nt.fk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int orderId;
	private String userName;
	private Product product;
	
	// Here we dont have to give Value to product, bcos it is a bean object,
	// and it will get it from IOC itself.
	@Autowired
	public Order(@Value("123") int orderId,@Value("John") String userName, Product product) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
