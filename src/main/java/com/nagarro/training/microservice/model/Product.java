package com.nagarro.training.microservice.model;

public class Product {
	int id;
	String name;
	String size;
	float price;
	
	public Product() {}
	
	public Product(int id, String name, String size, float price) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
