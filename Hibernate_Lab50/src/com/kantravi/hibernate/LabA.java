package com.kantravi.hibernate;
import org.hibernate.*;

public class LabA {

	public static void main(String[] args) {

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Customer cust1=new Customer("Rajiv","Mohit@gmail.com",8272655152l,"Surat",59000.00);
			session.save(cust1);
			
			Integer it=(Integer)session.save(cust1);
			System.out.println(it.intValue());
			
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