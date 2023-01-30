package com.Queue.collections;

import java.util.*;

public class Months {

	public static void main(String[] args) {
		PriorityQueue<String> months = new PriorityQueue<>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("April");
		months.add("August");
		System.out.println(months);
		System.out.println("Found First Element is: " + months.element());
		System.out.println("Delete first element: " + months.poll());
		System.out.println("delete perticular elements : " + months.remove("April"));
		System.out.println(months);
		System.out.println("Queue Size is : " + months.size());
		System.out.println();
		Deque<String> month = new ArrayDeque<>();
		month.add("January");
		month.add("February");
		month.add("March");
		month.add("April");
		month.add("May");
		month.add("April");
		month.add("August");
		System.out.println("ArrayDeue Elements are print given Order");
		System.out.println(month);
		System.out.println("First Element is: " + month.element());
		System.out.println("Delete first element: " + month.remove());
		month.offerLast("july");
		month.offerFirst(".....");
		System.out.println(month);

	}

}
