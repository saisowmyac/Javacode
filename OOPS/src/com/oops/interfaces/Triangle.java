package com.oops.interfaces;

public class Triangle implements Polygon {

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("Area of the Triangle is:"+(length*breadth)/2);
		
		
	}

}
