package com.java.day2;

public class LadderExample {

	public void check(int choice) {
		if (choice==1) {
			System.out.println("HI I am Nandini...");
		} else if (choice == 2) {
			System.out.println("Hi I am Gladis...");
		} else if (choice == 3) {
			System.out.println("Hi I am Huda Shaikh");
		} else {
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice = 3;
		LadderExample obj = new LadderExample();
		obj.check(choice);
	}
}
