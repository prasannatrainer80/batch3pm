package com.java.ex;

public class StudentInfo {

	public static void main(String[] args) {
		Stud s1 = new Stud();
		s1.sid = 1;
		s1.name = "Balaji";
		s1.cgpa = 8.2;
		
		Stud s2 = new Stud();
		s2.sid = 3;
		s2.name = "Vikram";
		s2.cgpa = 9.2;
		
		Stud s3 = new Stud();
		s3.sid = 1;
		s3.name = "Balaji";
		s3.cgpa = 8.2;
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	}
}
