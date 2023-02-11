package com.miniproject.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.miniproject.response.EmployeeCourse;



public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_task", "root", "root"); // table details
//			
			Statement statement = con.createStatement();
			String create = "Create table EmployeeCourse (Employee_Id int, Course_Id int )";
//			statement.execute(create);
			String unique = "Alter table Employee add unique (Employee_Id)";
//			statement.execute(unique);
			Course course = new Course();
			course.setCourseId(205);
//			course.setCourseName("AI");
			
			String removeTable = "Alter table Course drop column Employee_Id";
			String delete ="delete from employeecourse where Employee_Id=20";
//			statement.execute(delete);
//			statement.execute(removeTable);
			String primaryKey = "Alter table Course Add Primary Key (Course_Id)";
//			statement.execute(primaryKey);
			String foreignKey="Alter table EmployeeCourse Add foreign Key (Course_Id) References Course(Course_Id)";
//			statement.execute(foreignKey);
			String view = "Create view ViewCourse as Select Employee_Id,Course_Name From EmployeeCourse Where Employee_Id=11";
//			statement.execute(view);

			Employee employee=new Employee();
			employee.viewCourses(11);
			employee.setEmpId(29);
			employee.setEmpName("Narasimha");
			employee.setEmpSalary(60000.0);
		
			
			Employer employer = new Employer();
		
//			employer.addEmployee(employee);
//			employer.addCourses(course);
//			employer.assginCourse(11, 203);
//			employer.deleteEmployee(29);
//			employer.updateEmployee(20, "Ramya", 15000);
//			employer.employeeCourse(employee, course);
			
			employer.getInformation();
			System.out.println("It Excuted");
			
			EmployeCourse empCourse=new EmployeCourse();
//			empCourse.getMaxId();
			
	}

}
