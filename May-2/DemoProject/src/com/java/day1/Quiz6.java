package com.java.day1;

public class Quiz6 {

	public static void main(String[] args) {
		int x = 12;
		int y = ++x + --x + x++ + x-- - --x;
		//A  13 + 12 + 12 + 11 - 9
		//M  13 + 12 + 11 + 10  9
		System.out.println(y);
	}
}
