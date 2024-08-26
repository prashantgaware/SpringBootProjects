package com.nt;

public class Transaction {
	private int transactionid;
	private boolean isSuccess;
	private String message;
	
	public Transaction() {
		System.out.println("Constructor: Transaction");
	}
	
	public Transaction(int transactionid, boolean isSuccess, String message) {
		super();		
		System.out.println("Constructor: Transaction");
		this.transactionid = transactionid;
		this.isSuccess = isSuccess;
		this.message = message;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
