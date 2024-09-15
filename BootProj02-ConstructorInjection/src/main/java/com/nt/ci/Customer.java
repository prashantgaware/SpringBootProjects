package com.nt.ci;

import org.springframework.stereotype.Component;

@Component("customerOne")
public class Customer {
	private String name;
	private long contactNo;
	
	public Customer() {
		System.out.println("Customer is created.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
