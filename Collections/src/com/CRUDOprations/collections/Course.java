package com.CRUDOprations.collections;

public class Course {
	int courseId;
	String coursesName;

	public Course(int id, String name) {

		courseId = id;
		coursesName = name;
	}

	public String toString() {
		return "\nCourses [Id: " + courseId + ", Name: " + coursesName + "]";
	}

	public int getcourseId() {
		return courseId;
	}

	public void setcourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCoursesName() {
		return coursesName;
	}

	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}

	
}
