package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			//Display Customer by city and status
			
			
			
			Query query=session.getNamedQuery("CustomerByCityAndStatus");
			query.setString(0,"Bangalore");
			query.setString(1,"Active");
				

			List<Customer> list=query.list();		//internallly convert HQL to SQL then ResultSet and all.........
			for(Customer cust:list){
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
//In Named Query we write Query in XML mapping or with Annotation 