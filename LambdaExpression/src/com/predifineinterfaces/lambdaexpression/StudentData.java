
package com.predifineinterfaces.lambdaexpression;

public class StudentData {
	private int studentId, studentMarkes;;
	private String studentName; 
	String grade;
	
	
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
	
	public int getStudentMarkes() {
		return studentMarkes;
	}
	public void setStudentMarkes(int studentMarkes) {
		this.studentMarkes = studentMarkes;
	}
	public StudentData(int id, String name,  int markes) {
		studentId = id;
		studentName = name;
		studentMarkes = markes;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "\nStudentData [Id=" + studentId + ", Name=" + studentName + ", Grade=" + grade
				+ ", Markes=" + studentMarkes + "]";
	}
	
	

}
