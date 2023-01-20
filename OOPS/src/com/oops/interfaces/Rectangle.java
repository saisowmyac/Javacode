package com.oops.interfaces;

public class Rectangle implements Polygon {
	

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("Area of the Rectangle is:" + (length*breadth));
		
		
	}
	

}
