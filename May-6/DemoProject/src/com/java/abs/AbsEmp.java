package com.java.abs;

public class AbsEmp {
	public static void main(String[] args) {
		Emp[] arr = new Emp[] {
			new Mayuri(1, "Mayuri", 42355),
			new Akanksha(2, "Akanksha", 83234)
		};
		
		for (Emp emp : arr) {
			System.out.println(emp);
		}
	}
}
