package com.zoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.*");
		ctx.refresh();
		
		Zoo zoo = ctx.getBean(Zoo.class);
		
		IAnimal animal1 = zoo.getAnimal();
		animal1.getName();
		System.out.println(animal1.getCountOfAnimals("Lion"));

	}

}
