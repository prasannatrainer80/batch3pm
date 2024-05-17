package com.java.junit;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    Employ employ1 = new Employ(1, "Mayuri", Gender.FEMALE, "Java", 
			 "Programmer", 88832.44);
    System.out.println(employ1);
    String result = "Employ [empno=1, name=Mayuri, gender=FEMALE, "
    		+ "dept=Java, desig=Programmer, basic=88832.44]";
  }

}
