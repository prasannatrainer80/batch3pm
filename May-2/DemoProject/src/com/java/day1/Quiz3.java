package com.java.day1;

public class Quiz3 {

	public static void main(String[] args) {
		int x = 12;
		int y = x++ + ++x;
		// A   12 + 14
		// M   13   14
		System.out.println(y);
	}
}
