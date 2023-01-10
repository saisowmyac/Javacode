package com.sample.oops;

public class Car {

	public static void main(String[] args) {
		CarData car1=new CarData();
		// TODO Auto-generated method stub
		car1.setCarModel("Maruti Wagon R");
		car1.setCarName("Maruti");
		car1.setCarOwner("Sowmya");
		car1.setCarPrice(5000000);
		car1.display();
		System.out.println("***************************************");
		CarData car2=new CarData();
		car2.setCarModel("Toyota Fortuner");
		car2.setCarName("Toyota");
		car2.setCarOwner("Sai");
		car2.setCarPrice(1000000);
		car2.display();
		System.out.println("***************************************");
		

	}

}
