package com.nagarro.training.microservice.repository;

import java.util.List;

import com.nagarro.training.microservice.dto.ProductRequest;
import com.nagarro.training.microservice.model.Product;

public interface ProductRepository {
	Product getProductById(int id);
	List<Product> getAllProducts();
	Product saveProduct(ProductRequest product);
	void deleteProductById(int id);
	Product updateProductById(int id, ProductRequest pr);
}
