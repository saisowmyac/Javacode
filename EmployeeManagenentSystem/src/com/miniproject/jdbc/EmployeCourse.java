package com.miniproject.jdbc;

import java.sql.*;

public class EmployeCourse {
	private int id;
	private int employeeId;
	private int course_Id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}

	public int getMaxId() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mini_Task", "root", "root");

		String maxId = "select max(employee_course_id) as max_id from employeecourse";

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(maxId);
		if (rs.next()) {
			id = rs.getInt("max_id");
			System.out.println(id);
		}

		return id;

	}

}
