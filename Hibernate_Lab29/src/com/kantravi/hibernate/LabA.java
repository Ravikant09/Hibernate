//One-To-One BiDirectional With XML
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


			Address add=new Address();
			add.setCity("Silchar");
			add.setStreet("Rangirkhari");
			
			Customer cust=new Customer("Sunny",add);
			session.save(cust);
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
 * Here if have more than one query than Add as a Batch
 *we can also do session.save(.......)
 *IN Table Per Class only one table will be there and all the column will be altered
 *in that same table (with PK).
 *If Respective Column value is present than it will be entered in DB otherwise
 *if no value found than entry null
 *Here lots of null value will be there so it is RECOMENDED not to use Table Per Class
 */
 
