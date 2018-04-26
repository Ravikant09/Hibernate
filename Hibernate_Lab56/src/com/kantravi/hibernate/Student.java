package com.kantravi.hibernate;

public class Student {
	
	private SID studentId;
	private String sName;
	private String email;
	private Long phone;
	
	public Student() {}

	public Student(SID studentId, String sName, String email, Long phone) {
		this.studentId = studentId;
		this.sName = sName;
		this.email = email;
		this.phone = phone;
	}
//Here SID which is composite primary key must has to supply in constructor as Hibernate cannot generate Composite PK

	public SID getStudentId() {
		return studentId;
	}

	public void setStudentId(SID studentId) {
		this.studentId = studentId;
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", email=" + email + ", phone=" + phone + "]";
	}

	
	
	
}
