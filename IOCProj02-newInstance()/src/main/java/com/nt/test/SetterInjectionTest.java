package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory((BeanFactory) res);
		
//		BeanFactory factory = new BeanFactory(res);
		
		Object obj = factory.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String result  = generator.generateMessage("Raja");
		
		System.out.println("Wish message is " + result);
	}

}
