package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1, "Parul", 84235));
		employList.add(new Employ(2, "Balaji",94323));
		employList.add(new Employ(3, "Satyam",81245));
		employList.add(new Employ(4, "Mayuri",89245));
		employList.add(new Employ(5, "Sadhana",84234));
		employList.add(new Employ(6, "Anupriya",90434));
		System.out.println("Employ List  ");
		for (Object ob : employList) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
