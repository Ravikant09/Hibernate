//Java Bean Class
package com.kantravi.hibernate;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int sid;	//Primary Key 
	private String sname;
	private String dob;
	private String qualification;
	private String [] courses;
	private List<String> emails;
	private List<Integer> marks;
	private Set<Long> phone;
	private Map<String, Long> refs;


	
	public Student() {}
	public Student(int sid, String sname, String dob, String qualification, String[] courses, List<String> emails,
			List<Integer> marks, Set<Long> phone, Map<String, Long> refs) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phone = phone;
		this.refs = refs;
	}
	public Student(String sname, String dob, String qualification, String[] courses, List<String> emails,
			List<Integer> marks, Set<Long> phone, Map<String, Long> refs) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phone = phone;
		this.refs = refs;
	}
	

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Set<Long> getPhone() {
		return phone;
	}
	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}
	public Map<String, Long> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

}
