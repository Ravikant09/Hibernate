//Java Bean Class
package com.kantravi.hibernate;

import java.util.List;
import java.util.Set;

public class Student {
	private int sid;	//Primary Key 
	private String sname;
	private String dob;
	private String [] milk;
	private List<String> bisc;
	private Set<String> games;


	
	public Student() {}



	public Student(int sid, String sname, String dob, String[] milk, List<String> bisc, Set<String> games) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dob = dob;
		this.milk = milk;
		this.bisc = bisc;
		this.games = games;
	}
	public Student( String sname, String dob, String[] milk, List<String> bisc, Set<String> games) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.milk = milk;
		this.bisc = bisc;
		this.games = games;
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



	public String[] getMilk() {
		return milk;
	}



	public void setMilk(String[] milk) {
		this.milk = milk;
	}



	public List<String> getBisc() {
		return bisc;
	}



	public void setBisc(List<String> bisc) {
		this.bisc = bisc;
	}



	public Set<String> getGames() {
		return games;
	}



	public void setGames(Set<String> games) {
		this.games = games;
	}

}
