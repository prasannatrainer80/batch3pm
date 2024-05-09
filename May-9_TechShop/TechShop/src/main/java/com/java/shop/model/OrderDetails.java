package com.java.shop.model;

public class OrderDetails {

	private int orderDetailsId;
	private int orderId;
	private int productId;
	private int quantity;
	public int getOrderDetailsId() {
		return orderDetailsId;
	}
	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderDetails() {

	}
	public OrderDetails(int orderDetailsId, int orderId, int productId, int quantity) {
		this.orderDetailsId = orderDetailsId;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", orderId=" + orderId + ", productId=" + productId
				+ ", quantity=" + quantity + "]";
	}
	
	
}
