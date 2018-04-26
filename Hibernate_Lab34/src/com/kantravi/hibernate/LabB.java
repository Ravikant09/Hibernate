package com.kantravi.hibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			CreditCard cc1=new CreditCard(1111,"VISA",999,new Date());
			session.save(cc1);
			
			SilverCustomer c1=new SilverCustomer("Raju","raju@gmail.com",82828288888l,"Bangalore",10,"rajuroy@gmail.com");
			c1.setCCCard(cc1);
			session.save(c1);
			
			
			
	
			CreditCard cc2=new CreditCard(2222,"VISA",999,new Date());
			session.save(cc2);
			
			Map<String, String> refs=new HashMap<String,String>();
			refs.put("Ramu", "ramu@gmail.com");
			refs.put("Manu", "manu@gmail.com");
			
			
			GoldCustomer c2=new GoldCustomer("Pooja","pooja@gmail.com",8282777722l,9988822727l,refs,100);
			c2.setCCCard(cc2);
			session.save(c2);	
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

