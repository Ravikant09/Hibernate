//JAVA BEAN CLASS
package com.kantravi.hibernate;

public class Customer {

	private int cid;	//it is a primary key
	private String cname;	//here DB name and Java name is Same
	private String email;	//here DB name and Java name is Same	also here DB name and Java name is Same
	private long phone;		//here DB name and Java name is Same
	private String mycity;	//here DB name and Java name is Different
	private double mybal;
	
	public Customer() {	}

	public Customer(String cname,String email,long phone,String mycity,double mybal){
		this.cname=cname;
		this.email=email;
		this.phone=phone;
		this.mycity=mycity;
		this.mybal=mybal;
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

	public String getMycity() {
		return mycity;
	}

	public void setMycity(String mycity) {
		this.mycity = mycity;
	}

	public double getMybal() {
		return mybal;
	}

	public void setMybal(double mybal) {
		this.mybal = mybal;
	}
}



//DB variable name and Java variable name can be same or different 
