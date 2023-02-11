package com.predifineinterfaces.lambdaexpression;

import java.util.function.Predicate;

public class EvenNumbers {

	public static void main(String[] args) {

		int a[] = { 8, 5, 2, 13, 20, 19, 30, 67, 98, 32, 76, 77 };
		Predicate<Integer> num = i -> i % 2 == 0;
		Predicate<Integer> num1 = i -> i > 30;
		System.out.println("The Numbers is Even and also Greater then 30 ");
		for (Integer n : a) {
			if (num.and(num1).test(n)) {// it is && operation
				System.out.println(n);

			}
		}
		System.out.println("The Numbers is Even and  Greater then 30 ");
		for (int n : a) { // it is or operation
			if (num.or(num1).test(n)) {
				System.out.println(n);

			}
		}
		System.out.println("Oddumbers ");
		for (int n : a) { // it is negate operation
			if (num.negate().test(n)) {
				System.out.println(n);

			}
		}
		Predicate<Integer> numbers = i -> (i > 10);
		System.out.println("50 is Greater then 10? " + numbers.test(50));
		System.out.println("9 is Greater then 10? " + numbers.test(9));

	}

}
