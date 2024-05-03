package com.java.day2;

public class ArrayEx {

	public void show() {
		int[] a = new int[] {4,22,55,12,6};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ArrayEx obj = new ArrayEx();
		obj.show();
	}
}
