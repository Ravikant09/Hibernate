package com.kantravi.hibernate;

public class SilverCustomer extends Customer{

	
	private String city;
	private int RPoints;
	private String OEmail;

	
	
	public SilverCustomer() {}
	
	
	
	



	
	
	public SilverCustomer(int cid, String cname, String email, long phone, String city, int rPoints, String oEmail) {
		super(cid, cname, email, phone);
		this.city = city;
		RPoints = rPoints;
		OEmail = oEmail;
	}
	public SilverCustomer( String cname, String email, long phone, String city, int rPoints, String oEmail) {
		super( cname, email, phone);
		this.city = city;
		RPoints = rPoints;
		OEmail = oEmail;
	}









	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRPoints() {
		return RPoints;
	}
	public void setRPoints(int rPoints) {
		RPoints = rPoints;
	}
	public String getOEmail() {
		return OEmail;
	}
	public void setOEmail(String oEmail) {
		OEmail = oEmail;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\t"+"SilverCustomer [city=" + city + ", RPoints=" + RPoints + ", OEmail=" + OEmail + "]";
	}
	
	
	
	
	
	
}
