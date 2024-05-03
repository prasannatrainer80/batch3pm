package com.java.day2;

public class Prime {

	public void check(int n) {
		boolean flag = true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Prime No...");
		} else {
			System.out.println("Not Prime No...");
		}
	}
	
	public static void main(String[] args) {
		int n = 12;
		Prime obj = new Prime();
		obj.check(n);
	}
}
