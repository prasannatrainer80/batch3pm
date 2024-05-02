package com.java.day1;

public class Quiz4 {

	public static void main(String[] args) {
		int x = 12;
		int y = x++ + x++ + ++x + x++;
		//A  12 + 13 + 15 + 15
		//M  13   14   15   16
		System.out.println(y);
	}
}
