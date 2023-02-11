package com.miniproject.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.miniproject.response.EmployeeCourse;

public class Employer {
	private int employerId;
	private String employerName;

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public void addEmployee(Employee emp) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_Task", "root", "root"); 
																												

		String insert = "insert into employee values(?,?,?)";

		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1, emp.getEmpId());
		ps.setString(2, emp.getEmpName());
		ps.setDouble(3, emp.getEmpSalary());
		ps.execute();
		con.close();

	}

	public void assginCourse(int employeeId,int courseId) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_Task", "root", "root"); 
		EmployeCourse empCourse=new EmployeCourse();
		String insert = "insert into EmployeeCourse values(?,?,?)";

		PreparedStatement ps = con.prepareStatement(insert);
		int eId=empCourse.getMaxId()+1;
		ps.setInt(1, eId);
		ps.setInt(2, employeeId);
		ps.setInt(3, courseId);
		System.out.println(ps.getMaxRows());
		ps.execute();
		con.close();
	}
	
	

	public void deleteEmployee(int employeeId) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_Task", "root", "root");
		String delete = "Delete from Employee where Employee_Id=?";
		PreparedStatement ps = con.prepareStatement(delete);
		ps.setInt(1, employeeId);
		ps.execute();
		con.close();

	}

	public void updateEmployee(int employeeId, String name, double salary) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_Task", "root", "root");

		String update = "update Employee set Employee_Name=?,Employee_Salary=? where Employee_Id=?";
		PreparedStatement ps = con.prepareStatement(update);
		ps.setString(1, name);
		ps.setDouble(2, salary);
		ps.setInt(3, employeeId);
		ps.execute();
		con.close();

	}

	public void getInformation() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_task", "root", "root");
		Statement statement = con.createStatement();

		String table = "Select * from Employee";
		statement.execute(table);
		ResultSet rs = statement.executeQuery(table);
		List<Employee> employee = new ArrayList();

		while (rs.next()) {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt("Employee_Id"));//emp.setEmpId(76);
			emp.setEmpName(rs.getString("Employee_name"));
			emp.setEmpSalary(rs.getDouble("employee_salary"));
			employee.add(emp);
			System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + " \t" + emp.getEmpSalary());

			if (emp.getEmpSalary() >= 13000) {

				System.out.println(emp.getEmpName() + "\t" + emp.getEmpSalary());

			}
			employee.stream().filter(e -> e.getEmpSalary() >= 18000).forEach(e -> System.out.println(e));

		}
	}
}
