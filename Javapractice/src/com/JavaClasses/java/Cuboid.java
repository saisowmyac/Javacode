package com.JavaClasses.java;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,w,h;
		System.out.println("Enter Length:");
		l=sc.nextInt();
		System.out.println("Enter width:");
		w=sc.nextInt();
		System.out.println("Enter heigth:");
		h=sc.nextInt();
		Formula formula=new Formula();
		formula.length(l);
		formula.width(w);
		formula.heigth(h);
		formula.volume();
	
	}

}
