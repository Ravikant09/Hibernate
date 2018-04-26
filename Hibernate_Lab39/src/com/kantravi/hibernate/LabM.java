package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			String hql=" from Customer cust where cust.city in (:cities)";
			
			Query query=session.createQuery(hql);
			query.setParameterList("cities", new String[]{"Goa","Bombay"});
				
			List<Customer> list=query.list();
			for(Customer cust:list)
			System.out.println(cust);

//If we using multiple say city or status or.............than we must 
//use in operator instead of =
			
			

			
			
			tx.commit();
			session.close();
			System.out.println("Record Inserted Successfully ");
	
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}
