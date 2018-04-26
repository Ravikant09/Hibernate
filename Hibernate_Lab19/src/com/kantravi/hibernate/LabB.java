package com.kantravi.hibernate;

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

			Customer cust=(Customer)session.load(Customer.class, 1);
			System.out.println(cust.getCid()+"\t"+cust.getFirstName()+"\t"+cust.getLastName()+"\t"+cust.getEmail()+"\t"+cust.getPhone());
		
			Address add=cust.getAddress();
			System.out.println(add.getAid()+"\t"+add.getStreet()+"\t"+add.getCity()+"\t"+add.getState());

			
			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}




//With XML Default Loading Type is Lazy Loading
//With Annotation Default Loading Type is Aggressive Loading
