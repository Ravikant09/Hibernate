package com.kantravi.hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();

	
			Student s1=(Student)session.load(Student.class, 1);
			
			System.out.println("Student Info");
			System.out.println(s1);
			
			
			System.out.println("Course Info");
			Set<Course> cous=s1.getCourses();	//since we have many courses so Set
			for(Course c:cous){
				System.out.println(c);
			}
			
			
			
		
	
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


