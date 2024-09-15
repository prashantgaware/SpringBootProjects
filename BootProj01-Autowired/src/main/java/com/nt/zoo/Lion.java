package com.nt.zoo;

public class Lion implements Animal {

	@Override
	public int getAnimaCount(String name) {
		return 15;
	}

	@Override
	public void getAnimalName() {
		System.out.println("this is Lion");
	}

}
