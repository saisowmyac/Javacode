package com.oops.abstraction;

public class Abstraction {

	public static void main(String[] args) {
		EmployeeSalary employeeSalary=new EmployeeSalary();
		 
		 employeeSalary.employeeSalary();
		 employeeSalary.name="kumar";
		 employeeSalary.id=101;
		 employeeSalary.address="ongole";
		 employeeSalary.salary=250000;
		 System.out.println("Employee nama:"+ employeeSalary.name);
		 System.out.println("Employee id"+ employeeSalary.id);
		 System.out.println("Employee Address:"+ employeeSalary.address);
System.out.println("employee Salary:"+ employeeSalary.salary);
	}

}
