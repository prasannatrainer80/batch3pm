package com.java.day2;

public class CaseExample1 {

	public void show(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Hari...");
			break;
		case 2 : 
			System.out.println("Hi I am Sadhana...");
			break;
		case 3 : 
			System.out.println("Hi I am Akanksha...");
			break;
		case 4 : 
			System.out.println("Hi I am Pramoditha...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int choice = 38;
		CaseExample1 obj = new CaseExample1();
		obj.show(choice);
	}
}
