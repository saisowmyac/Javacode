package com.constructor.java;

 class Car {
	String Name;
	double Price;
	public Car(String Name) {
        Name = Name;
		System.out.println("MY Constructor");
		System.out.println("MY Car name:"+Name);

	}
	public Car(String Name,double Price ) {
		this.Name=Name;
		this.Price=Price;
		System.out.println("My Second Construcor");
		System.out.println("MY Car name:"+this.Name+"Price is:"+this.Price);

	}
	public void run() {
		System.out.println(Name+"Car is running");
	}

	public static void main(String[] args) {
		Car Maruthi=new Car("Maruthi");
		Maruthi.run();
		Car Honda=new Car("Honda");
		Honda.run();
		Car M_P=new Car("Maruthi",5000000.00);
		M_P.run();
		Car H_P=new Car("Honda",7000000.00);
	     H_P.run();

}

}

