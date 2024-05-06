package com.java.sup;

public class FinalEx {

	final String company = "Hexaware";
	
	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
		System.out.println(obj.company);
		obj.company = "Hexaware Limited..";
	}
}
