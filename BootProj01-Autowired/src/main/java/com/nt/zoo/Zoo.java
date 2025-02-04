package com.nt.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Qualifier("lion")
	@Autowired
	public Animal lion;
	
	@Qualifier("tiger")
	@Autowired
	public Animal tiger;

}
