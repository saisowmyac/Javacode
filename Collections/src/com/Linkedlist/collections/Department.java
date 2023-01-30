package com.Linkedlist.collections;

import java.util.*;

public class Department {
	int departmentId;
	String departmentName;
	List<Employees> employees;//call employees list

	Department(int id, String name, List<Employees> employee) {

		departmentId = id;
		departmentName = name;
		employees = employee;
	}

	public String toString() {
		return "\nDepartment [Id: " + departmentId + "\tName : " + departmentName + "\tEmployees: " + employees + "]";
	}

	public static void main(String[] args) {

		Employees emp1 = new Employees(20121, "Amit", 10000);
		Employees emp2 = new Employees(20201, "Suma", 10000);
		Employees emp3 = new Employees(20102, "Kumar", 10000);
		Employees emp4 = new Employees(20301, "Priya", 10000);
		Employees emp5 = new Employees(20201, "Vamsi", 10000);
		Employees emp6 = new Employees(20103, "vijay", 10000);
		List<Employees> employee = new LinkedList();//list of employees
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
		employee.add(emp6);

		Department dep1 = new Department(201, "java", List.of(emp1, emp3, emp6));//employees in department
		Department dep2 = new Department(202, "Angular", List.of(emp2, emp5));
		Department dep3 = new Department(203, "java", List.of(emp4));

		List<Department> department = new ArrayList();//Department list
		department.add(dep1);
		department.add(dep2);
		department.add(dep3);

		Iterator<Department> itr = department.iterator();//using iterator
		while (itr.hasNext()) {// while
			Department it = itr.next();
			System.out.println(it.toString());

		}
		System.out.println();

		System.out.println(department.get(1));//Get the data particular index

	}

}
