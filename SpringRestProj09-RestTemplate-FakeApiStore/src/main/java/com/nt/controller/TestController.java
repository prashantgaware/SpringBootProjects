package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.Product;
import com.nt.service.ITestService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ITestService testService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		return ResponseEntity.ok(testService.getAllProducts());
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
		return ResponseEntity.ok(testService.getProductById(id));
	}
	
	@PostMapping("/products/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return ResponseEntity.ok(testService.addProduct(product));
	}
	
	@PutMapping("/products/update/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product product) {
		return ResponseEntity.ok(testService.updateProduct(id, product));
	}
	
	@DeleteMapping("/products/delete/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable Integer id) {
		return ResponseEntity.ok(testService.deleteProduct(id));
	}

}
