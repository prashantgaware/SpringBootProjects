package com.nt.comp;

public class LuxuryCar implements Car {
	
	private String regNo;

	public LuxuryCar(String regNo) {
		System.out.println("LuxuryCar.LuxuryCar()");
		this.regNo = regNo;
	}

	@Override
	public void drive() {
		System.out.println("Luxury car driving");
	}

}
