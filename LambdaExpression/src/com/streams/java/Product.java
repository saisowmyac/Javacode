package com.streams.java;

public class Product {
	int productId;
	String productName;
	double price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int id, String name, double price) {

		productId = id;
		productName = name;
		this.price = price;
	}

	public String toString() {
		return "Product [Id=" + productId + ", Name=" + productName + ", Price=" + price + "]";
	}

}
