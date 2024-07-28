package com.nt;

import java.util.List;

public class College {
	private String collegeName;
	private List<Student> student;
	
	public College() {
		System.out.println("College Started");
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
}
