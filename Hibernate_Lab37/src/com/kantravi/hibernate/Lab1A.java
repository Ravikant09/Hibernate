package com.kantravi.hibernate;

public class Lab1A {

	public static void main(String[] args) {

		CustomerDAO cdao=DAOFactory.getCustomerDAO();
		//Add Customer
		CustomerTO cto=new CustomerTO(1,"Sunny","sun@gmail.com",9987877887l,"Silchar","Enabled");
		cdao.addCustomer(cto);
		CustomerTO cto1=new CustomerTO(2,"Raj","raj@gmail.com",7262626887l,"Delhi","Disabled");
		cdao.addCustomer(cto1);
		CustomerTO cto2=new CustomerTO(3,"Pakhi","pakhi@gmail.com",8476352887l,"Kolkata","Diaabled");
		cdao.addCustomer(cto2);
		CustomerTO cto3=new CustomerTO(4,"Ramu","ramu@gmail.com",9987656766l,"Silchar","Enabled");
		cdao.addCustomer(cto3);
		
		//Get Customer
		CustomerTO c1=cdao.getCustomerByCid(1);
		System.out.println(c1);

		//Delete Customer
		cdao.deleteCustomer(4);

		//Update Customer
		CustomerTO c2=cdao.getCustomerByCid(2);
		c2.setCname("Mani");
		c2.setEmail("mani@gmail.com");
		c2.setStatus("Enabled");
	}
	

}


