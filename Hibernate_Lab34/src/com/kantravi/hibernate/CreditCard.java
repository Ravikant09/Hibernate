package com.kantravi.hibernate;

import java.util.Date;

public class CreditCard {

	private int CCId;
	private int CCNo;
	private String CCType;
	private int code;
	private Date expiaryDate;

	private Customer customer;

	public CreditCard() {}
	
	



	public CreditCard(int cCId, int cCNo, String cCType, int code, Date expiaryDate) {
		super();
		CCId = cCId;
		CCNo = cCNo;
		CCType = cCType;
		this.code = code;
		this.expiaryDate = expiaryDate;
	}
	public CreditCard( int cCNo, String cCType, int code, Date expiaryDate) {
		super();
		CCNo = cCNo;
		CCType = cCType;
		this.code = code;
		this.expiaryDate = expiaryDate;
	}











	public int getCCId() {
		return CCId;
	}
	public void setCCId(int cCId) {
		CCId = cCId;
	}
	public int getCCNo() {
		return CCNo;
	}
	public void setCCNo(int cCNo) {
		CCNo = cCNo;
	}
	public String getCCType() {
		return CCType;
	}
	public void setCCType(String cCType) {
		CCType = cCType;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getExpiaryDate() {
		return expiaryDate;
	}
	public void setExpiaryDate(Date expiaryDate) {
		this.expiaryDate = expiaryDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "CreditCard [CCId=" + CCId + ", CCNo=" + CCNo + ", CCType=" + CCType + ", code=" + code
				+ ", expiaryDate=" + expiaryDate + "]";
	}
	
	
	
	
	
	
}
