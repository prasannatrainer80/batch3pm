package com.java.cons;

public class ConEmploy {

	public static void main(String[] args) {
		Employ employ1 = new Employ(1, "Pratham", 88234);
		Employ employ2 = new Employ(3, "Satyam", 88231);
		System.out.println(employ1);
		System.out.println(employ2);
		
		Employ employ3 = new Employ();
		employ3.empno = 4;
		employ3.name = "Parul";
		employ3.basic = 88323;
		System.out.println(employ3);
				
	}
}
