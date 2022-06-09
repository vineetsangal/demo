package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.IProductService;


@RestController

public class ProductController {
	@Autowired
	private IProductService productService;
	@GetMapping(value = "/getproduct")  
	public List<Product> getProduct()   
	{  
	  
	List<Product> products = productService.FindAll();    
	return products;  
	
}
}
