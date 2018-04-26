//JAVA BEAN CLASS
package com.kantravi.hibernate;

public class Customer {

	
	private String cid;	
	
	private String cName;	
	
	private String email;	
	
	private long phone;	
	
	public Customer() {	}

	public Customer(String cid, String cName, String email, long phone) {
		this.cid = cid;
		this.cName = cName;
		this.email = email;
		this.phone = phone;
	}
	public Customer(String cName, String email, long phone) {
		this.cName = cName;
		this.email = email;
		this.phone = phone;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
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

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", email=" + email + ", phone=" + phone + "]";
	}



	
	

	
	
}


