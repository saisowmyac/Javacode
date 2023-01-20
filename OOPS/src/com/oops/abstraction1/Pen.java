package com.oops.abstraction1;

public class Pen  implements Stationery{

	@Override
	public double getPrice(int a) {
		return a;
	}

	@Override
	public String getName(String name) {
		return name; 
	}

	@Override
	public int getQuantity(int b) {
		// TODO Auto-generated method stub
		return b;
	}
//	public double getTotal(double c) {
//		// TODO Auto-generated method stub
//		
//		return c=a*b; 
//	}

}
