package com.java.shop.main;

import java.sql.SQLException;
import java.util.List;

import com.java.shop.dao.CustomerDao;
import com.java.shop.dao.CustomerDaoImpl;
import com.java.shop.model.Customers;

public class CustomerShowMail {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDaoImpl();
		try {
			List<Customers> customerList = dao.showCustomerDao();
			for (Customers customers : customerList) {
				System.out.println(customers);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
