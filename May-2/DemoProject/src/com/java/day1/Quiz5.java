package com.java.day1;

public class Quiz5 {

	public static void main(String[] args) {
		int x = 12;
		int y = x++ + ++x + x-- + x++ + --x;
		//A   12	+ 14	+ 14 + 13 + 13
		//M	  13	  14	  13   14	13
		System.out.println(y);
	}
}
