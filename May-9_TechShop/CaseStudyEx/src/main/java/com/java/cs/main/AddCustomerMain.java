package com.java.cs.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.cs.dao.CustomerService;
import com.java.cs.model.Customer;

public class AddCustomerMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		customer.setCustomerId(sc.nextInt());
		System.out.println("Enter FirstName  ");
		customer.setFirstName(sc.next());
		System.out.println("Enter LastName  ");
		customer.setLastName(sc.next());
		System.out.println("Enter Email  ");
		customer.setEmail(sc.next());
		System.out.println("Enter Phone No  ");
		customer.setPhoneNumber(sc.next());
		System.out.println("Enter Address  ");
		customer.setAddress(sc.next());
		System.out.println("Enter UserName  ");
		customer.setUserName(sc.next());
		customer.setPassWord(sc.next());
		CustomerService service = new CustomerService();
		try {
			System.out.println(service.addCustomer(customer));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
