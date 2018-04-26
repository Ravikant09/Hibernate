package com.kantravi.hibernate;
import org.hibernate.*;

public class Lab1B {

	public static void main(String[] args) {

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=(Customer)session.load(Customer.class, 1);
			System.out.println(cust);
			
			int a=cust.getVersion();
			System.out.println("Version Couunt Before Updating " +a);
			
			cust.setCname("Aditi");
			session.update(cust);
			
			int b=cust.getVersion();
			System.out.println("Version Couunt After Updating " +b);
			
			
			
			tx.commit();

			int c=cust.getVersion();
			System.out.println("Version Couunt After Commit  "+c);


			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


/*Even we update also then also version count will increase after commit
 *Even if updating with same value than also it will 1st check for Dirty check and 
 *if Dirty than it will not update and Version Count will not increase 
 *if updating as a batch than all has to update
 */
 