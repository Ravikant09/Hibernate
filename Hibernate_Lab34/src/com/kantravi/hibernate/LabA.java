package com.kantravi.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			
			List<String> qualis=new ArrayList<String>();
			qualis.add("M.Sc");
			qualis.add("M.Tech");
			qualis.add("B.Tech");
			
			
			Set<String> exps=new HashSet<String>();
			exps.add("SUN");
			exps.add("IBM");
			exps.add("ORACLE");


			Author a1=new Author("Sunny","sunny@gmail.com",8373777363l,qualis,exps);
			session.save(a1);

			Author a2=new Author("Raj","raj@gmail.com",7464777363l,qualis,exps);
			session.save(a2);

			
			Book b1=new Book("MasterJava",1923.0,5,"OraclePress");
			session.save(b1);
			
			Book b2=new Book("MasterJava",887.0,6,"Manning Publications");
			session.save(b2);
		
			Book b3=new Book("MasterSpring",1151.0,6,"JLC");
			session.save(b3);
			
			
			Set<Author> as1=new HashSet<Author>();
			as1.add(a1);
			
			Set<Author> as2=new HashSet<Author>();
			as2.add(a1);
			as2.add(a2);
					
			b1.setAuthors(as1);
			b2.setAuthors(as1);
			b3.setAuthors(as2);
			
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


