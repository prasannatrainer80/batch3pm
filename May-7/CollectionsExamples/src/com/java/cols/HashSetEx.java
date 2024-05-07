package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set names = new HashSet();
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
