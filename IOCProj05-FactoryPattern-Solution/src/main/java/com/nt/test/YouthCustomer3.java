package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxuryCar;
import com.nt.comp.SportsCar;
import com.nt.factory.CarFactory;

public class YouthCustomer3 {
	
	public static void main(String[] args) {

		Car car = CarFactory.createCar("sports", "MH01AP0001");
		car.drive();
		System.out.println("===============");
		
	}
	
}
