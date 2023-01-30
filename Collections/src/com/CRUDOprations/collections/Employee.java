package com.CRUDOprations.collections;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName, employeeEmail;
	private double employeeSalary;
	List<Course> courses;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Employee(int employeeId, String employeeName, String employeeEmail, double employeeSalary,
			List<Course> courses) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
		this.courses = courses;
	}

	public Employee() {

	}

	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeSalary=" + employeeSalary + ", courses=" + courses + "]";
	}

	public void checkCourse(Employee emp) {

		System.out.println(emp.getEmployeeName() + " Courses Are: " + emp.getCourses());

	}

}
