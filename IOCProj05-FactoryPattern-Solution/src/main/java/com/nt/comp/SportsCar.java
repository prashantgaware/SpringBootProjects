package com.nt.comp;

public class SportsCar implements Car {
	
	private String regNo;
	
	

	public SportsCar(String regNo) {
		System.out.println("SportsCar.SportsCar()");
		this.regNo = regNo;
	}



	@Override
	public void drive() {
		System.out.println("Sports car driving");
	}

}
