package com.nt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.flipkart.Flipkart;
import com.nt.order.Order;

public class SpringDemo {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.nt"); // Adjust package scanning if needed
        context.register(OrderConfig.class); // Register configuration class
        context.refresh();
              
        Flipkart fl = context.getBean(Flipkart.class);
        System.out.println(fl);
        System.out.println(fl.getOrder1());
        System.out.println(fl.getOrder2());
        System.out.println(fl.getOrder1().getProduct());
        System.out.println(fl.getOrder2().getProduct());
        System.out.println(fl.getOrder1().getProduct().getId());
        System.out.println(fl.getOrder1().getProduct().getName());
        System.out.println(fl.getOrder2().getProduct().getId());
        System.out.println(fl.getOrder2().getProduct().getName());
    }
}
