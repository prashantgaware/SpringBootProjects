package com.zoo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Lion implements IAnimal {

	public Lion() {
		System.out.println("Lion created.");
	}
	
	@Override
	public void getName() {
		System.out.println("This is Lion.");
	}

	@Override
	public int getCountOfAnimals(String name) {
		// System.out.println("10 Lions are present in zoo");
		return 10;
	}

}
