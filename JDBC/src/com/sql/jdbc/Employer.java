package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmya", "root", "root"); // table details
		
		String insert = "insert into employee values(?,?,?)";

		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1, emp.getEmployeeId());
		ps.setString(2, emp.getEmployeeName());
		ps.setDouble(3, emp.getEmployeeSalary());
		ps.execute();
		
	}
	public void deleteEmployee(Employee emp) throws SQLException {

		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmya", "root", "root"); // table details
		String delete = "Delete from Employee where employeeid=?";
		PreparedStatement ps = con.prepareStatement(delete);
		ps.setInt(1, emp.getEmployeeId());
		ps.execute();
		
	}
	public void updateEmployee(Employee emp) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmya", "root", "root"); // table details
		String update="update Employee set EmployeeName=?,EmployeeSalary=? where EmployeeId=?";
		PreparedStatement ps = con.prepareStatement(update);
		ps.setString(1, emp.getEmployeeName());
		ps.setDouble(2, emp.getEmployeeSalary());
		ps.setInt(3, emp.getEmployeeId());
		ps.execute();
		
	}
	public void getInformation(Employee emp) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmya", "root", "root"); // table
		Statement statement = con.createStatement();
		
		String table = "Select EmployeeId , EmployeeName , EmployeeSalary from Employee"; 
		statement.execute(table);
		ResultSet rs =statement.executeQuery(table);
		while (rs.next()) {
			int id= rs.getInt("EmployeeId");
			String name = rs.getString("EmployeeName");
			double salary = rs.getDouble("EmployeeSalary");
			System.out.println(id + "\t" + name + " \t" + salary);
			
		}																									// detail

	}
	
}
