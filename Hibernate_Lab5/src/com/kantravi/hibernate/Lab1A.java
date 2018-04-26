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
			
			Customer cust1=(Customer)session.load(Customer.class, 1);
			cust1.setEmail("Sunny@yahoo.com");
			cust1.setMybal(95000.00);
			session.update(cust1);
			
			
			Customer cust2=(Customer)session.load(Customer.class, 2);
			cust2.setCname("Pooja");
			cust2.setMybal(89000.00);
			session.update(cust2);
			
			
			
			Customer cust3=(Customer)session.load(Customer.class, 1);
			System.out.println(cust3.getCid()+"\t"+cust3.getCname()+"\t"+cust3.getEmail()+"\t"+cust3.getMybal()+"\t"+cust3.getPhone()+cust3.getMycity());
			
			
	//		Customer cust4=(Customer)session.load(Customer.class, 3);
	//		session.delete(cust4);
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