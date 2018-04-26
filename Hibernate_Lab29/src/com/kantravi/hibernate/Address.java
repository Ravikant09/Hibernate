package com.kantravi.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	String street;
	String city;
	
	
	public Address() {}


	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	
	
}


/*@Embeddable---->It says include this class at some other persistence class
 *Since Address class is included in some other persistence class so here no 
 *need to write any annotation for mapping
 *Also Address do not have any table  
 */
 
