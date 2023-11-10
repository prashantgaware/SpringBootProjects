package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class BusinessManCustomer2 {
	
	public static void main(String[] args) {
		Car car = CarFactory.createCar("luxury", "MH01AP9999");
		car.drive();
		System.out.println("===============");
		
	}
	
}
