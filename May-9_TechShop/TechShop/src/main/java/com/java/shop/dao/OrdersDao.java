package com.java.shop.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.shop.model.Orders;

public interface OrdersDao {

	List<Orders> showCustomerOrders(int custId) throws ClassNotFoundException, SQLException;
}
