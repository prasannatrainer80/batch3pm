package com.java.shop.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.shop.dao.OrderDetailsDao;
import com.java.shop.dao.OrderDetailsDaoImpl;
import com.java.shop.model.OrderDetails;

public class CustomerOrderDetailsShow {

	public static void main(String[] args) {
		int custId;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer Id  ");
		custId = sc.nextInt();
		OrderDetailsDao dao = new OrderDetailsDaoImpl();
		try {
			List<OrderDetails> listOrderDetails = dao.showCustomerOrderDetails(custId);
			for (OrderDetails orderDetails : listOrderDetails) {
				System.out.println(orderDetails);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
