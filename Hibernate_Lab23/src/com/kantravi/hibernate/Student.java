package com.kantravi.hibernate;

import java.util.Set;

public class Student {

	private int sid;
	private String sName;
	private String email;
	private String phone;
	
	private Set<Course> courses;
	
	public Student() {}

	public Student(int sid, String sName, String email, String phone) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.email = email;
		this.phone = phone;
	}
	
	public Student(String sName, String email, String phone) {
		this.sName = sName;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}	
	


/*Since One to One mapping so foreign key should be in parent table
 * 
 */ 

