package com.java.cs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.cs.model.Customer;
import com.java.cs.util.DBConnUtil;
import com.java.cs.util.DBPropertyUtil;

public class CustomerService implements ICustomerService {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public String addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String pwd = EncryptPassword.getCode(customer.getPassWord());
		customer.setPassWord(pwd);
		String cmd = "Insert into Customer(CustomerId, FirstName, LastName, "
				+ "Email, PhoneNumber,Address, UserName, Password) "
				+ " values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, customer.getCustomerId());
		pst.setString(2, customer.getFirstName());
		pst.setString(3, customer.getLastName());
		pst.setString(4, customer.getEmail());
		pst.setString(5, customer.getPhoneNumber());
		pst.setString(6, customer.getAddress());
		pst.setString(7, customer.getUserName());
		pst.setString(8, customer.getPassWord());
		pst.executeUpdate();
		SendMail.mailSend("balajisenthil691@gmail.com", "My First Java Mail", "Hexaware Trainng");
		return "Customer Record Inserted...";
	}

	@Override
	public int authenticateCustomer(String user, String pwd) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String encr = EncryptPassword.getCode(pwd);
		String cmd = "select count(*) cnt from Customer where UserName = ? "
				+ " AND Password = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, encr);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		return cnt;
	}

}
