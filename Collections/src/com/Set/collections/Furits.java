package com.Set.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Furits {

	public static void main(String[] args) {
		HashSet<String> furits = new HashSet<>();
		furits.add("Apple");
		furits.add("Banana");
//		furits.add(null);
		furits.add("Orange");
		furits.add("Apple");// set does not print duplicate values
		furits.add("Papaya");

		System.out.println(furits);
//		furits.remove("Apple");
		System.out.println("After Remove apple: " + furits);
		TreeSet<String> furit = new TreeSet<String>(furits);// Convert hashSet to treeSet

		System.out.println("Sorted Elements or : " + furit);
		furit.add("Mango");
		System.out.println("Adding one element : " + furit);
		System.out.println("The first element is : " + furit.first());
		System.out.println(furit.ceiling("Papaya") + '\n' + furit.ceiling("abc"));
		System.out.println("Hash code is: " + furit.hashCode());
//		System.out.println("Remove Last element is : " + furit.pollLast());// pollLast
		System.out.println(furit.higher("Mango"));
		System.out.println(furit.lower("Mango"));
//		System.out.println(furit.retainAll(furits));
		System.out.println("Reverse Order : " + furit.descendingSet());
		System.out.println(furit.floor("ooo"));
		HashSet<String> furi = new HashSet<>(furit);
		System.out.println(furi);

	}

}
