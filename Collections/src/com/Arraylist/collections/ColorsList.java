package com.Arraylist.collections;

import java.util.*;

public class ColorsList {

	public static void main(String[] args) {
		List<String> color= new LinkedList<>();
		System.out.println("Colors List");
		color.add("Green");//autoboxing
		color.add("Red");
		color.add(2,"Pink");
		color.add("Yellow");
		color.add("Blue");
		color.add(2,"Gray");
		System.out.println(color);
		Iterator<String> itr= color.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("reverse");
		
//		while(itr.hasPrev) {
//			
//			System.out.println(itr.prev());
//		}

		
		if(color.contains("Yellow")) {
			System.out.println("yes");
		}
		else {
	      System.out.println("No");
		}
		String newItem=color.get(4);
		System.out.println(newItem);
		String[] arr= color.toArray(new String[0]);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array Element: "+ arr[i]);
		}

	}

}
