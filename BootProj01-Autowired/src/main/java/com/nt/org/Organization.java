package com.nt.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Organization {
	
	private String orgName;
	
	@Autowired
	public Employee emp;
	
	public Organization() {
		System.out.println("Organisation is created..");
	}
	
	public Organization(Employee emp) {
		this.emp = emp;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
