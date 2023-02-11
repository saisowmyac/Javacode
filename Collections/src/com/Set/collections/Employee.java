package com.Set.collections;

import java.util.*;

public class Employee {
	int id;
	String name, address, doj;
	double salary;

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", doj=" + doj + ", salary=" + salary
				+ "]";
	}

	public Employee(int id, String name, String address, String doj, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.doj = doj;
		this.salary = salary;

	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(202201, "Sowmya", "Ongole", "23/12/2022", 10000.0);
		Employee emp2 = new Employee(202202, "Sai", "Hydrabad", "22/12/2022", 10000.0);
		Employee emp3 = new Employee(202203, "Sowmya", "Kakinada", "20/12/2022", 10000.0);
		Employee emp4 = new Employee(202204, "Suni", "Nellore", "23/12/2022", 10000.0);
		Employee emp5 = new Employee(202205, "Anju", "Ongole", "29/12/2022", 10000.0);

		HashSet<Employee> emp = new HashSet<>();// Hash Set
		emp.add(emp1);
		emp.add(emp2);
		System.out.println(emp.add(emp3));
		System.out.println(emp.add(emp4));
		emp.add(emp5);
		System.out.println(emp.add(emp3));// its duplicate value it does not print
		HashSet<Employee> emp11 = new HashSet<>();
		emp11.addAll(emp);
		System.out.println(emp11);
		emp11.clear();
		System.out.println(emp11);

		for (Employee em : emp) {// For each
//			System.out.println("Employee[" + "id : " + em.id + "\t Name: " + em.name + "\t Address: " + em.address
//					+ "\t Date of Join: " + em.doj + "\t Salary: " + em.salary + "]");

			System.out.println(em.toString());
		}
		System.out.println();
		emp.remove(emp3);
		System.out.println("After Remove emp3 object : ");

		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee em = itr.next();
			System.out.println("Employee [" + "id : " + em.id + "\t Name: " + em.name + "\t Address: " + em.address
					+ "\t Date of Join: " + em.doj + "\t Salary: " + em.salary + "]");
//			System.out.println(em.toString());
		}

		System.out.println();
		System.out.println("emp is equal to emp2 : " + emp.equals(emp2));
		System.out.println("emp is equal to emp : " + emp.equals(emp));
		emp.clear();
		System.out.println("Delete all elements :" + emp);
		emp.isEmpty();
		System.out.println("It is emply : " + emp.isEmpty());

	}

}
