package com.java.shop.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.shop.dao.CustomerDao;
import com.java.shop.dao.CustomerDaoImpl;
import com.java.shop.model.Customers;

public class CustomerSearchMain {

	public static void main(String[] args) {
		int custId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId = sc.nextInt();
		CustomerDao dao = new CustomerDaoImpl();
		try {
			Customers customer = dao.searchByCustomerId(custId);
			if (customer !=null) {
				System.out.println(customer);
			} else {
				System.out.println("*** Customer Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
