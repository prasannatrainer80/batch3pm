package com.java.lms;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
		LeaveDetails leavDetails = new LeaveDetails(1, 1000, sdf.parse("2024-10-10"), 
				sdf.parse("2024-10-12"), "Sick", "EL", "PENDING", "Enjoy");
		System.out.println(leavDetails);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  }

}
