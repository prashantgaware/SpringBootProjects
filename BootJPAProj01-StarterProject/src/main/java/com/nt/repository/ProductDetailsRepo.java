package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entities.ProductDetails;

public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Integer> {

}
