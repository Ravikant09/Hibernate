//JAVA BEAN CLASS
package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//To say it is an persistence class we use @Entity

@Entity
@Table(name="customers")
public class Customer {

//To say this is primary key use @Id
	
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
	
	@Column(name="city")
	private String mycity;	//here DB name and Java name is Different

	@Column(name="bal")
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
/*In @GeneratedValue(strategy=GenerationType.AUTO)
 * GenerationType is an ENUM and with AUTO Hibernate will not try to generate 
 * primary key it will try to use DB related primary key generation algorithm
 * say if connection with Oracle than Sequence will generate primary key 
 * and for mysql auto_increment will generate primary key 
 *    
 *   
 */
 