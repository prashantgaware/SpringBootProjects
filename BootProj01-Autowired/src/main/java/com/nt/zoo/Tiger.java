package com.nt.zoo;

public class Tiger implements Animal {

	@Override
	public int getAnimaCount(String name) {
		return 10;
	}

	@Override
	public void getAnimalName() {
		System.out.println("this is Tiger");
	}

}
