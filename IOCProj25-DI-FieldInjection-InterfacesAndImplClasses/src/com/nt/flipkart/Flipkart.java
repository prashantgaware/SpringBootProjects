package com.nt.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.order.Order;

@Component
public class Flipkart {
	
	@Autowired
	Order order1;
	
	@Qualifier("order2")
	@Autowired
	Order order2;
	
	public Flipkart() {
		super();
		System.out.println("Flipkart order");
	}
	
	public Order getOrder1() {
		return order1;
	}
	public void setOrder1(Order order1) {
		this.order1 = order1;
	}
	public Order getOrder2() {
		return order2;
	}
	public void setOrder2(Order order2) {
		this.order2 = order2;
	}
		
}
