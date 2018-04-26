package com.kantravi.hibernate;

public class ShippingAddress {
	private int ADDId;
	private String street;
	private String city;
	private String state;
	private Order order;
	
	public ShippingAddress() {}

	public ShippingAddress(int aDDId, String street, String city, String state) {
		super();
		this.ADDId = aDDId;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public ShippingAddress(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getADDId() {
		return ADDId;
	}

	public void setADDId(int aDDId) {
		ADDId = aDDId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ShippingAddress [ADDId=" + ADDId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

	
	
}
