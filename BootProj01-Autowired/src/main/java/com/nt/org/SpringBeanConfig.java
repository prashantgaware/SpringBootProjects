package com.nt.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfig {
	
	@Primary
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
