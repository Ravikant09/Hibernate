//One-To-One BiDirectional With Annotation
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

			Customer cust=new Customer("Pooja","Paul","pooja@gmail.com","8796766522");
			session.save(cust);
			
			Address add=new Address("Mathikere","Bangalore","Karnataka");
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
 * Here Once Drop tables manually otherwise warning saying aid value is default.....
 */
 
