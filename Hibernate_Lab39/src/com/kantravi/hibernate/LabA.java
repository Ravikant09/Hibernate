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
			
			//Display All Customer

			Customer customer=new Customer("Sunny","sun@gmail.com","Silchar",87777.00,"VISA",4344,"Active");
			session.save(customer);
			
			Customer customer1=new Customer("Raju","raju@gmail.com","Goa",28282.00,"VISA",6262,"Active");
			session.save(customer1);

			
			Customer customer2=new Customer("madhu","madhu@gmail.com","Bombay",73363.00,"MasterCard",8383,"InActive");
			session.save(customer2);

			
			Customer customer3=new Customer("Rohit","rohit83@gmail.com","Kolkata",77383.00,"Debit",7363,"InActive");
			session.save(customer3);

			
			Customer customer4=new Customer("Mohit","mohit@gmail.com","Bangalore",83636.00,"VISA",2088,"Active");
			session.save(customer4);

			Customer customer5=new Customer("Kiran","kiran@gmail.com","Bangalore",66774.00,"MasterCard",9282,"InActive");
			session.save(customer5);
			
			Customer customer6=new Customer("Rumi","rumi72@gmail.com","Bombay",84333.00,"VISA",1965,"Active");
			session.save(customer6);

			Customer customer7=new Customer("Riya","riya@gmail.com","Goa",87226.00,"VISA",1234,"Active");
			session.save(customer7);

			Customer customer8=new Customer("Dhiraj","dhiraj@gmail.com","Bangalore",12929.00,"Debit",6060,"Active");
			session.save(customer8);

			
			
			
			
			
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
