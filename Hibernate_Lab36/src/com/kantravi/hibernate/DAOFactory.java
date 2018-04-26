package com.kantravi.hibernate;

public class DAOFactory {

	static CustomerDAO customerDAO;
	
	static{
		customerDAO=new HibernateCustomerDAO();
		
	}
	public static CustomerDAO getCustomerDAO(){
		return customerDAO;
	}
	
}


/*Singelton Class since here donot have any instance variable so why unnecessarily 
 *we create multiple object so  Singelton
 */

