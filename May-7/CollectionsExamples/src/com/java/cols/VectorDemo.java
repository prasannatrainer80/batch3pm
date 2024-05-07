package com.java.cols;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vector = new Vector(3, 2);
		System.out.println("Size  " +vector.size());
		System.out.println("Capacity  " +vector.capacity());
		vector.addElement("Sadhana");
		vector.addElement("Naga Tejaswini");
		System.out.println("Size  " +vector.size());
		System.out.println("Capacity  " +vector.capacity());
		vector.addElement("Satyam");
		vector.addElement("Priyadarshan");
		System.out.println("Size  " +vector.size());
		System.out.println("Capacity  " +vector.capacity());
	}
}
