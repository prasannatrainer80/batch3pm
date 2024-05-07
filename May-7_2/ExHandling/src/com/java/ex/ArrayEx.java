package com.java.ex;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = new int[] {43,55};
		try {
			a[10] = 55;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
