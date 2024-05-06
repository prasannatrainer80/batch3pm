package com.java.cons;

public class StaticEx {

	static int count;
	
	static {
		count = 0;
	}
	public void increment() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StaticEx obj1 = new StaticEx();
		StaticEx obj2 = new StaticEx();
		StaticEx obj3 = new StaticEx();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
		
	}
}
