
package com.kantravi.hibernate;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();

			Customer cust=(Customer)session.load(Customer.class,1);
			
			System.out.println("Customer Info");
			System.out.println(cust);		//since we have toString so can be displayed only with cust
			
			System.out.println("Request Info");
			Collection<Request> col=cust.getRequests();
			for(Request req:col){
				System.out.println(req);
			}
			
			
			
		
	
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


