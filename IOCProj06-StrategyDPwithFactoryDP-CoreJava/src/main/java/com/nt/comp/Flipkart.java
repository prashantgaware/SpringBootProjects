package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0-param cstor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String shopping(String items[], float prices[]) {

		float billAmt = 0.0f;

		for (int i = 0; i < items.length; i++) {
			billAmt = billAmt + prices[i];
		}

		int oid = new Random().nextInt(10000);

		String status = courier.deliver(oid);

		String finalMsg = Arrays.toString(items) + "are purchased with prices " + Arrays.toString(prices)
				+ ". The generated bill amount is " + billAmt;

		return finalMsg + " :: " + status;

	}

}
