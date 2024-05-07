package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEx {

	public void show(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = sdf.parse(date);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd)  ");
		String date = sc.next();
		DateEx obj = new DateEx();
		try {
			obj.show(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
