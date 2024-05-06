package com.java.ex;

public class BoxTest {

	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if (type.equals("Integer")) {
			int x = (Integer)ob;
			System.out.println("Integer Casting  " +x);
		}
		if (type.equals("Double")) {
			double x = (Double)ob;
			System.out.println("Double Casting  " +x);
		}
		if (type.equals("String")) {
			String x = (String)ob;
			System.out.println("String Casting  " +x);
		}
	}
	public static void main(String[] args) {
		int x=12;
		double y = 12.5;
		String str = "Hexaware";
		BoxTest obj = new BoxTest();
		obj.show(x);
		obj.show(y);
		obj.show(str);
	}
}
