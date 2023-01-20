package com.Arraylist.collections;

import java.util.*;

public class Test{
	public static void main(String[] args) {
		
		List<String> color= new ArrayList<>();//only String eliments
		color.add("Green");
		color.add("Red");
		color.add(2,"Pink");
		color.add("Yellow");
		color.add("Blue");
		color.add(2,"Gray");
		List<Integer> integer=new ArrayList<>();
		integer.add(22);
		integer.add(23);
		integer.add(24);
		integer.add(2,22);
		List<Integer> integer1=new ArrayList<>();
		integer.add(11);
		integer.add(89);
//		integer.clear();//clear all
		boolean b= Collections.addAll(integer,99);//add 
		boolean b1= Collections.addAll(color,"SkyBlue");
		integer.remove(5);//remove 5th index
		System.out.println(b1);
		System.out.println(b);
		integer.addAll(integer1);//using addAll()
		Iterator<String> itr= color.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		for(Integer in:integer) {
			System.out.println(integer);
		}
		
 
	}

}
