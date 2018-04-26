package com.kantravi.hibernate;
import org.hibernate.*;

public class Lab1C {

	public static void main(String[] args) {

		Session session=null;
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			Customer cust=(Customer)session.load(Customer.class, 1);
			System.out.println(cust);
			
			int a=cust.getVersion();
			System.out.println("Version Couunt Before Updating " +a);
			
			cust.setCname("Aditi");
			session.update(cust);
			
			int b=cust.getVersion();
			System.out.println("Version Couunt After Updating " +b);
			
			
			

			int c=cust.getVersion();
			System.out.println("Version Couunt After Commit  "+c);


		
		
	}

}


/*Normally while selecting i.e loading we do not need to begin transaction
 */
 
 