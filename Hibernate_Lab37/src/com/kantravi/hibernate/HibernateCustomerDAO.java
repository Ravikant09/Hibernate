package com.kantravi.hibernate;

public class HibernateCustomerDAO implements CustomerDAO{

	@Override
	public int addCustomer(CustomerTO cto) {

		Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());	//new Customer(cto) we cannot use as it is not PS
		Integer it=(Integer)HibernateTemplete.saveObject(cust);
		
		return it.intValue();
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());	//new Customer(cto) we cannot use as it is not PS

		HibernateTemplete.updateObject(cust);
		
	}

	@Override
	public void deleteCustomer(int cid) {

		HibernateTemplete.deleteObject(Customer.class, cid);
		
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer cust=(Customer)HibernateTemplete.loadObject(Customer.class, cid);
		CustomerTO cto=new CustomerTO(cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity(),cust.getStatus());	//new Customer(cto) we cannot use as it is not PS
		
		return cto;
	}

	
	
	
}
