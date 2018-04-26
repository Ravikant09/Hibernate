package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			//Fetching multiple Column
			
			String sql="select cid,cardBal,cardType,email from Customer";
			
			SQLQuery query=session.createSQLQuery(sql);

			List<Object[]> list=query.list();
			System.out.println(list.size());
			for(Object []obj:list){
				for(Object ob:obj)
				System.out.print(ob+"\t");
				System.out.println("");
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
