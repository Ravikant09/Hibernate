package com.kantravi.hibernate;
import org.hibernate.*;

public class Lab1B {

	public static void main(String[] args) {

		Transaction tx=null;
		Session session=null;
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
		
			Object obj=session.get(Student.class,new SID("B-09","101"));
			
			if(obj==null){
				System.out.println("Student Not Found");
			}
			
			else 
			{
				Student stu=(Student)obj;
				System.out.println(stu);
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


//Here if have more than one query than Add as a Batch
//Here 1 and 2 are Primary key used for selecting 
