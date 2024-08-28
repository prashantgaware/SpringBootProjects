package com.oops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Impl {

	@Autowired
	IOne one;
	
	public Impl() {
		System.out.println("Test is created.");
	}

	public IOne getOne() {
		return one;
	}

	public void setOne(IOne one) {
		this.one = one;
	}
	
}
