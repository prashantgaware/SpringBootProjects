package com.nt.service;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nt.dto.Product;

@Service
public class TestService implements ITestService {
	
	private static final String BASE_URL = "https://fakestoreapi.com/products";

	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public List<Product> getAllProducts() {
		Product[] products = restTemplate.getForObject(BASE_URL, Product[].class);
		return List.of(products);
	}

	@Override
	public Product getProductById(Integer id) {
		String url = BASE_URL + "/" + id;
		Product product = restTemplate.getForObject(url, Product.class);
		return product;
	}

	@Override
	public Product addProduct(Product product) {
		String url = BASE_URL + "/add";
		Product createdProduct = restTemplate.postForObject(url, product, Product.class);
		return createdProduct;
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		String url = BASE_URL + "/update/" + id;
		restTemplate.put(url, product);
		return product;
	}

	@Override
	public Product deleteProduct(Integer id) {
		String url = BASE_URL + "/delete/" + id;
		restTemplate.exchange(url, HttpMethod.DELETE, null, Product.class);
		return new Product(id, null, null, null, null, null);
	}
}
