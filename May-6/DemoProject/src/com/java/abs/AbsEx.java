package com.java.abs;

public class AbsEx {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Sadhana(), new Balaji(), new Vikram()	
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
