package com.nagarro.training.microservice.service;

import java.util.List;

import com.nagarro.training.microservice.dto.ProductRequest;
import com.nagarro.training.microservice.dto.ProductResponse;

public interface ProductService {
	ProductResponse getProductById(int id);
	List<ProductResponse> getAllProducts();
	ProductResponse saveProduct(ProductRequest product);
	void deleteProductById(int id);
	ProductResponse updateProduct(int id, ProductRequest pr);
}
