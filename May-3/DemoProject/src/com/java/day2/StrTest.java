package com.java.day2;

public class StrTest {

	public static void main(String[] args) {
		String str = "Welcome to Java Programming...Trainer Prasanna...";
		System.out.println("Length of String   " +str.length());
		System.out.println("First Occurrence of char 'o' is " +str.indexOf("o"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println("Upper Case String  " +str.toUpperCase());
		String s1="Pratham", s2="Anupriya", s3="Sadhana", s4="Pratham";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}
