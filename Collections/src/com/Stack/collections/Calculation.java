package com.Stack.collections;

import java.util.Scanner;
import java.util.Vector;

public class Calculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Element: ");
		int n = sc.nextInt();

		Vector<Integer> element = new Vector<>();

		int num = 1;
		System.out.println("Enter Values: ");

		for (int i = num; i <= n; i++) {
			num = sc.nextInt();
			element.add(num);
		}

		element.add(3);
		element.add(2);
		element.add(9);
		element.add(2);

		System.out.println(element);

		int mul = 1;
		int total = 0;
		Double avg;
		for (int i = 0; i < element.size(); i++) {
			total += element.get(i);
			mul *= element.get(i);
		}

		System.out.println("Sum of Element: " + total);
		System.out.println("Multiplicaton of Element: " + mul);
		avg = (double) total / element.size();
		System.out.println("Average of Element: " + avg);

	}
}
