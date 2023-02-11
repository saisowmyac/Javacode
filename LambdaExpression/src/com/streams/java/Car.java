package com.streams.java;

import java.util.*;

import java.util.stream.Collectors;

public class Car {

	public static void main(String[] args) {
		CarDetails miniCar1 = new CarDetails();
		miniCar1.setName("Maruthi");
		miniCar1.setNumber("TS20001");
		miniCar1.setType("4 Scater");
		miniCar1.setPrice(700000.00);

		CarDetails miniCar2 = new CarDetails();
		miniCar2.setName("Tata");
		miniCar2.setNumber("TS87651");
		miniCar2.setType("4 Scater");
		miniCar2.setPrice(800000.00);

		CarDetails miniCar3 = new CarDetails();
		miniCar3.setName("Honda Motors");
		miniCar3.setNumber("TS20861");
		miniCar3.setType("4 Scater");
		miniCar3.setPrice(900000.00);

		CarDetails miniCar4 = new CarDetails();
		miniCar4.setName("Audi");
		miniCar4.setNumber("TS29001");
		miniCar4.setType("4 Scater");
		miniCar4.setPrice(1000000.00);

		CarDetails miniCar5 = new CarDetails();
		miniCar5.setName("BMW");
		miniCar5.setNumber("TS0001");
		miniCar5.setType("4 Scater");
		miniCar5.setPrice(1200000.00);

		List<CarDetails> miniCar = new ArrayList<>();
		miniCar.add(miniCar1);
		miniCar.add(miniCar2);
		miniCar.add(miniCar3);
		miniCar.add(miniCar4);
		miniCar.add(miniCar5);

		CarDetails sportsCar1 = new CarDetails();
		sportsCar1.setName("Toyota GR Supra");
		sportsCar1.setNumber("TS0049");
		sportsCar1.setType("4 Scater");
		sportsCar1.setPrice(5000000.00);

		CarDetails sportsCar2 = new CarDetails();
		sportsCar2.setName("Mazda MX-5");
		sportsCar2.setNumber("TS09801");
		sportsCar2.setType("4 Scater");
		sportsCar2.setPrice(4000000.00);

		CarDetails sportsCar3 = new CarDetails();
		sportsCar3.setName("McLaren 720S");
		sportsCar3.setNumber("TS2000");
		sportsCar3.setType("4 Scater");
		sportsCar3.setPrice(5000000.00);

		CarDetails sportsCar4 = new CarDetails();
		sportsCar4.setName("Alpine A110");
		sportsCar4.setNumber("TS2802");
		sportsCar4.setType("4 Scater");
		sportsCar4.setPrice(8000000.00);

		CarDetails sportsCar5 = new CarDetails();
		sportsCar5.setName("BMW");
		sportsCar5.setNumber("TS0228");
		sportsCar5.setType("4 Scater");
		sportsCar5.setPrice(7000000.00);

		List<CarDetails> sportsCar = new ArrayList<>();
		sportsCar.add(sportsCar1);
		sportsCar.add(sportsCar2);
		sportsCar.add(sportsCar3);
		sportsCar.add(sportsCar4);
		sportsCar.add(sportsCar5);
//		sportsCar.add(sportscar5);
//		sportsCar.add(sportscar5);

		List<CarDetails> showRoom = new LinkedList<>();//added two lists
		showRoom.addAll(miniCar);
		showRoom.addAll(sportsCar);
		//streams
		List<Double> serviceCharge = showRoom.stream().map(price -> price.getPrice() + 1500)
				.collect(Collectors.toList());//using map method update price
		System.out.println(serviceCharge);
		List<CarDetails> bmw = showRoom.stream().filter(name -> name.getName() == "BMW" && name.getPrice() == 7000000.00)
				.collect(Collectors.toList());//filter one company car

		System.out.println(bmw);
		Map<String, String> map = showRoom.stream()
				.collect(Collectors.toMap(number -> number.getNumber(), name -> name.getName()));
		System.out.println(map);//converted List to Map
		long count=showRoom.stream().filter(price->price.getPrice()>3000000).count();
		System.out.println(count);//count
		Optional<CarDetails>find = showRoom.stream().findAny();
		System.out.println(find.get());
		showRoom.parallelStream().filter(name -> name.getName()=="BMW").distinct()
				.forEach(name->System.out.println(name));

	}

}
