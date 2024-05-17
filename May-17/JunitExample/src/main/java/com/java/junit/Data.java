package com.java.junit;

public class Data {
	
	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}

	public int minArray(int []a) {
		int min =a[0];
//		for (int i : a) {
//			if (min > i) {
//				min = i;
//			}
//		}
		for(int i=0;i<a.length;i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	public int max3(int a, int b, int c) {
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		return m;
	}
	
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public String sayHello() {
		return "Welcome to Java Programming...";
	}
}
