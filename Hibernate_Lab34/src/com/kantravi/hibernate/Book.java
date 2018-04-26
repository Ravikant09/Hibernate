package com.kantravi.hibernate;

import java.util.Set;

public class Book {
	private int bid;
	private String bname;
	private double cost;
	private int edition;
	private String publication;
	
	private Set<Author> authors;
	
	public Book() {}

	public Book(int bid, String bname, double cost, int edition, String publication) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.cost = cost;
		this.edition = edition;
		this.publication = publication;
	}
	public Book( String bname, double cost, int edition, String publication) {
		super();
		this.bname = bname;
		this.cost = cost;
		this.edition = edition;
		this.publication = publication;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", cost=" + cost + ", edition=" + edition + ", publication="
				+ publication + "]";
	}

	
	
		
	
	
	
}
