package com.kantravi.hibernate;

/**
 * @author Sunny
 *
 */
public class OrderItem {

	private int OId;
	private int quantity;
	private double cost;
	
	private Order order;
	
	private Book book;
	
	public OrderItem() {}

	public OrderItem(int oId, int quantity, double cost) {
		super();
		this.OId = oId;
		this.quantity = quantity;
		this.cost = cost;
	}
	public OrderItem( int quantity, double cost) {
		super();
		this.quantity = quantity;
		this.cost = cost;
	}

	public int getOId() {
		return OId;
	}

	public void setOId(int oId) {
		OId = oId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "OrderItem [OId=" + OId + ", quantity=" + quantity + ", cost=" + cost + "]";
	}
	
	
	
	
}
