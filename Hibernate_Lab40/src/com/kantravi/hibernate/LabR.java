package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LabR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			//Pagination
			

			Criteria ct=session.createCriteria(Customer.class);

				ct.add(Restrictions.eq("city","Bangalore"));
				ct.setFirstResult(2);	//Index Number 
				ct.setMaxResults(8);	//How many records we want 
			
			
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
