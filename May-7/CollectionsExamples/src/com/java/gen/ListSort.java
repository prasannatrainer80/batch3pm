package com.java.gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList();
		employList.add(new Employ(1, "Parul", 84235));
		employList.add(new Employ(2, "Balaji",94323));
		employList.add(new Employ(3, "Satyam",81245));
		employList.add(new Employ(4, "Mayuri",89245));
		employList.add(new Employ(5, "Sadhana",84234));
		employList.add(new Employ(6, "Anupriya",90434));
		Collections.sort(employList,new NameComparator());
		System.out.println("Sort By Name  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
		
	}
}
