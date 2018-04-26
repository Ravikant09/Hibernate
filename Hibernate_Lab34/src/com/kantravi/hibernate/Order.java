package com.kantravi.hibernate;

import java.util.Date;
import java.util.Set;

public class Order {
	
	private int orderId;
	private int totalQantity;
	private Double totalCost;
	private Date orderDate;
	private String status;
	
	private Customer customer;
	
	private ShippingAddress address;
	
	private Set<OrderItem> orderItems;
	
	public Order() {}

	public Order(int orderId, int totalQantity, Double totalCost, Date orderDate, String status) {
		super();
		this.orderId = orderId;
		this.totalQantity = totalQantity;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
	}
	public Order( int totalQantity, Double totalCost, Date orderDate, String status) {
		super();
		this.totalQantity = totalQantity;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalQantity() {
		return totalQantity;
	}

	public void setTotalQantity(int totalQantity) {
		this.totalQantity = totalQantity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getAddress() {
		return address;
	}

	public void setAddress(ShippingAddress address) {
		this.address = address;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalQantity=" + totalQantity + ", totalCost=" + totalCost
				+ ", orderDate=" + orderDate + ", status=" + status + "]";
	}
	
	

	
}
