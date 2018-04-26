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
			System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getMybal()+"\t"+cust.getPhone()+"\t"+cust.getMycity());;
			
			Customer cust1=(Customer)session.load(Customer.class, 2);
			System.out.println(cust1.getCid()+"\t"+cust1.getCname()+"\t"+cust1.getEmail()+"\t"+cust1.getMybal()+"\t"+cust1.getPhone()+"\t"+cust1.getMycity());

			Customer cust3=(Customer)session.load(Customer.class, 3);
			System.out.println(cust3.getCid()+"\t"+cust3.getCname()+"\t"+cust3.getEmail()+"\t"+cust3.getMybal()+"\t"+cust3.getPhone()+"\t"+cust3.getMycity());
			Customer cust4=(Customer)session.load(Customer.class, 4);
			System.out.println(cust4.getCid()+"\t"+cust4.getCname()+"\t"+cust4.getEmail()+"\t"+cust4.getMybal()+"\t"+cust4.getPhone()+"\t"+cust4.getMycity());

			
			
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
