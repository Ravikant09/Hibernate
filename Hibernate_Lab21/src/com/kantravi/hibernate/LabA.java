//One-To-Many BiDirectional With XML
package com.kantravi.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class LabA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();


			Customer cust=new Customer("Manish","Rai","manish@gmail.com","9867566565");
			session.save(cust);
			
			Request req1=new Request("12/02/2011","Lost","Active");
			Request req2=new Request("04/09/2015","Stolen","Active");
			
			session.save(req1);
			session.save(req2);
			
			//Till now no relation b/w Customer and Address
			

			req1.setCustomer(cust);	//since foreign key should be in child table
			req2.setCustomer(cust);	//since foreign key should be in child table
			
			
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


/*
 */
 
