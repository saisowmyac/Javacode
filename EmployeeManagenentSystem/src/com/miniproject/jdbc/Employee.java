package com.miniproject.jdbc;

import java.sql.*;

import com.miniproject.response.EmployeeCourse;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void viewCourses(int employeeId) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_task", "root", "root");

		String view = "Select e.employee_name,c.Course_name From EmployeeCourse ec, Course c, Employee e "
				+ "where ec.Employee_id=e.Employee_id and ec.Course_id=c.Course_id and e.Employee_id='" + employeeId
				+ "'";

		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery(view);
		while (rs.next()) {
			EmployeeCourse ec = new EmployeeCourse();
			ec.setEmployeeName(rs.getString("Employee_Name"));
			ec.setCourse_Name(rs.getString("Course_Name"));
//			String courseName = rs.getString("course_name");
			System.out.println(ec.getEmployeeName() + " \t " + ec.getCourse_Name());
		}
		con.close();

	}
}
