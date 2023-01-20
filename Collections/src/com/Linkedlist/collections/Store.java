package com.Linkedlist.collections;



import java.util.Iterator;
import java.util.LinkedList;

public class Store {
	String itemName;
	double price;
	int quantity;
	double total=price*quantity;
	
	
	public Store(String itemName,double price,int quantity) {
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
		
		total=price*quantity;
	}

	public static void main(String[] args) {
		Store item1=new Store("Book", 50, 2);
		Store item2=new Store("Bottle", 20, 5);
		Store item3=new Store("dairymilk", 180, 1);
		Store item4=new Store("Album", 500, 2);
		LinkedList <Store> item = new LinkedList<>();
		item.add(item1);
		item.add(item2);
		item.add(item3);
		item.add(item4);
		
		System.out.println("Using peek: " + item.peek().itemName);

		 System.out.println("<<<<Using While>>>>");
			Iterator<Store> itr = item.iterator();
			while(itr.hasNext()) {//while
				Store it= itr.next();
				System.out.println("Item is:   " + it.itemName + " \t Price is: " + it.price +" \t Quantity: " + it.quantity+"\t Total: " + it.total);
				
			}
//		System.out.println("poll: " + item.poll().itemName);
//		System.out.println(item.peekFirst().itemName);
		item.removeFirst();
		System.out.println(".....For each.....");
		for(Store s:item) {//for each
		System.out.println("Item is:   " + s.itemName + " \t Price is: "+ s.price + " \t Quantity: " + s.quantity+"\t Total: " + s.total);
		
		}
	   
		
		
	}

}
