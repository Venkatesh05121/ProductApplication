package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Products;
import com.example.demo.service.ProductService;

@RestController
public class ProductsController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products/{id}")
	public Products getProductById(@PathVariable("id") int pid) {
		
		return productService.findProductById(pid);
	}
	

}
