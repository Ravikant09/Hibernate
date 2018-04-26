package com.kantravi.hibernate;
import java.util.List;

import org.hibernate.*;

public class Lab1A {

	public static void main(String[] args) {

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			
			System.out.println("Display My All Contacts");
			
			Query q1=session.getNamedQuery("getAllContacts_SP");
			List<Contact> clist1=q1.list();
			for(Contact c:clist1){
				System.out.println(c);
			}
			
			

			System.out.println("Display Active Contacts");
			
			Query q2=session.getNamedQuery("getAllActiveContacts_SP");
			q2=q2.setString("st","Active");		//since one is input type so setString
			List<Contact> clist2=q2.list();
			for(Contact c:clist2){
				System.out.println(c);
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


//Here if have more than one query than Add as a Batch