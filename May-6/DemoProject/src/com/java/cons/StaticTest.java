package com.java.cons;

public class StaticTest {

	static int count;
	
	public void increment() {
		count++;
	}
	
	public void show() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StaticTest obj1 = new StaticTest();
		StaticTest obj2 = new StaticTest();
		
		obj1.increment();
		obj2.increment();
		
		obj1.show();
		obj2.show();
	}
}
