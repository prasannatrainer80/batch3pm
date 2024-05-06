package com.java.quiz;

public class SbExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to Java...Trainer Prasanna...");
		System.out.println(sb);
		sb.append("\nFrom Hexaware...");
		System.out.println(sb);
		sb.delete(5, 10);
		System.out.println(sb);
		sb.insert(5, "me to");
		System.out.println(sb);
	}
}
