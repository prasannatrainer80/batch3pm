package com.java.sup;

public class Quiz2 {

	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "Sadhana", 88234);
		Emp emp2 = new Emp(1, "Sadhana", 88234);
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
	}
}
