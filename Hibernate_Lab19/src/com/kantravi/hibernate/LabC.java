//Reverse Loading 
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

			Address add=(Address)session.load(Address.class, 1);
			System.out.println(add.getClass());
			System.out.println(add.getAid()+"\t"+add.getStreet()+"\t"+add.getCity()+"\t"+add.getState());
		
			
			Customer cust=add.getCustomer();
			System.out.println(cust.getClass());
			System.out.println(cust.getCid()+"\t"+cust.getFirstName()+"\t"+cust.getLastName()+"\t"+cust.email+"\t"+cust.getPhone());

			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


