package com.practice.array1;

import java.util.Arrays;

public class Myarray {
	public static void main(String[]args) {
		int[] MA1= {
				12,58,69,125,45,36,49
		};
		System.out.println("My Origenal data"+Arrays.toString(MA1));
		for(int i=0;i<MA1.length/2;i++) {
			int temp=MA1[i];
			MA1[i]=MA1[MA1.length-i-1];
			MA1[MA1.length-i-1]= temp;
			
		}
		System.out.println("My Reverse data"+Arrays.toString(MA1));
	}

}
