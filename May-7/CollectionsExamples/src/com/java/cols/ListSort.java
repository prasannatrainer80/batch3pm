package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Balaji");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		names.add("Pratham");
		names.add("Soumya");
		names.add("Shivendra");
		System.out.println("List without Sorting...");
		for (Object ob : names) {
			System.out.println(ob);
		}
		Collections.sort(names);
		System.out.println("List after Sorting...");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
