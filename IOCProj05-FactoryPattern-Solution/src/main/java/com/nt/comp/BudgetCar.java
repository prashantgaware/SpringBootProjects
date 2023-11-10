package com.nt.comp;

public class BudgetCar implements Car {
	
	private String regNo;
	
	

	public BudgetCar(String regNo) {
		System.out.println("BudgetCar.BudgetCar()");
		this.regNo = regNo;
	}



	@Override
	public void drive() {
		System.out.println("Budget car driving");
	}

}
