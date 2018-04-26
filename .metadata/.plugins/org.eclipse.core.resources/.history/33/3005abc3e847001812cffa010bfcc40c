package com.kantravi.hibernate;

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

			
			Student stu=(Student)session.load(Student.class, 1);
			System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getDob()+"\t"+stu.getQualification());
			
			
			tx.commit();
			session.close();
		} catch (Exception e) {

			if(tx!=null)
				tx.rollback();
				session.close();
		}
		
		
	}

}


