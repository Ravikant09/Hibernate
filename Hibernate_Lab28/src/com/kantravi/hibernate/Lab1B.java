package com.kantravi.hibernate;
import java.util.Date;

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
		
			
			cust.setCname("Mohan");
			session.update(cust);
			
			Date ts=cust.getTstamp();
			System.out.println(ts);
			tx.commit();

			
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


/*TimeStamp can be either Date type or TimeeStamp type
 * /
 */
 