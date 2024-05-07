package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHsetDemo {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Balaji");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		names.add("Balaji");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("Balaji");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		System.out.println("HashSet Data ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
