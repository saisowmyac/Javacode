package com.streams.java;

public class CarDetails {
	
	private String name,number,type;
	private double price;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
