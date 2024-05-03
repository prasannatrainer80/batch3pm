package com.java.day2;

/**
 * Program to Convert Celsius to Fahrenheit
 */

public class CtoF {
	
	public void convert(double c) {
		double f;
		f= ((9*c)/5) + 32;
		System.out.println("Fahrenheit Value  " +f);
	}
	public static void main(String[] args) {
		double c = 37;
		CtoF obj = new CtoF();
		obj.convert(c);
	}
}
