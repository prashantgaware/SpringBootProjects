package com.nt;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	List<Long> mobileNo;
	
	public Student() {
		System.out.println("Student is initialized");
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

	public List<Long> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(List<Long> mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}

	
	
}
