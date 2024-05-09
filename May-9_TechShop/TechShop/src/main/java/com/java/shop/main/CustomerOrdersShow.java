package com.java.shop.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.shop.dao.OrdersDao;
import com.java.shop.dao.OrdersDaoImpl;
import com.java.shop.model.Orders;

public class CustomerOrdersShow {

	public static void main(String[] args) {
		int custId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId = sc.nextInt();
		OrdersDao dao = new OrdersDaoImpl();
		try {
			List<Orders> ordersList = dao.showCustomerOrders(custId);
			for (Orders orders : ordersList) {
				System.out.println(orders);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
