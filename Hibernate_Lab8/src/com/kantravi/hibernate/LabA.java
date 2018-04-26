package com.kantravi.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
			
			String milk[]={"AMUL","MOTHER DIARY"};
			
			List<String> bisc=new ArrayList<>();
			bisc.add("Goodey");
			bisc.add("Bratinia");
			bisc.add("Marigold");
			
				
			Set<String> games=new TreeSet<String>();
			games.add("Chess");
			games.add("Badminton");
			games.add("Billiards");
			
			
			
			Student stu=new Student("Mohan","10-01-10",milk,bisc,games);
			session.save(stu);
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


/*
 * Here if have more than one query than Add as a Batch
 * Default lazy mapping is enabled 
 * Now we can enable Aggressive loading and disable Lazy loading by do the following
 * in Hibernate mapping
 * <class name="Student" table="students" lazy="false">
 * so if I enable Aggressive loading at class level than only main table and Array 
 * Courses will be selected at a time
 * To enable Aggressive loading we must specify at Set,Bag,List,Map
 * 
 * We cannot enable Aggressive Loading for Array 

 */