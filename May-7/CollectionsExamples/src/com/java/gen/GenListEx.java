package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx {
	public static void main(String[] args) {
		List<String> names = new ArrayList();
		names.add("Balaji");
		names.add("Satyam");
		names.add("Rakesh");
		names.add("Shivendra");
		names.add("Priyadarshan");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
