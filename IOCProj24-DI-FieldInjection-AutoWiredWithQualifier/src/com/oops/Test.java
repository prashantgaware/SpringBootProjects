package com.oops;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.*");
		ctx.refresh();
		
		Impl impl = ctx.getBean(Impl.class);
		
		String name = impl.one.getName();
		System.out.println(name);
		System.out.println(impl.getOne().getCount(name));
		
		System.out.println("----------------------------------------");
		
		IOne newOne = ctx.getBean(B.class);
		impl.setOne(newOne);
		
		System.out.println(newOne);
	}
}
