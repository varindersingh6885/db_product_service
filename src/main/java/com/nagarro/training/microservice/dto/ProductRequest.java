package com.nagarro.training.microservice.dto;

public class ProductRequest {
	String name;
	String size;
	float price;
	
	public ProductRequest() {}
	
	public ProductRequest(String name, String size, float price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

