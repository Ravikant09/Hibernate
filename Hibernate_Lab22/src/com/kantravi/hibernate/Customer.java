//One-to-Many Mapping
//Persistence Class
package com.kantravi.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="newCustomers")
public class Customer {


	@Id
	@Column(name="Cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;

	
	@Column(name="firstName")
	private String firstName;
//it is not necessary that table column name in DB and my Java Persistence class should have same name 
	
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="AppropiateEmail")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@OneToMany(mappedBy="customer")	//special variable and no column related to this
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


/*Since One to Many mapping so foreign key should be in child table
 *
 *Here we must supply value for primary key as DB and Hibernate will not generate 
 *if not using @GeneratedValue
 *
 *GenerationType.AUTO---> if we want auto increment process(Here Hibernate will supply
 *Primary Key Value)  
 *Here 1st relation is One-to-Many
 *@OneToMany(mappedBy="customer")	:-It says already information for F.K is taken 
 *in Request class just simply map this
 */ 

