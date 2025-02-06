package com.nt.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entities.ProductDetails;
import com.nt.repository.ProductDetailsRepo;

@Component
public class DatabaseOps {
	
	@Autowired
	ProductDetailsRepo productDetailsRepo;

	public void addData() {
		ProductDetails p1 = new ProductDetails();
		p1.setProductId(1);
		p1.setProductName("Pixel");
		p1.setProductAmount(45000);
		
		productDetailsRepo.save(p1);
	}
}
