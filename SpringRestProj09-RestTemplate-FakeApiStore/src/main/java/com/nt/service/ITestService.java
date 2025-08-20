package com.nt.service;

import java.util.List;

import com.nt.dto.Product;

public interface ITestService {
	
	List<Product> getAllProducts();
	
	Product getProductById(Integer id);
	
	Product addProduct(Product product);
	
	Product updateProduct(Integer id, Product product);
	
	Product deleteProduct(Integer id);

}
