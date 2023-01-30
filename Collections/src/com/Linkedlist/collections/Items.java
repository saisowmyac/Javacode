package com.Linkedlist.collections;

import java.util.*;
import java.util.LinkedList;

public class Items {
	String storeName;
	double price;
	int quantity;
	double total;

	public Items(String storeName, double price, int quantity) {
		this.storeName = storeName;
		this.price = price;
		this.quantity = quantity;

	}

	public double getTotal() {
		return price * quantity;
	}

	public static void main(String[] args) {
		Items item1 = new Items("Book", 50, 2);
		Items item2 = new Items("Bottle", 20, 5);
		Items item3 = new Items("dairymilk", 180, 1);
		Items item4 = new Items("Album", 500, 2);
		LinkedList<Items> store = new LinkedList<>();

		store.add(item1);
		store.add(item2);
		store.add(item3);
		store.add(item4);

		System.out.println("Using peek: " + store.peek().storeName);

		System.out.println("<<<<Using While>>>>");
		Iterator<Items> itr = store.iterator();
		while (itr.hasNext()) {// while
			Items it = itr.next();
			System.out.println("Items is:   " + it.storeName + " \t Price is: " + it.price + " \t Quantity: "
					+ it.quantity + "\t Total: " + it.getTotal());

		}
//		System.out.println("poll: " + store.poll().storeName);
//		System.out.println(store.peekFirst().storeName);
		store.removeFirst();
		System.out.println(".....For each.....");
		for (Items s : store) {// for each
			System.out.println("store is:   " + s.storeName + " \t Price is: " + s.price + " \t Quantity: " + s.quantity
					+ "\t Total: " + s.total);

		}

	}

}
