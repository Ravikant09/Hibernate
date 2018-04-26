package com.kantravi.hibernate;

import java.util.Map;

public class GoldCustomer extends Customer {

	private long OPhone;
	private Map<String, String> refs;
	private int point; 
	
	public GoldCustomer() {}

	
	
	public GoldCustomer(int cid, String cname, String email, long phone, long oPhone, Map<String, String> refs,
			int point) {
		super(cid, cname, email, phone);
		OPhone = oPhone;
		this.refs = refs;
		this.point = point;
	}



	public GoldCustomer(String cname, String email, long phone, long oPhone, Map<String, String> refs, int point) {
		super(cname, email, phone);
		OPhone = oPhone;
		this.refs = refs;
		this.point = point;
	}

	public long getOPhone() {
		return OPhone;
	}

	public void setOPhone(long oPhone) {
		OPhone = oPhone;
	}

	public Map<String, String> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+"GoldCustomer [OPhone=" + OPhone + ", refs=" + refs + ", point=" + point + "]";
	}
	
	
}
