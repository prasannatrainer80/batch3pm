package com.java.day2;

public class Fact {

	public void calc(int n) {
		int f =1;
		while(n >= 1) {
			f = f*n;
			n--;
		}
		System.out.println("Factorial Value   " +f);
	}
	
	public static void main(String[] args) {
		int n = 6;
		Fact obj = new Fact();
		obj.calc(n);
	}
}
