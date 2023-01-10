package com.sample.oops;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeSalary salary=new EmployeeSalary();
		salary.setSalary(200);
		salary.setHour(8);
		salary.getinfo();
		System.out.println(salary.getinfo());
		salary.addSal();
//	System.out.println(salary.addSal());
		salary.addWork();
		System.out.println(salary.addWork());
	}
}
