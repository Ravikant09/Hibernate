package com.kantravi.hibernate;
import org.hibernate.*;

public class Lab1A {

	public static void main(String[] args) {

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Customer cust1=new Customer("Mohit","Mohit@gmail.com",7383773737l,"Blore",34000.00);
			
			session.save(cust1);
			
			
			
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

//here with annotation we do not need hibernate mapping file 
//And in hibernate in case of mapping resource we use mapping class and fully qualified class name
//Here if have more than one query than Add as a Batch