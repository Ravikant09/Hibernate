package com.kantravi.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="students")

public class Student {
	

	@Id
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="bid",column=@Column(name="bid")),
	@AttributeOverride(name="sid",column=@Column(name="sid"))
	})
	private SID studentId;

	@Column(name="sName")
	private String sName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
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
