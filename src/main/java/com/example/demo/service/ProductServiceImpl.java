package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Products;
import com.example.demo.exeption.NoProductsFoundException;
import com.example.demo.repository.ProductRepository;

@Service
public  class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public  Products findProductById(int pid) {
		if( pid == 101) {
			return new Products(101, "Keyboard", 800.00);
		}else {
			throw new NoProductsFoundException("No Products found");
		}
	}
	

}
