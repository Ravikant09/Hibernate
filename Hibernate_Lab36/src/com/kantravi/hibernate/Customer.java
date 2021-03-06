//JAVA BEAN CLASS
package com.kantravi.hibernate;

public class Customer {

	private int cid;	//it is a primary key
	private String cname;	//here DB name and Java name is Same
	private String email;	//here DB name and Java name is Same	also here DB name and Java name is Same
	private long phone;		//here DB name and Java name is Same
	private String city;	//here DB name and Java name is Different
	private String status;
	
	public Customer() {	}

	public Customer(int cid, String cname, String email, long phone, String city, String status) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.status = status;
	}
	public Customer(String cname, String email, long phone, String city, String status) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.status = status;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", status=" + status + "]";
	}
	
	


	
	



}



//DB variable name and Java variable name can be same or different 
