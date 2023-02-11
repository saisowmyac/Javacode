package com.sql.jdbc;

import java.sql.*;

public class Student {
	private int studentId;
	private String studentName;
	private double studentMarks;

	public Student(int i, String string, double j) {
		// TODO Auto-generated constructor stub
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}

}