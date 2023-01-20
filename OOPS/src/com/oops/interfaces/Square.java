package com.oops.interfaces;

public class Square implements Polygon{

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("Area of the Square is:"+(length*length));
		
		
	}

}
