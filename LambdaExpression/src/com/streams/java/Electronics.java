package com.streams.java;

import java.util.*;
import java.util.stream.Collectors;


public class Electronics {

	public static void main(String[] args) {
		Product laptop1 = new Product(2211, "Hp Laptop", 30000.0);
		Product laptop2 = new Product(2121, "Lenevo Laptop", 40000.0);
		Product laptop3 = new Product(2112, "Acer Laptop", 35000.0);
		Product laptop4 = new Product(1122, "Soni Laptop", 50000.0);
		Product laptop5 = new Product(1221, "Apple Laptop", 100000.0);
		Product laptop6 = new Product(1212, "Dell Laptop", 670000.0);
		List<Product> laptop = new ArrayList<>();
		laptop.add(laptop1);
		laptop.add(laptop2);
		laptop.add(laptop3);
		laptop.add(laptop4);
		laptop.add(laptop5);
		laptop.add(laptop6);
		Product phone1 = new Product(1011, "Samsung", 13000.0);
		Product phone2 = new Product(1001, "Apple", 50000.0);
		Product phone3 = new Product(1111, "Redmi", 13000.0);
		Product phone4 = new Product(1010, "Realme", 12000.0);
		Product phone5 = new Product(1110, "Nokia", 10000.0);
		List<Product> phone = new ArrayList<>();
		phone.add(phone1);
		phone.add(phone2);
		phone.add(phone3);
		phone.add(phone5);
		phone.add(phone4);
		phone.add(phone5);
		phone.add(phone1);

		List<Product> shop = new ArrayList<>();
		shop.addAll(laptop);
		shop.addAll(phone);

		List<Double> buy = shop.stream().filter(name -> name.getProductName() == "Hp Laptop" ||
				name.getProductName()=="Apple").map(p -> p.getPrice() * 2)
				.collect(Collectors.toList());//filter Hp Laptop
		System.out.println(buy);
		Map<String, Double> laptops = laptop.stream()
				.collect(Collectors.toMap(name -> name.getProductName(), price -> price.getPrice()));//List to Map
		Iterator<String> itr = laptops.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Product Name: " + key + "\t Price: " + laptops.get(key));
		}
		System.out.println("------->Remove *Duplicates* <--------");
		phone.stream().distinct().forEach(p->System.out.println(p));//without duplicates

	}

}
