package com.nt;

public class Student {

	int id;
	String name;
	
	public Student(){
		System.out.println("Student is created..");
	}
	
	public void printStudent() {
		System.out.println("ID is " + id);
		System.out.println("Name is " + name);
	}
}
