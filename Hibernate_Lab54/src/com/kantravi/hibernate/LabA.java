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
			
			Customer cust1=new Customer("Raju","raj@gmail.com",7282777272l);	
			
			String customerId=session.save(cust1).toString();
			System.out.println(customerId);
			session.flush();
			tx.commit();
			

			
			tx=session.beginTransaction();
			Customer cu=(Customer)session.load(Customer.class,"402881836200ea4f016200ea531e0000");
			System.out.println(cu);
			Customer cu1=(Customer)session.load(Customer.class," 402881836200eb44016200eb46b80000");
			System.out.println(cu1);
			
	
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


//Here if have more than one query than Add as a Batch