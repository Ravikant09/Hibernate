package com.kantravi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();

			Student st=(Student)session.load(Student.class, 1);
			System.out.println(st);
			
			CurrentStudent cst=(CurrentStudent)session.load(CurrentStudent.class, 1);
			System.out.println(cst);
			
			OldStudent ost=(OldStudent)session.load(OldStudent.class, 1);
			System.out.println(ost);
			
			WeekdayStudent wdst=(WeekdayStudent)session.load(WeekdayStudent.class, 1);
			System.out.println(wdst);
			
			WeekendStudent wnds=(WeekendStudent)session.load(WeekendStudent.class, 1);
			System.out.println(wnds);
				tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
		}
		
		
	}

}


