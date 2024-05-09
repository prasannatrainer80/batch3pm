package com.java.shop.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.shop.dao.OrderDetailsDao;
import com.java.shop.dao.OrderDetailsDaoImpl;

public class PlaceOrderMain {

	public static void main(String[] args) {
		int custId, productId, quantityOrd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId = sc.nextInt();
		System.out.println("Enter Product Id  ");
		productId = sc.nextInt();
		System.out.println("Enter Quantity Ordered  ");
		quantityOrd = sc.nextInt();
		OrderDetailsDao dao = new OrderDetailsDaoImpl();
		try {
			System.out.println(dao.placeOrder(custId, productId, quantityOrd));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
