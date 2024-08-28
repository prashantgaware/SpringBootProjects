package com.oops;

import org.springframework.stereotype.Component;

@Component
public class B implements IOne {
	
	public B() {
		System.out.println("B is created");
	}

	@Override
	public String getName() {
		return "B";
	}

	@Override
	public int getCount(String name) {
		return 100;
	}

}
