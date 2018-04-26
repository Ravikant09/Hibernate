//One-to-One Mapping
package com.kantravi.hibernate;

import javax.persistence.*;

@Entity(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int sid;
	
	@Column(name="Name")
	String name;
	
	@Embedded
	@AttributeOverrides(value={
			@AttributeOverride(name="street",column=@Column(name="street")),
			@AttributeOverride(name="city",column=@Column(name="mycity")),
			})
	Address address;
	
	public Customer() {}

	public Customer(int sid, String name, Address address) {
		this.sid = sid;
		this.name = name;
		this.address = address;
	}

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}
	
	

		
	
}


/*Since One to One mapping so foreign key should be in parent table
 * 
 */ 

