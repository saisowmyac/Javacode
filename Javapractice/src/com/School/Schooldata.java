package com.School;

public class Schooldata {

	public static void main(String[] args) {
//		Teachers obj = new Teachers();
//		obj.Id=22;
//		obj.Name="Sowmya";
//		obj.Subject="Java";
//		obj.Salary=30000;
//
//		System.out.println("teacher Salary:"+ obj.Salary);
//	System.out.println("Bonus is:"+obj.bonus());
//		System.out.println("teacher Name:"+ obj.Name);
		Area ar=new Area();
		Rectangle R = new Rectangle();
		Triangle T=new Triangle();
		ar.l=20;
		ar.b=20;
		R.l=22;
		R.b=11;
		T.h=10;
		T.b=9;
		int A = R.getRectangle();
		double B = T.getTriangle();
//		ar.reduce=15;
		System.out.println("dd"+ar.getArea(20));
		System.out.println("Rectangle"+A);
		System.out.println("triangle"+B);
		
		
		
		}
	}
		 



