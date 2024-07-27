package com.nt;

public class Product {
	
	int id;
	String productName;
	double productPrice;
	
	public Product() {
		System.out.println("Product is created..");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void printProduct() {
		System.out.println("ID: " + id);
		System.out.println("ProductName: " + productName);
		System.out.println("ProductPrice: " + productPrice);
	}

}
