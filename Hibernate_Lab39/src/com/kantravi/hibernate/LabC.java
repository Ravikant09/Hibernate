package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			//Display Customer by City and CardType
			String hql=" from Customer cust where cust.city=? and cust.cardType=?";
			
			Query query=session.createQuery(hql);
			query.setString(0, "Silchar");
			query.setString(1, "VISA");
			
			
			List<Customer> list=query.list();		//internallly convert HQL to SQL then ResultSet and all.........
			for(Customer cust:list){
				System.out.println(cust);
			}

			
//Here data having city=silchar and cardType="VISA" will be loaded

			
			
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
