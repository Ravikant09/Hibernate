package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			String hql=" from Customer cust where city=? order by cardBal desc";
			
			
			Query query=session.createQuery(hql);
			query=query.setString(0, "Bangalore");
			
			List<Customer> list=query.list();
			for(Customer cust:list)
			System.out.println(cust);


//In OrderBy ascending or decending depends on value for number and ASCII for alpha-Numeric		
			
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
