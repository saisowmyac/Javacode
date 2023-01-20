package com.oops.abstraction1;

public class Natraj {

	public static void main(String[] args) {
     Pen pen =new Pen();
     System.out.println("This Pen name: "+pen.getName("Natraj")+'\n'+"Price is: "+pen.getPrice(10)+'\n'+"Quantity is:"+pen.getQuantity(2));
     System.out.println("***********************************************");
     Pencil pencil=new Pencil();
     System.out.println("This Pencil name: "+pencil.getName("Natraj")+'\n'+"Price is: "+pencil.getPrice(5)+'\n'+"Quantity is:"+pencil.getQuantity(5));
     System.out.println("***********************************************");
     Books books=new Books();
     System.out.println("This Books name: "+books.getName("Natraj")+'\n'+"Price is: "+books.getPrice(50)+'\n'+"Quantity is:"+pen.getQuantity(7));
	}

}
