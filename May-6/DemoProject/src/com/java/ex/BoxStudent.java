package com.java.ex;

public class BoxStudent {

	public void show(Object ob) {
		// int x = (Integer)ob;
		   Student student = (Student)ob;
		   student.showStudentInfo();
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.sid = 1;
		student.name = "Mayuri";
		student.cgpa = 9.2;
		
		BoxStudent boxStudent = new BoxStudent();
		boxStudent.show(student);
	}
}
