//JAVA BEAN CLASS
package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Daocustomers")

public class Customer {

	@Column(name="cid")
	@Id
	private int cid;	//it is a primary key
	private String cname;	//here DB name and Java name is Same

	@Column(name="email")
	private String email;	//here DB name and Java name is Same	also here DB name and Java name is Same
	
	private long phone;		//here DB name and Java name is Same

	@Column(name="city")
	private String city;	//here DB name and Java name is Different
	
	@Column(name="status")
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



/*Here CustomerTO is not a persistance class and not participating in Hibernate
 *operation so For CustomerTO we have to pass value for Primary Key(here cid) we 
 *we cannot make like Hibernate to Generate cid 
 *so @GeneratedValue(stratergy=GenerationType.AUTO) i.e automatically creation of 
 *P.K by Hibernate is ignored  
 */
 
