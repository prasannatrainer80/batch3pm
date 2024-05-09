package com.java.shop.model;

import java.sql.Date;

public class Orders {

	private int orderId;
	private int customerId;
	private Date orderDate;
	private double totalAmount;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, int customerId, Date orderDate, double totalAmount) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
	
}
