package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="myweekdayStudent")
@PrimaryKeyJoinColumn(name="sid")		//For Foreign Key

public class WeekdayStudent extends CurrentStudent{

	@Column(name="qualification")
	private String qualification;
	
	
	@Column(name="percentage")
	private String percentage;
	
	@Column(name="yop")
	private int yop;
	
	public WeekdayStudent() {}

	public WeekdayStudent(int sid, String sname, String city, String status, double totalfee, double feebal,
			String timing, String branch, String qualification, String percentage, int yop) {
		super(sid, sname, city, status, totalfee, feebal, timing, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}	
	
	public WeekdayStudent(String sname, String city, String status, double totalfee, double feebal,
			String timing, String branch, String qualification, String percentage, int yop) {
		super(sname, city, status, totalfee, feebal, timing, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}	

	@Override
	public String toString() {
		return super.toString()+"\t"+percentage+"\t"+qualification+"\t"+yop;
		
	}
	
	
}
