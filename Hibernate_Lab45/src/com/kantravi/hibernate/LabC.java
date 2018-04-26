package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
			
			//Display Customer by email
			
			
			
			Query query=session.getNamedQuery("CustomerByEmail");
			query.setString(0,"sun@gmail.com");
			

			Customer cust=(Customer)query.uniqueResult();	//since sun@gmail.com is only one in email
			
				System.out.println(cust);
	
			
			
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
//In Named Query we write Query in XML mapping or with Annotation 