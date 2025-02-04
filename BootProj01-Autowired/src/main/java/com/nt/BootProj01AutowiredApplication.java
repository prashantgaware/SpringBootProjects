package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.org.Employee;
import com.nt.org.Organization;
import com.nt.zoo.Zoo;

@SpringBootApplication(scanBasePackages = {"com.nt.zoo", "com.nt"})
public class BootProj01AutowiredApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01AutowiredApplication.class, args);
		/*
		Organization org = ctx.getBean(Organization.class);
		System.out.println(org);
		System.out.println(org.getEmp());
		org.setEmp(new Employee());
		System.out.println(org.emp);
		*/
		
		Zoo zoo = ctx.getBean(Zoo.class);
		System.out.println(zoo);
	}

}
