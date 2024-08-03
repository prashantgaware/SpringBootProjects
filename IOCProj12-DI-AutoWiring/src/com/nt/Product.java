package com.nt;

public class Product {
	private String name;
	private int id;
	private double amount;
	
	
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
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
	
	
	
}
