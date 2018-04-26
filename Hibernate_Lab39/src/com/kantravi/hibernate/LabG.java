package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			


			String hql=" from Customer cust where cust.city=? and cust.status=?";
			
			Query query=session.createQuery(hql);
			
			query.setString(0, "Bombay");
			query.setString(1, "InActive");
			
			List<Customer> list=query.list();
			for(Customer cust:list)
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
