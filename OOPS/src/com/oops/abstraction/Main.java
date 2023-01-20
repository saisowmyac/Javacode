package com.oops.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Write  your Booktitle: ");
	String tittle=sc.nextLine();
	MyBook new_book=new MyBook();
	new_book.setTitle(tittle);
	System.out.println("The Book Title is: "+new_book.getTitle());
	sc.close();

	}

}
