package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LabE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			

			Criteria ct=session.createCriteria(Customer.class);
		
			Criterion cty=Restrictions.eq("city", "Goa");	//Criterion Object 
			Criterion sts=Restrictions.eq("status", "Active");	//Criterion Object 
				
			ct.add(Restrictions.and(cty,sts));
			
			List<Customer> li=ct.list();
			for (Customer cust:li) {
				System.out.println(cust);
				
			}
			
			
			//Note	:-Restrictions.eq(.... , ....):-For Restricting One Value
			//Note	:-Restrictions.and(.... , ....):-For Restricting Multiple Values
			
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
