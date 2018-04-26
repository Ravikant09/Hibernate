package com.kantravi.hibernate;

public class WeekdayStudent extends CurrentStudent{

	private String qualification;
	private String percentage;
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
