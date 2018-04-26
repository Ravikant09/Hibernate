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
	
			SID id=IDGenerator.getNextSid("B-09");
			Student stu=new Student(id,"Ravi","ravi@gmail.com",7777777777l);
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


//Here if have more than one query than Add as a Batch