package org.student;

import org.department.Department;

public class student extends Department  {
	
	public void studentName() {
		
		System.out.println("RAMKUMAR");
	}
	
	public void studentDept() {
		
		System.out.println("IT");
		
	}
	
	public void studentId() {
	
		System.out.println("12345");
	}
	
	public static void main(String[] args) {
		
		student obj=new student();
		
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
	}

}
