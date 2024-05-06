package com.java.sup;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumEx1 {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.MONDAY;
		System.out.println(wd);
	}
}
