package com.java.ex;

public class EmpInfo {
	public static void main(String[] args) {
		Emp emp1 = new Emp();
		emp1.empno = 1;
		emp1.name = "Tejaswini";
		emp1.basic = 88324;
		
		Emp emp2 = new Emp();
		emp2.empno = 3;
		emp2.name = "Akanksha";
		emp2.basic = 88224;
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
