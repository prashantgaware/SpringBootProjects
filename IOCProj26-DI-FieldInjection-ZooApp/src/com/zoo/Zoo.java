package com.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	
//	@Qualifier("tiger")
	@Autowired
	IAnimal animal;
	
	public Zoo() {
		System.out.println("Zoo is opened.");
	}

	public IAnimal getAnimal() {
		return animal;
	}

	public void setAnimal(IAnimal animal) {
		this.animal = animal;
	}

}
