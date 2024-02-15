package com.kodnest.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kodnest.demo.entity.Product;

@Service
public interface ProductService {
	
	public List<Product> getProduct();
	public Optional<Product> getProductById(Integer id);
	public Product postProduct(Product product);
	public String deleteById(Integer id);
}
