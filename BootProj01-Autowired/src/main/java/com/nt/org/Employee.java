package com.nt.org;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String eName;
	private int eId;
	
	public Employee() {
		System.out.println("Empoyee is create");
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}
	
}
