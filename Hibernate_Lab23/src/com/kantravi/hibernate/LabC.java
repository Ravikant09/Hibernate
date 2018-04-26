//Reverse Loading 
//Here I make loading type as Aggressive Loading
package com.kantravi.hibernate;

import java.util.Set;

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

			Course c=(Course)session.load(Course.class, 1);
			System.out.println("Course Info");
			
			System.out.println(c);
			
			
			Set<Student> stus=c.getStudents();	//since we have many students so Set
			System.out.println("Student Info");

			for(Student s:stus){
				System.out.println(s);
			}
			
			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


