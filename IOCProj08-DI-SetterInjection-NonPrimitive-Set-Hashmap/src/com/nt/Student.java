package com.nt;

import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<String > subjects;
	private Map<String, Integer> subMarks;
	
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

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}
	
	
}
