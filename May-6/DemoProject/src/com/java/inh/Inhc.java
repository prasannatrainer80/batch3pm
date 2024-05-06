package com.java.inh;

class C1 {
	
	C1() {
		System.out.println("C1 Constructor...");
	}
	
}

class C2 extends C1 {
	
	C2() {
		System.out.println("C2 Constructor...");
	}
	
}

public class Inhc {
	public static void main(String[] args) {
		C2 obj = new C2();
	}
}
