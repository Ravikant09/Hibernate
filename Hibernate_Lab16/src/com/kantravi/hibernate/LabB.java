//One-To-One UNI-Directional With XML
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

			
			Address add1=(Address)session.load(Address.class, 1);
			System.out.println(add1.getAid()+"\t"+add1.getStreet()+"\t"+add1.getCity()+"\t"+add1.getState());

			
			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


