package com.java.intf;

public class MultiInh implements IOne, ITwo {
	public static void main(String[] args) {
		MultiInh obj = new MultiInh();
		obj.name();
		obj.email();
	}

	@Override
	public void email() {
		System.out.println("Email is prasanna@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Prasanna...");
	}
}
