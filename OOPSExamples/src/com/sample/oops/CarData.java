package com.sample.oops;

public class CarData {
	private String carModel,carName,carOwner;
	private double carPrice;
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public void display() {
		System.out.println("The Car Model is :  "+carModel+'\n'+"The Car Name:  "+carName+'\n'+"Car Owner:   "+carOwner+'\n'+"Car Prise:  "+carPrice+"Rs");
	}

}
