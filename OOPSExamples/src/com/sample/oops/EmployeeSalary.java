package com.sample.oops;

public class EmployeeSalary {
	private double salary;
	private int hour;
	double total;
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
      public double getinfo() {
	      total=salary*hour;
	      return total;
	      }
public void addSal() {
	int i=500;
	while(salary<i) {
		total=salary+100;
		i++;
		}
	System.out.println(total);
}
public double addWork() { 
	int i=6;
 while (hour>i) {
	  
		 salary=salary+10;
	  i++;  
		}
	return salary;
} 

}
