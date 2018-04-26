//Java Bean Class
package com.kantravi.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="mystudent")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student {
	
	@Id
	@Column(name="sid")				//here Column is optional
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;	//Primary Key 
	
	@Column(name="sname")	
	private String sname;
	
	
	@Column(name="city")	
	private String city;
	
	@Column(name="status")	
	private String status;
	
	@Column(name="totalfee")	
	private double totalfee;
	
	public Student() {}
	public Student(int sid, String sname, String city, String status, double totalfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfee = totalfee;
	}
	public Student(String sname, String city, String status, double totalfee) {
		super();
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfee = totalfee;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}
	
	@Override
	public String toString() {
		return sid+"\t"+sname+"\t"+city+"\t"+status+"\t"+totalfee;
	}
	
}


//With Annotation for table per subclass use InheritanceType as JOINED