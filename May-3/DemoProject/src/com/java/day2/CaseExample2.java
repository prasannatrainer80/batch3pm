package com.java.day2;

public class CaseExample2 {

	public void show(char choice) {
		switch(choice) {
		case 'I' : 
		case 'i' :
		case '1' :
		case 'a' : 
		case 'A' : System.out.println("Grade A...");
				   break;
		case '2' : 
		case 'b' : 
		case 'B' : System.out.println("Grade A...");
				   break;
		case '3' :
		case 'c' : 
		case 'C' : System.out.println("Grade C...");
				   break;
		default : 
				System.out.println("Invalid Choice...");
				break;
		}
	}
	public static void main(String[] args) {
		char choice = 'I';
		CaseExample2 obj = new CaseExample2();
		obj.show(choice);
	}
}
