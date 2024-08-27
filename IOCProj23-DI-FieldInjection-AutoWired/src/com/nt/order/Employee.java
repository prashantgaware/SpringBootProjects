package com.nt.order;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	
	private void ctor() {
		System.out.println("Employee crested");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
