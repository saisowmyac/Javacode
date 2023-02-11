package com.calculation.lambdaexpressions;

public class Calculation {

	public static void main(String[] args) {

		Functions<Integer> factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};
		System.out.println("6 Factorial is : " + factorial.function(6));
		

		Functions<String> reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;

		};
		System.out.println(reverse.function("Sowmya"));
		System.out.println(reverse.function("utnihC yadhtriB yppaH"));
	

	}

}
