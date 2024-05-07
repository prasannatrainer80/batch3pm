package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Balaji");
		names.add("Hari");
		names.add("Satyam");
		names.add("Anupriya");
		names.add("YogaPriya");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(2, "Sadhana");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(3, "Patil");
		System.out.println("Names after Update Operation  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Anupriya");
		System.out.println("Names after Remove Operation  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
