package com.Linkedlist.collections;

public class Employees {

	int employeeId, employeeSalary;
	String employeeName;

	Employees(int id, String name, int salary) {

		employeeId = id;
		employeeSalary = salary;
		employeeName = name;
	}

	public String toString() {
		return "\nEmployees [Id : " + employeeId + "\t Name : " + employeeName + "\t Salary : " + employeeSalary + "]";
	}
}
