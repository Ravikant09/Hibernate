package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="myweekendStudent")
@PrimaryKeyJoinColumn(name="sid")		//For Foreign Key

public class WeekendStudent extends CurrentStudent{

	@Column(name="wCompany")
	private String wCompany;

	@Column(name="wEmail")
	private String wEmail;

	@Column(name="wCTC")
	private double wCTC;
	
	
	public WeekendStudent() {}
	

	public WeekendStudent(int sid, String sname, String city, String status, double totalfee, double feebal,
			String timing, String branch, String wCompany, String wEmail, double wCTC) {
		super(sid, sname, city, status, totalfee, feebal, timing, branch);
		this.wCompany = wCompany;
		this.wEmail = wEmail;
		this.wCTC = wCTC;
	}
	
	

	public WeekendStudent( String sname, String city, String status, double totalfee, double feebal,
			String timing, String branch, String wCompany, String wEmail, double wCTC) {
		super( sname, city, status, totalfee, feebal, timing, branch);
		this.wCompany = wCompany;
		this.wEmail = wEmail;
		this.wCTC = wCTC;
	}

	public String getwCompany() {
		return wCompany;
	}
	public void setwCompany(String wCompany) {
		this.wCompany = wCompany;
	}
	public String getwEmail() {
		return wEmail;
	}
	public void setwEmail(String wEmail) {
		this.wEmail = wEmail;
	}
	public double getwCTC() {
		return wCTC;
	}
	public void setwCTC(double wCTC) {
		this.wCTC = wCTC;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\t"+wCompany+"\t"+wCTC+"\t"+wEmail;
	}
}
