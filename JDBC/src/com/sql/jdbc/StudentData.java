package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentData {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmya", "root", "root");  // table details
		Statement statement = con.createStatement();
		
		  //Create Connection
		 
 		String use = "Use sowmya";
		 // Create Statement

 		String create = "Create Table Student  (Student_Id int , Student_Name varchar(20), Student_Marks double)";   //create
																													  //table
 		String drop = "Drop table Student";

// 		statement.execute(drop);
// 		statement.execute(create);
 		String insert = "Insert into Student Values(104,'sony',330)"; //  insert values
// 		statement.execute(insert);
 		String unique = "Alter Table Student add Unique (Student_Id)"; //  id is unique
 		statement.execute(unique);
 		System.out.println("Execute");

		Student student = new Student();
		Student student1 = new Student();
		student1.setStudentId(106);
		student1.setStudentName("Krishna");
		student1.setStudentMarks(420);

		student.setStudentId(108);
		student.setStudentName("vidya");
		student.setStudentMarks(467.7);
		String insert1 = "Insert into Student Values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(insert1);
//		ps.setInt(1, student.getStudentId());
//		ps.setString(2, student.getStudentName());
//		ps.setDouble(3, student.getStudentMarks());
//		ps.setInt(1, student.getStudentId());
//		ps.setString(2, student.getStudentName());
//		ps.setDouble(3, student.getStudentMarks());
		ps.executeUpdate();
		System.out.println("Its Executed");
		String table = "Select Student_Id,Student_name from Student  ";
		ResultSet rs = statement.executeQuery(table);
		while(rs.next()) {
			int id = rs.getInt("Student_Id");
			String name = rs.getString("Student_Name");
			System.out.println(id + "  \t" + name);
		}
		con.close();
	}

}
