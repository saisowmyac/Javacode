package com.oops.inheritence1;

public class Solutions {

	public static void main(String []args){
        Adder add = new Adder();
        add.sum();
        add.addition(22, 55);
        System.out.println("My superclass is: " + add.getClass().getSuperclass().getName());	
        System.out.print(add.addition(22, 55) + " " +add.addition(14, 55)+ " " + add.addition(22, 50) + "\n");
     }
}
