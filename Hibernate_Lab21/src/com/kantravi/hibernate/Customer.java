package com.kantravi.hibernate;

import java.util.Set;

public class Customer {

	private int cid;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private Set<Request> requests;
	
	public Customer() {}
	
	
	public Customer(int cid, String firstName, String lastName, String email, String phone) {
			super();
			this.cid = cid;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
		}
		public Customer(String firstName, String lastName, String email, String phone) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
		}

		

	public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
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
		public Set<Request> getRequests() {
			return requests;
		}
		public void setRequests(Set<Request> requests) {
			this.requests = requests;
		}
	public String toString() {
	
		return cid+"\t"+firstName+"\t"+lastName+"\t"+email+"\t"+phone;
		
}	
	
}


/*Since One to One mapping so foreign key should be in parent table
 * 
 */ 

