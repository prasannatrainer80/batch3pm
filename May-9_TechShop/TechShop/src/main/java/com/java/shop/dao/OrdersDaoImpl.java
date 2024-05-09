package com.java.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.shop.model.Customers;
import com.java.shop.model.Orders;
import com.java.shop.util.DBConnUtil;
import com.java.shop.util.DBPropertyUtil;

public class OrdersDaoImpl implements OrdersDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Orders> showCustomerOrders(int custId) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Orders where CustomerId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, custId);
		ResultSet rs = pst.executeQuery();
		List<Orders> ordersList = new ArrayList<Orders>();
		Orders order = null;
		while(rs.next()) {
			order = new Orders();
			order.setCustomerId(rs.getInt("CustomerId"));
			order.setOrderId(rs.getInt("OrderId"));
			order.setOrderDate(rs.getDate("OrderDate"));
			order.setTotalAmount(rs.getDouble("totalAmount"));
			ordersList.add(order);
		}
		return ordersList;
	}

}
