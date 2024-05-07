package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Comparator c = new CgpComparator();
		SortedSet students = new TreeSet(c);
		students.add(1);
		students.add(new Student(1, "Pramoditha", "Chennai", 9.5));
		students.add(new Student(2, "Mayuri", "Bangalore", 8.9));
		students.add(new Student(3, "Naga Tejaswini", "Hyderabad", 9.1));
		students.add(new Student(4, "Yoga Priya", "Vizag", 8.7));
		students.add(new Student(5, "Anu Priya", "Pune", 8.5));
		for (Object object : students) {
			Student student =(Student)object;
			System.out.println(student);
		}
	}
}
