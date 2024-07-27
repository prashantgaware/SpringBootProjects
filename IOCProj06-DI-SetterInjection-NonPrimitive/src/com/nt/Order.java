package com.nt;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String emailId;
	private float totalAmount;
	private boolean isOrderSuccess;
	private char foodType;
	private long mobileNo;
	private ArrayList<String> foodItems;

	public ArrayList<String> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(ArrayList<String> foodItems) {
		System.out.println("Setting food items: " + foodItems);
	    this.foodItems = foodItems;
	}

	public Order() {
		System.out.println("Order Executed..");
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean isOrderSuccess() {
		return isOrderSuccess;
	}

	public void setIsOrderSuccess(boolean isOrderSuccess) {
		this.isOrderSuccess = isOrderSuccess;
	}

	public char getFoodType() {
		return foodType;
	}

	public void setFoodType(char foodType) {
		this.foodType = foodType;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Order [emailId=" + emailId + ", totalAmount=" + totalAmount + ", isOrderSuccess=" + isOrderSuccess
				+ ", foodType=" + foodType + ", mobileNo=" + mobileNo + ", foodItems=" + foodItems + "]";
	}

}
