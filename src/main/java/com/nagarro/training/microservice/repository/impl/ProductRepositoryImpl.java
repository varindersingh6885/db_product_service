package com.nagarro.training.microservice.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nagarro.training.microservice.dto.ProductRequest;
import com.nagarro.training.microservice.model.Product;

@Repository
public class ProductRepositoryImpl implements com.nagarro.training.microservice.repository.ProductRepository {
	
	static int uuid;
	List<Product> products;
	
	public ProductRepositoryImpl() {
		uuid = 0;
		this.products = new ArrayList<>();
		addDummyProducts();
	}

	@Override
	public Product getProductById(int id) {
		for(int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		return products;
	}

	@Override
	public Product saveProduct(ProductRequest product) {
		Product p = new Product();
		p.setId(uuid++);
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setSize(product.getSize());
		
		products.add(p);
		
		return p;
	}

	@Override
	public void deleteProductById(int id) {
		List<Product> newProducts = new ArrayList<>();
		
		for(int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			if(p.getId() == id) {
				continue;
			}
			newProducts.add(p);
		}
		
		products = newProducts;

	}
	
	private void addDummyProducts() {
		Product p1 = new Product(uuid++, "Nike Air Force", "M", 2309 );
		Product p2 = new Product(uuid++, "5Star", "S", 10.0f);
		products.add(p1);
		products.add(p2);
	}

	@Override
	public Product updateProductById(int id, ProductRequest pr) {
		Product product = getProductById(id);
		
		if(product != null) {
			product.setName(pr.getName());
			product.setPrice(pr.getPrice());
			product.setSize(pr.getSize());
		}
		
		return product;
	}
}
