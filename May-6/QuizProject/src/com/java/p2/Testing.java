package com.java.p2;

import com.java.p1.Hello;

public class Testing extends Hello {

	public void show() {
		Testing obj = new Testing();
		System.out.println(obj.protectedString);
		System.out.println(obj.publicString);
	}
}
