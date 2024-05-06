package com.java.p1;

public class Hello {

	private String privateString = "Hi";
	public String publicString = "Hello";
	protected String protectedString = "Test";
	String friendlyString ="friend";
	
	public void show() {
		System.out.println(privateString);
		System.out.println(publicString);
		System.out.println(protectedString);
		System.out.println(friendlyString);
	}
}
