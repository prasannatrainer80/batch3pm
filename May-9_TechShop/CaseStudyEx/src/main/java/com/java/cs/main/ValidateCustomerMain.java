package com.java.cs.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.cs.dao.CustomerService;

public class ValidateCustomerMain {

	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password   ");
		pwd = sc.next();
		CustomerService service = new CustomerService();
		try {
			int count = service.authenticateCustomer(user, pwd);
			if (count==1) {
				System.out.println("Correct Credentials...");
			} else {
				System.out.println("Invalid Credentials...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
