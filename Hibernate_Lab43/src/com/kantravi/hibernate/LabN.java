package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
	String sql="select {cust.*} from Customer cust where cardType in (:cType)";
			
			SQLQuery query=session.createSQLQuery(sql);
			query.addEntity("cust",Customer.class);			

			query.setParameterList("cType", new String[]{"MasterCard","Debit"});
				
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
