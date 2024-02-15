package com.kodnest.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.demo.entity.Product;
import com.kodnest.demo.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl productservice;
	
	@GetMapping(value="/get")
	public List<Product> getProduct() {
		return productservice.getProduct();
	}
	
	@GetMapping(value="/get/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id) {
		 return productservice.getProductById(id);	
	}
	
	@PostMapping(value="/post")
	public Product postProduct(@RequestBody Product product) {
		 return productservice.postProduct(product);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		 return productservice.deleteById(id);
	}
	
   
	@PutMapping(value="/put/{id}")
	public String updateById(@PathVariable Integer id , @RequestBody Product product) {
		 return productservice.updateById(id, product);
		 
	}
}
