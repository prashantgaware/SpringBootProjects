package com.nt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.order.Order;
import com.nt.order.Product;

@Configuration
public class OrderConfig {
	/*@Bean("order1")
    public Order order1() {
        Order order = new Order();
        order.setOrderId(1);
        order.setUserName("User1");
        return order;
    }
	 */
    @Bean("order2")
    public Order order2() {
        Order order = new Order();
        order.setOrderId(2);
        order.setUserName("User2");
        return order;
    }
    
    @Bean("product2")
    public Product product2() {
    	return new Product();
    }
}
