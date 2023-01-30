package com.CRUDOprations.collections;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		Course courses1 = new Course(1001, "Java");
		Course courses2 = new Course(1101, "Angulr");
		Course courses3 = new Course(1011, "Python");
		Course courses4 = new Course(1111, "Seleniun Java");

		List<Course> courses = new ArrayList<>();
		courses.add(courses1);
		courses.add(courses2);
		courses.add(courses3);
		courses.add(courses4);

		Employer employer = new Employer();
		employer.setEmployerId(5981);
		employer.setName("Kumar");
		employer.setEmailId("kumar11@gamil.com");
		System.out.println("Employer [ Id: " + employer.getEmployerId() + "\tName: " + employer.getName()
				+ "\tEmailId: " + employer.getEmailId() + " ]");

		Employee employee = new Employee();
		Employee soni = new Employee(2201, "Soni", "soni01@gmail.com", 13000, List.of(courses2, courses3));
		Employee amit = new Employee(2202, "Amit", "amit03@gmail.com", 12000, null);
		Employee sumanth = new Employee(2203, "Sumanth", "sumanth@gmail.com", 15000, courses);

		employer.addEmployee(soni);
		employer.addEmployee(amit);
		employer.addEmployee(sumanth);

		employer.removeEmployee(sumanth);
		Employee rani = new Employee(2204, "Rani", "rani@gmail.com", 13000, null);

		System.out.println(employer.employee.get(1));

		employer.assginCources(rani, List.of(courses1, courses4));
		System.out.println(rani.toString());

		Employee kiran = new Employee(2204, "kiran", "kiran@gmail.com", 15000, null);

		employer.updateEmployee(kiran, 2204);
		employer.assginCources(amit, List.of(courses2));
		employee.checkCourse(courses, amit);

		employer.viewEmployees();

	}

}
