package com.Arraylist.collections;

import java.util.*;

public class StudentData {

	public static void main(String[] args) {

		// using array list
		ArrayList<Object> data = new ArrayList<>();// Array list is class
		data.add("sowmya");
		data.add(1);
		data.add("28/02/2000");
		data.add(7.0);
		data.add("Ongole");
		data.remove(2);
		data.add(4, "28/02/2000");
		data.add(7.0);
		System.out.println(data);
		System.out.println("7.0 index Position: " + data.indexOf(7.0));
		System.out.println("7.0 last index position: " + data.lastIndexOf(7.0));
	

	}

}
