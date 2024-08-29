package com.zoo;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements IAnimal {

	public Tiger() {
		System.out.println("Tiger is created.");
	}
	
	@Override
	public void getName() {
		System.out.println("This is Tiger..");
	}

	@Override
	public int getCountOfAnimals(String name) {
		return 15;
	}

}
