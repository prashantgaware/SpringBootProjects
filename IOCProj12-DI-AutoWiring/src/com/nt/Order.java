package com.nt;

public class Order {
	private int orderId;
	private Product product;
	
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
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + "]";
	}
	
	
}
