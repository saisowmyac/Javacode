package com.practice.array;

public class Array {
	public static  boolean data(int[] arr,int items) {
		for (int n:arr) {
			if(items==n) {
				return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		int Myarray[]= {
				55,77,86,54,68,28,34,999,8888,777
		};
		System.out.println("Arry is :"+data(Myarray,48));
		System.out.println("Arry is :"+data(Myarray,55));
//		 Array1 A1 =new Array1();
		

		

	}

}
