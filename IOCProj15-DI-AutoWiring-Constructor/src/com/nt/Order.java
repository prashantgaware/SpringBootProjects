package com.nt;

public class Order {
	private int orderId;
	private Product product;
	private Transaction transaction;
		
	public Order() {
		System.out.println("Constructor: Order");
	}
	/*
	 * public Order(int orderId, Product product, Transaction transaction) {
	 * super(); System.out.println("Constructor: Order"); this.orderId = orderId;
	 * this.product = product; this.transaction = transaction; }
	 */
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}	
}
