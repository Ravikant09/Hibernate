package com.kantravi.hibernate;
import org.hibernate.*;

public class Lab1B {

	public static void main(String[] args) {

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory(0);
			session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=(Customer)session.load(Customer.class, 1);
			
//			Customer cust=(Customer)session.load(Customer.class, 19); no PK with 19
			
			System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getMybal()+"\t"+cust.getPhone());;
			Customer cust1=(Customer)session.load(Customer.class, 2);
			
			
			System.out.println(cust1.getCid()+"\t"+cust1.getCname()+"\t"+cust1.getEmail()+"\t"+cust1.getMybal()+"\t"+cust1.getPhone());

			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


//Here if have more than one query than Add as a Batch
//Here 1 and 2 are Primary key used for selecting 
