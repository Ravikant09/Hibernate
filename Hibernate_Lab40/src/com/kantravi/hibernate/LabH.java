package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LabH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			//Display All Customer
			

			Criteria ct=session.createCriteria(Customer.class);
			
			ct.add(Restrictions.and(
					Restrictions.eq("status", "InActive"),
					Restrictions.eq("city", "Bangalore"),
					Restrictions.eq("cardType", "VISA")
					));
			
		//Since no records with InActive,Bangalore and Visa	so no Result Displayed
			
			List<Customer> li=ct.list();
			for (Customer cust:li) {
				System.out.println(cust);
				
			}
			
			
			
			
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
