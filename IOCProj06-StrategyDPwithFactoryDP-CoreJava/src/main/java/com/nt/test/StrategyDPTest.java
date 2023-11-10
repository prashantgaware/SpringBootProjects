package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {

		try {

			Flipkart flipkart = FlipkartFactory.createFlipkart("bluedart");

			String result = flipkart.shopping(new String[] { "shirt", "trouser", "mobile" },
					new float[] { 3400.0f, 5000.0f, 35000.0f });
			
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
