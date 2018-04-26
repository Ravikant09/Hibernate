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
			
			Customer cust1=new Customer("Sunny","Mohan@gmail.com",8272700922l,"Silchar",89000.00);
			session.save(cust1);
			
			
			Customer cust2=new Customer("Aditi","Aditi@gmail.com",9028282828l,"Agartala",73833.00);
			session.save(cust2);
			
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