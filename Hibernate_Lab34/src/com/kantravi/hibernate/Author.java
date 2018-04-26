package com.kantravi.hibernate;

import java.util.*;

public class Author {

	private int aid;
	private String aname;
	private String email;
	private long phone;
	
	private List<String> qualification;
	
	private Set<String> experiences;
	
	private Set<Book> books;
	
	public Author() {}

	public Author(int aid, String aname, String email, long phone, List<String> qualification,
			Set<String> experiences) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.email = email;
		this.phone = phone;
		this.qualification = qualification;
		this.experiences = experiences;
	}
	public Author(String aname, String email, long phone, List<String> qualification,
			Set<String> experiences) {
		super();
		this.aname = aname;
		this.email = email;
		this.phone = phone;
		this.qualification = qualification;
		this.experiences = experiences;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getQualification() {
		return qualification;
	}

	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}

	public Set<String> getExperiences() {
		return experiences;
	}

	public void setExperiences(Set<String> experiences) {
		this.experiences = experiences;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", email=" + email + ", phone=" + phone + ", qualification="
				+ qualification + ", experiences=" + experiences + "]";
	}
	

	
}
