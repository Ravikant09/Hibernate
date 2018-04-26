//One-To-One UNI-Directional With XML
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

			Customer cust=new Customer("Sunny","Paul","Sun17@gmail.com","8927766522");
			session.save(cust);
			
			Address add=new Address("BTM 16th Main","Bangalore","Karnataka");
			session.save(add);
			
			//Till now no relation b/w Customer and Address
			
			cust.setAddress(add);	//Now we have a relation b/w These two tables
			
			//Until we use setter and getter for Address in Customer POJO class than cust.setAddress(add); will give error 
			
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
 
