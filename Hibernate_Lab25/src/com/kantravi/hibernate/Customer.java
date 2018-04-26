//JAVA BEAN CLASS
package com.kantravi.hibernate;

public class Customer {

	private int cid;	//it is a primary key
	private String cname;	//here DB name and Java name is Same
	private String email;	//here DB name and Java name is Same	also here DB name and Java name is Same
	private long phone;		//here DB name and Java name is Same
	
	private int version;
	
	public Customer() {	}

	public Customer(String cname,String email,long phone){
		this.cname=cname;
		this.email=email;
		this.phone=phone;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}


}



/*Version number will be provided by Hibernate system automatically so do not include
 *version related variable in Constructor
 */