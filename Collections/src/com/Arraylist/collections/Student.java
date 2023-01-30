package com.Arraylist.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	// with out array list
	private String name, address;
	private int id;
	private double points;

	public Student(String name, int id, String string, double points, String address) {
		super();
		this.name = name;
		this.id = id;
		this.points = points;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

		Student student1 = new Student("Sowmya", 1, "28/02/2000", 7.0, "ongole");
		student1.setName("anu");
		System.out.println(student1.getName());
		student1.setId(5);
		System.out.println(student1.getId());

		Student student2 = new Student("Sai", 2, "08/05/1999", 7.5, "Nellore");
		Student student3 = new Student("Soni", 3, "02/06/2000", 8.0, "Guntur");
		Student student4 = new Student("Sanny", 4, "18/12/1999", 6.0, "Chirala");
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.set(1, student4);
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(student3);
		studentList1.add(student4);
		studentList1.add(new Student("Chintu", 6, "09/08/1999", 8.3, "Hyb"));// boxing

		studentList.addAll(studentList1);

		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		for (Student sl : studentList) {
			System.out.println("Student Name: " + sl.getName() + "\tSId: " + sl.getId() + "\tSPoints: " + sl.getPoints()
					+ "\tSAddress: " + sl.getAddress());
		}
		System.out.println("size: " + studentList.size());
		System.out.println("index: " + studentList.indexOf(student4));
		System.out.println(studentList.lastIndexOf(student3));
	}

}
