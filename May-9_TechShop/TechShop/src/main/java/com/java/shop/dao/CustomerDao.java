package com.java.shop.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.shop.model.Customers;

public interface CustomerDao {

	List<Customers> showCustomerDao() throws ClassNotFoundException, SQLException;
	Customers searchByCustomerId(int custId) throws ClassNotFoundException, SQLException;
}
