//Reverse Loading    It will load using Join Fetch 
package com.kantravi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();

			Request req=(Request)session.load(Request.class,1);
			
			System.out.println("Request Info");
			System.out.println(req);
			
			Customer cust=req.getCustomer();
			System.out.println("Customer Info");
			System.out.println(cust);
			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


