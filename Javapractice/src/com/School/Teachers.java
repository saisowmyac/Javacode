package com.School;

public class Teachers {
	int id;
	String name;
	String subject;
	double salary;
	
	public double bonus() {
		return salary+(salary*0.05);
	}
		

}
