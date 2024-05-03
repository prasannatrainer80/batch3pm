package com.java.day2;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You can vote...");
		} else {
			System.out.println("You are not elligible for voting...");
		}
	}
	
	public static void main(String[] args) {
		int age = 13;
		Voting obj = new Voting();
		obj.check(age);
	}
}
