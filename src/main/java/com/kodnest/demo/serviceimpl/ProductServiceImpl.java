package com.kodnest.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.demo.entity.Product;
import com.kodnest.demo.repository.ProductRepository;
import com.kodnest.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepo;
	

	public List<Product> getProduct() {
		
		 return productRepo.findAll();
	
	}


	public Optional<Product> getProductById(Integer id) {
		Optional<Product> p = productRepo.findById(id);
	
		return p;
	}


	public Product postProduct(Product product) {
		Product s = productRepo.save(product);
		return s;
	}


	public String deleteById(Integer id) {
		productRepo.deleteById(id);
	
		return "Delete Success";
	}


	public String updateById(Integer id, Product updatedProduct) {
		
		//get the product for update
		Optional<Product> exsitingProduct = productRepo.findById(id);
		
		if(exsitingProduct.isPresent()) {
		//modify the app layer for update
		 Product product = exsitingProduct.get();
		 product.setPname(updatedProduct.getPname());
		 
		 //save the updated record
		 productRepo.save(product);
		
		return "Update Success";
	}else {
		return "Record not found";
	}
	}
}
