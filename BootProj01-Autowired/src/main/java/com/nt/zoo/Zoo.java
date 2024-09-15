package com.nt.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

public class Zoo {
	@Qualifier("lion")
	@Autowired
	public Animal lion;
	
	@Autowired
	public Animal tiger;

}
