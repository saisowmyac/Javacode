package com.JavaClasses.java;

public class Formula {
	int length,width,heigth;
	int volume=0;
	public int length(int l) {
		length=l;
		return l;
	}
	public int width(int w) {
		width=w;
		return w;
	}
	public int heigth(int h) {
	    heigth=h;
		return h;
	}
	public void volume() {
		volume=length*width*heigth;
		System.out.println("My cuboid Valume is:"+volume);
	}

}
