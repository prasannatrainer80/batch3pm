package com.java.shop.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.shop.model.OrderDetails;

public interface OrderDetailsDao {
	List<OrderDetails> showCustomerOrderDetails(int custId) throws ClassNotFoundException, SQLException;
	String placeOrder(int custId,int productId, int quantityOrderd) throws ClassNotFoundException, SQLException;
}
