package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCases {
	
	public static void main(String[]args) throws SQLException {
		
		
		Employee employee=new Employee();
		employee.setEmployeeId(27);
		employee.setEmployeeName("Amit");
		employee.setEmployeeSalary(12000.0);
		
		Employer employer=new Employer();
//		employer.addEmployee(employee);
//		employer.deleteEmployee(employee);
//		employer.updateEmployee(employee);
		employer.getInformation(employee);
		
	}

}
