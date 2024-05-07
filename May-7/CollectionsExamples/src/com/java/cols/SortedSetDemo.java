package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		names.add("Balaji");
		names.add("Hari");
		names.add("Pratham");
		names.add("Soumya");
		names.add("Shivendra");
		System.out.println("Sorted Names  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
