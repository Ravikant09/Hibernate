//JAVA BEAN CLASS
package com.kantravi.hibernate;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;	//it is a primary key
	
	@Column(name="cname")
	private String cname;	//here DB name and Java name is Same
	
	
	@Column(name="email")
	private String email;	//here DB name and Java name is Same	also here DB name and Java name is Same
	
	
	@Column(name="phone")
	private long phone;		//here DB name and Java name is Same
	
	@Version	
	@Temporal(TemporalType.TIMESTAMP)
	private Date tstamp;
	
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


	public Date getTstamp() {
		return tstamp;
	}

	public void setTstamp(Date tstamp) {
		this.tstamp = tstamp;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}


}



/*Version number will be provided by Hibernate system automatically so do not include
 *version related variable in Constructor
 *Date must be from java.util package 
 */