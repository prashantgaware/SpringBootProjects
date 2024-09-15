package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.dbhardcoding.DbCreate;
import com.nt.dbusingproperties.DbCreateUsingProperies;

@SpringBootApplication
public class BootProj04ValueAnnotationExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj04ValueAnnotationExampleApplication.class, args);
		
		// hardcoding the values
		DbCreate db = ctx.getBean(DbCreate.class);
		System.out.println(db.getUrl());
		System.out.println(db.getUserName());
		System.out.println(db.getPassword());
		
		DbCreateUsingProperies dbc = ctx.getBean(DbCreateUsingProperies.class);
		System.out.println(dbc.getUrl());
		System.out.println(dbc.getUsername());
		System.out.println(dbc.getPassword());
		
	}

}
