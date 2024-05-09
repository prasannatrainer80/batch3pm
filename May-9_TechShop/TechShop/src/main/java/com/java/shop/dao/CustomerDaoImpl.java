package com.java.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.shop.model.Customers;
import com.java.shop.util.DBConnUtil;
import com.java.shop.util.DBPropertyUtil;

public class CustomerDaoImpl implements CustomerDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Customers> showCustomerDao() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Customers";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Customers> customerList = new ArrayList<Customers>();
		Customers customer = null;
		while(rs.next()) {
			customer = new Customers();
			customer.setCustomerId(rs.getInt("CustomerId"));
			customer.setFirstName(rs.getString("FirstName"));
			customer.setLastName(rs.getString("lastName"));
			customer.setEmail(rs.getString("email"));
			customer.setPhone(rs.getString("phone"));
			customer.setAddress(rs.getString("address"));
			customerList.add(customer);
		}
		return customerList;
	}

	@Override
	public Customers searchByCustomerId(int custId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Customers where CustomerId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, custId);
		ResultSet rs = pst.executeQuery();
		Customers customer = null;
		if(rs.next()) {
			customer = new Customers();
			customer.setCustomerId(rs.getInt("CustomerId"));
			customer.setFirstName(rs.getString("FirstName"));
			customer.setLastName(rs.getString("lastName"));
			customer.setEmail(rs.getString("email"));
			customer.setPhone(rs.getString("phone"));
			customer.setAddress(rs.getString("address"));
		}
		return customer;
	}

}
