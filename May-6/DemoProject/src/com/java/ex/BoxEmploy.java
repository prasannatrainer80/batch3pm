package com.java.ex;

public class BoxEmploy {

	public void show(Object ob) {
		// int x = (Integer)ob;
		Employ employ = (Employ)ob;
		employ.show();
	}
	
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno = 1;
		employ.name = "Satyam";
		employ.basic = 83234;
		
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
	}
}
