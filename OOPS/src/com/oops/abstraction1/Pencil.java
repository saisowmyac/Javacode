
package com.oops.abstraction1;

public class Pencil implements Stationery {

	@Override
	public double getPrice(int a) {
		return a;
	}

	@Override
	public String getName(String name) {
		return name;
	}

	@Override
	public int getQuantity(int b) {
		return b;
	}

}
