package com.oops.interfacesabstract;



public class Result {

	public static void main(String[] args) {
		ImplementationPart implementation=new ImplementationPart();
		double squareRoot=implementation.squareRoot(225);
		System.out.println("The square Root value:"+implementation.squareRoot(225));
		double powreOf=implementation.powreOf(5,8);
		System.out.println("The Power of value is:"+implementation.powreOf(5,8));
		int addition=implementation.addition(5, 9, 8);
        System.out.println("the addition Value is:"+implementation.addition(5, 9, 8));
        int multiplication= implementation.multiplication(9,4,9 );
	   System.out.println("The Multiplication is:"+implementation.multiplication(9,4,9 ));

	}
}
