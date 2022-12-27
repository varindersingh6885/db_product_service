package com.nagarro.training.microservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.training.microservice.dto.ProductRequest;
import com.nagarro.training.microservice.dto.ProductResponse;
import com.nagarro.training.microservice.model.Product;
import com.nagarro.training.microservice.repository.ProductRepository;
import com.nagarro.training.microservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepo;

	@Override
	public ProductResponse getProductById(int id) {
		Product p = productRepo.getProductById(id);
		
		return ProductResponse.mapToProductResponse(p);
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		List<Product> products = productRepo.getAllProducts();
		List<ProductResponse> productResponses = new ArrayList<>();
		for(Product p : products) {
			productResponses.add(ProductResponse.mapToProductResponse(p));
		}
		return productResponses;
	}

	@Override
	public ProductResponse saveProduct(ProductRequest product) {
		Product p = productRepo.saveProduct(product);
		
		return ProductResponse.mapToProductResponse(p);
	}

	@Override
	public void deleteProductById(int id) {
		productRepo.deleteProductById(id);

	}

	@Override
	public ProductResponse updateProduct(int id, ProductRequest pr) {

		Product product = productRepo.updateProductById(id, pr);
		
		return ProductResponse.mapToProductResponse(product);
	}

}
