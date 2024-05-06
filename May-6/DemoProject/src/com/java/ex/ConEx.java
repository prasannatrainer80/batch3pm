package com.java.ex;

public class ConEx {

	static {
		System.out.println("Static Constructor...");
	}
	
	static {
		System.out.println("Hexaware");
	}
	
	static {
		System.out.println("Online Class...");
	}
	
	ConEx() {
		System.out.println("Instance Constructor...");
	}
	
	public static void main(String[] args) {
		ConEx obj = new ConEx();
	}
}
