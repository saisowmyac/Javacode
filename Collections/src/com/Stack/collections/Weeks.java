package com.Stack.collections;

import java.util.Stack;

public class Weeks {

	public static void main(String[] args) {
	Stack<String> weeks=new Stack<>();//LIFO
	weeks.push("Sunday");
	weeks.push("Monday");
	weeks.push("Tuesday");
	weeks.push("Wednesday");
	weeks.push("Friday");
	//weeks.push("Sunday");
	weeks.add("Saturday");
	weeks.add(4, "Thursday");
	for(int i=0;i<weeks.size();i++) {
		System.out.println(i + " " + weeks.get(i));
		
	}
	System.out.println("Peek one Element: " + weeks.peek());//print 1st element
	System.out.println("Remove one Element: " + weeks.pop());//remove 1st element
	System.out.println("Search one Element: " + weeks.search("Sunday"));
	System.out.println("Index of one Element: " + weeks.indexOf("Sunday"));
	
	System.out.println(weeks);


	}

}
