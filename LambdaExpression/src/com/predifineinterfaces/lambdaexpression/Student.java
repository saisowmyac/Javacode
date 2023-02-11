package com.predifineinterfaces.lambdaexpression;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		StudentData student1 = new StudentData(101, "Sowmya", 400);
		StudentData student2 = new StudentData(102, "Ravi", 550);
		StudentData student3 = new StudentData(103, "Yamuna", 445);
		StudentData student4 = new StudentData(104, "Kaveri", 386);
		StudentData student5 = new StudentData(105, "Krishna", 270);
		StudentData student6 = new StudentData(106, "Ganga", 200);
		StudentData student7 = new StudentData(107, "Nani", 302);
		StudentData student8 = new StudentData(108, "Manju", 420);
		StudentData student9 = new StudentData(109, "Vijay", 220);
		StudentData student10 = new StudentData(110, "Haritha", 210);
		List<StudentData> student = new ArrayList<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		student.add(student6);
		student.add(student7);
		student.add(student8);
		student.add(student9);
		student.add(student10);
		Function<StudentData, String> function = g -> {
			int marks = g.getStudentMarkes();

			if (marks >= 470) {
				return g.grade = "A";
			} else if (marks < 470 && marks >= 380) {
				return g.grade = "B";
			} else if (marks < 380 && marks >= 250) {
				return g.grade = "C";

			} else
				return g.grade = "Fail";

		};
		for (StudentData s1 : student) {
			s1.grade = function.apply(s1);
			System.out.println(s1.getStudentName() + "\t " + s1.getStudentMarkes() + "\t " + s1.grade);

		}

		System.out.println(student.toString());

		Map<String, List<String>> grade = student.stream().collect(Collectors.groupingBy(StudentData::getGrade,
				Collectors.mapping(StudentData::getStudentName, Collectors.toList())));
		System.out.println();
		System.out.println(grade);

	}

}