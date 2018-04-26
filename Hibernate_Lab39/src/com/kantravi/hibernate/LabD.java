package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			//Display Customer by CardType
			String hql=" from Customer where cardType=?";
			
			Query query=session.createQuery(hql);
			query.setString(0, "VISA");
			
			
			List<Customer> list=query.list();		//internallly convert HQL to SQL then ResultSet and all.........
			for(Customer cust:list){
				System.out.println(cust);
			}

			
			
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
