package com.streams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculations {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(23, 52, 52, 25, 84, 57, 64, 77, 93, 50, 136, 55);
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		evenNumbers = integers.stream().parallel().filter(number -> number % 2 == 0)//filter all even numbers
				.collect(Collectors.toList());
		System.out.println("Even Numbers are: " + evenNumbers);
		
		oddNumbers = evenNumbers.stream().map(number -> number + 1)//even to odd numbers
				.collect(Collectors.toList());
		System.out.println("Odd Numbers are: " + oddNumbers);
		
		oddNumbers = integers.parallelStream().filter(value -> value % 2 != 0)//filter all odd numbers
				.collect(Collectors.toList());
		System.out.println("Odd Numbers are: " + oddNumbers);
		
		integers.stream().map(n -> n * n).forEach(n -> System.out.println("Square of Elements: " + n));//Squaring all values
		
		int odd = integers.stream().filter(value -> value % 2 != 0).reduce(0, (a, i) -> (a + i));//Added all odd numbers
		System.out.println("Added all odd numbers: " + odd);
		
		List<Integer> sorted = integers.stream().sorted().collect(Collectors.toList());//sorting all elements
		System.out.println(sorted);
		
		integers.stream().filter(number -> number < 60).distinct()//with out duplicate 
		.forEach(s -> System.out.println("----> " + s));
		
	}

}
