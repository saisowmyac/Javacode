package com.CRUDOprations.collections;

import java.util.*;

public class Employer {
	private int employerId;
	private String name, emailId;

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	List<Employee> employee = new ArrayList<>();

	public void addEmployee(Employee emp) {

		employee.add(emp);
		System.out.println(employee.toString());
	}

	public void removeEmployee(Employee emp) {
		employee.remove(emp);

		System.out.println("\nDelete employee: " + employee.toString());
	}

	public void updateEmployee(Employee empDetails, int empId) {

		Employee employees = new Employee(empId, emailId, emailId, empId, null);
		employees.setEmployeeName(empDetails.getEmployeeName());
		employees.setEmployeeId(empId);
		employees.setCourses(empDetails.getCourses());
		employees.setEmployeeEmail(empDetails.getEmployeeEmail());
		employees.setEmployeeSalary(empDetails.getEmployeeSalary());
		employee.add(2, empDetails);
		employee.add(employees);

		System.out.println("\nUpdated employee: " + employee.toString());

	}

	public String assginCources(Employee emp, List<Course> course) {

		emp.setCourses(course);
		return "courses Assigned" + course;
	}

	public void viewEmployees() {
		System.out.println();
		System.out.println("View All Employees");
		for (Employee em : employee) {
			System.out.println(em.toString());

		}

	}

}
