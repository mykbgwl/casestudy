package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.model.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Product product) {
		service.addProduct(product);
		return "Product Added";
	}

	@PatchMapping("/updateproduct")
	public String updateProduct(@RequestBody Product product) {
		if(service.updateProduct(product)){
			return "Product updated";
		}
		else {
			
		}
	}
}
