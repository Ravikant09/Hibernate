package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="myoldStudent")
@PrimaryKeyJoinColumn(name="sid")		//For Foreign Key

public class OldStudent extends Student{

	@Column(name="oCompany")	
	private String oCompany;
	
	@Column(name="oEmail")	
	private String oEmail;
	
	@Column(name="oCTC")	
	private double oCTC;
	
	public OldStudent() {}

	public OldStudent(int sid, String sname, String city, String status, double totalfee, String oCompany,
			String oEmail, double oCTC) {
		super(sid, sname, city, status, totalfee);
		this.oCompany = oCompany;
		this.oEmail = oEmail;
		this.oCTC = oCTC;
	}
	public OldStudent(String sname, String city, String status, double totalfee, String oCompany,
			String oEmail, double oCTC) {
		super( sname, city, status, totalfee);
		this.oCompany = oCompany;
		this.oEmail = oEmail;
		this.oCTC = oCTC;
	}

	public String getoCompany() {
		return oCompany;
	}

	public void setoCompany(String oCompany) {
		this.oCompany = oCompany;
	}

	public String getoEmail() {
		return oEmail;
	}

	public void setoEmail(String oEmail) {
		this.oEmail = oEmail;
	}

	public double getoCTC() {
		return oCTC;
	}

	public void setoCTC(double oCTC) {
		this.oCTC = oCTC;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+oCompany+"\t"+oCTC+"\t"+oEmail;
	}
}
