package com.java.cols;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Balaji");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		names.add("Pratham");
		names.add("Soumya");
		names.add("Shivendra");
		names.addFirst("Priyadarshan");
		names.addLast("Aasiya");
		System.out.println("Linked List Data  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
