package com.java.p1;

public class Data extends Hello {

	public void show() {
		Data data = new Data();
		System.out.println(data.publicString);
		System.out.println(data.friendlyString);
		System.out.println(data.protectedString);
	}
}
