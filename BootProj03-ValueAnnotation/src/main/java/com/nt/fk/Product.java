package com.nt.fk;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int pId;
	
	public Product() {
		System.out.println("Product is created.");
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}
	
}
