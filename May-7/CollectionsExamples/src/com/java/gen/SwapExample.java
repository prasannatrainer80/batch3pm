package com.java.gen;

class Data<T> {
	
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value  " +a+ " B value  " +b);
	}
}
public class SwapExample {
	public static void main(String[] args) {
		Data data = new Data();
		int a = 5, b =7;
		data.swap(a, b);
		String s1="Satyam", s2="Balaji";
		data.swap(s1, s2);
		double d1 = 12.5, d2 = 8.4;
		data.swap(d1, d2);
		boolean b1 = true, b2 = false;
		data.swap(b1, b2);
	}
}
