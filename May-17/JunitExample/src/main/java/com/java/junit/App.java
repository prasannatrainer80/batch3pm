package com.java.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) throws ParseException {
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		System.out.println(emp1.toString());
  }

}
