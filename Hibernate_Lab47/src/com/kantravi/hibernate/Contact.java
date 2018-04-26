package com.kantravi.hibernate;

public class Contact {
	
	private int contactId;
	private String firstName;
	private String lastName;
	private long phone;
	private String dob;
	private String status;
	
	public Contact() {}

	public Contact(int contactId, String firstName, String lastName, long phone, String dob, String status) {
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.dob = dob;
		this.status = status;
	}
	
	public Contact(String firstName, String lastName, long phone, String dob, String status) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.dob = dob;
		this.status = status;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", dob=" + dob + ", status=" + status + "]";
	}
	
	

}
