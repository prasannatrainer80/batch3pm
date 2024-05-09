package com.java.cs.dao;

import java.sql.SQLException;

import com.java.cs.model.Customer;

public interface ICustomerService {

	String addCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	int authenticateCustomer(String user, String pwd) throws ClassNotFoundException, SQLException;
}
