package com.oops.inheritence;

public class Inheritence {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(99);
		employee.employee();
		employee.setName("Sowmya");
		employee.setSalary(10000.00);
		System.out.println("employee id:"+employee.getId());
		System.out.println("Employee name:"+employee.getName());
		System.out.println("Employee Salary:"+employee.getSalary());
		System.out.println("---------------------------------------------------------");
		Developer developer=new Developer();
		developer.setId(28);
		developer.developer();
		developer.setName("Pavan");
		developer.setSalary(50000.00);
		System.out.println("Developer id:"+developer.getId());
		System.out.println("Developer Name:"+developer.getName());
		System.out.println("Developer Salary:"+developer.getSalary());
		System.out.println("---------------------------------------------------------");
		TeamLeader teamLeader=new TeamLeader();
		teamLeader.setId(32);
		teamLeader.teamleader();
		teamLeader.setName("Chiranjeevi");
		developer.setSalary(50000.00);
		System.out.println("employee id:"+teamLeader.getId());
		System.out.println("Employee name:"+teamLeader.getName());
		System.out.println("Employee Salary:"+teamLeader.getSalary());

	}

}
