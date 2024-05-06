package com.java.p1;

public class Demo {

	public void show() {
		Hello hello = new Hello();
		System.out.println(hello.publicString);
		System.out.println(hello.protectedString);
		System.out.println(hello.friendlyString);
	}
}
