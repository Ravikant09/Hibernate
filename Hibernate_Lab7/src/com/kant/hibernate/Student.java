//Java Bean Class
package com.kant.hibernate;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="students1")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int sid;	//Primary Key 
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="quali")
	private String qualification;

	@ElementCollection
	@CollectionTable(name="courses",joinColumns=@JoinColumn(name="sid"))
	@OrderColumn(name="courseorder")
	@Column(name="cname")
	private String [] courses;

	@ElementCollection
	@CollectionTable(name="emails",joinColumns=@JoinColumn(name="sid"))
	@OrderColumn(name="emailorder")
	@Column(name="emailid")
	private List<String> emails;

	@ElementCollection
	@CollectionTable(name="marks",joinColumns=@JoinColumn(name="sid"))
	@Column(name="marks")
	private List<Integer> marks;
	
	@ElementCollection
	@CollectionTable(name="phone",joinColumns=@JoinColumn(name="sid"))
	@Column(name="phone")		//since phone is of set type and set do not have index so no order column
	private Set<Long> phone;
	
	@ElementCollection
	@CollectionTable(name="refs",joinColumns=@JoinColumn(name="sid"))
	@MapKeyColumn(name="referenceName")
	@Column(name="referencePhone")
	
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

//here with list may or may not have index column(i.e @OrderColunm(name="idx"))

//Here student1 table is created in DB and remaining table will be dropped and 
//create new table as in Hibernate Confguration file is
//<property name="hbm2ddl.auto">create</property>
