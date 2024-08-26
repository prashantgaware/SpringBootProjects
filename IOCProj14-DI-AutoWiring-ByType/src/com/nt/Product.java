package com.nt;

public class Product {
	private String name;
	private int id;
	private double amount;
	
	
	
	public Product(String name, int id, double amount) {
		super();
		System.out.println("Constructor: Product");
		this.name = name;
		this.id = id;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}	
}
