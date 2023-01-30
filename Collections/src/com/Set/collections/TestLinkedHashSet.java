package com.Set.collections;

import java.util.*;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> num = new LinkedHashSet<>();
		num.add(202);
		num.add(20);
		num.add(99);
		num.add(20);
		num.add(null);
		num.add(90);
		num.add(20);
		num.add(99);
		System.out.println(num);
		System.out.println("Set Size: " +num.size());
		
			
		
//		TreeSet<Integer> number = new TreeSet<Integer>(num);
//		System.out.println(number);
		
	}

}
