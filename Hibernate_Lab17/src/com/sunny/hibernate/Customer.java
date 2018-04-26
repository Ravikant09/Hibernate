//One-to-One Mapping
package com.sunny.hibernate;

import javax.persistence.*;

@Entity
@Table(name="newcustomer")
public class Customer {

	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cid;
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="email")
	String email;
	
	@Column(name="phone")
	String phone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="aid")
	Address address;
	
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
		super();
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
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
	
		return cid+"\t"+firstName+"\t"+lastName+"\t"+phone;
}	
	
}


/*Since One to One mapping so foreign key should be in parent table
 * 
 */ 

