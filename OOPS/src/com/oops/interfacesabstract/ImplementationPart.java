package com.oops.interfacesabstract;


public class ImplementationPart implements ArithmeticOprations, mathOprations {

	@Override
	public double squareRoot(int a) {
		
		return Math.sqrt(a);
		
	}

	@Override
	public double powreOf(int a, int b) {
		
		return Math.pow(a, b);
	}

	@Override
	public int addition(int a, int b, int c) {
		
		return a+b+c;
	}

	@Override
	public int multiplication(int a, int b, int c) {
		
		return a*b*c;
	}
	


}
