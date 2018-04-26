//JAVA BEAN CLASS
package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import javax.persistence.*;


@NamedQueries({
	@NamedQuery(name="AllCustomers",query="from Customer"),
	@NamedQuery(name="CustomerByEmail",query="from Customer cust where cust.email=?"),
	@NamedQuery(name="CustomerByCity",query="from Customer  WHERE city=?"),
	@NamedQuery(name="CustomerByCityAndStatus",query="from Customer where city=? and status=?")
})






@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;	
	
	@Column(name="name")
	private String cname;	
	
	private String email;
	
	private String city;	
	
	private double cardBal;
	
	@Column(name="cType")
	private String cardType;
	
	private int cardNo;
	
	private String status;
	
	public Customer() {	}

	public Customer(int cid, String cname, String email, String city, double cardBal, String cardType, int cardNo, String status) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.cardBal = cardBal;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.status = status;
	}
	public Customer(String cname, String email, String city, double cardBal, String cardType, int cardNo, String status) {
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.cardBal = cardBal;
		this.cardType = cardType;
		this.cardNo = cardNo;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCardBal() {
		return cardBal;
	}

	public void setCardBal(double cardBal) {
		this.cardBal = cardBal;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", city=" + city + ", cardBal="
				+ cardBal + ", cardType=" + cardType + ", cardNo=" + cardNo + ", status=" + status + "]";
	}

	
	
}



