package com.sample.oops;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter how many values to Average:");
	  int n=sc.nextInt();
	  System.out.println("Enter Numbers:");
	  double add=0;
	  for(int i=0; i<n; i++){
		  add+=sc.nextInt();
	  }
	  double average=add/n;
System.out.println("The Average value is:"+average);
	}

}
