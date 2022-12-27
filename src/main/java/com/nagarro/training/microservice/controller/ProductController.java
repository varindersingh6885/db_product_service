package com.nagarro.training.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.microservice.dto.ProductRequest;
import com.nagarro.training.microservice.dto.ProductResponse;
import com.nagarro.training.microservice.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/")
	public List<ProductResponse> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public ProductResponse getProductById(@PathVariable("id") int id) {
		
		return productService.getProductById(id);
	}
	
	@PostMapping("/")
	public ProductResponse saveProduct(@RequestBody ProductRequest pr) {
		return productService.saveProduct(pr);
	}
	
	@PutMapping("/{id}")
	public ProductResponse updateProduct(@PathVariable("id") int id, @RequestBody ProductRequest pr) {
		return productService.updateProduct(id, pr);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable("id") int id) {
		
		productService.deleteProductById(id);
		
		return "Product deleted";
	}
}
