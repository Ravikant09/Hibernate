//Many-To-Many BiDirectional With XML
package com.kantravi.hibernate;


import java.util.HashSet;
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


			Student s1=new Student("Sunny","sun18@gmail.com","8272766262");
			Student s2=new Student("Ravi","ravi63@gmail.com","9252544242");
			Student s3=new Student("Mohit","mohit@gmail.com","8484744742");
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			Course c1=new Course("JAVA", new Integer(4), new Double(6000));
			Course c2=new Course("Hibernate", new Integer(2), new Double(3000));
			Course c3=new Course("BigData", new Integer(8), new Double(12000));
			
			session.save(c1);
			session.save(c2);
			session.save(c3);
			
			Set<Course> cs1=new HashSet<Course>();
			cs1.add(c1);
			cs1.add(c2);
			s1.setCourses(cs1);

			Set<Course> cs2=new HashSet<Course>();
			cs2.add(c1);
			cs2.add(c2);
			cs2.add(c3);
			s2.setCourses(cs2);

			Set<Course> cs3=new HashSet<Course>();
			cs3.add(c2);
			cs3.add(c3);
			s3.setCourses(cs3);
			

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


/*Here We Cannot Take TreeSet Because In TreeSet we have only one type of Data 
 * but in Courses we have String,Integer and Double so getting error 
 * In case of Many-to-Many Setter Mtd is Inserting into 3rd table but for 
 * One-to-Many and One-to-One Setter Mtd is Updating respective tables with F.K
 */
 
