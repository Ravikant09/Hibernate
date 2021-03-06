//TABLE PER SUB-CLASS
package com.kantravi.hibernate;


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

			//Adding Student
			Student stu=new Student("Sunny","Silchar","Enabled",15000.00);
			Integer it=(Integer)session.save(stu);
			System.out.println(it.intValue());
			System.out.println("P.K :"+stu.getSid());
			//Adding CurrentStudent
			CurrentStudent cstu=new CurrentStudent("Mohan","Bangalore","Enabled",15000.00,1500.00,"10:00AM","BTM");
			it=(Integer)session.save(cstu);
			System.out.println(it.intValue());
			System.out.println("P.K :"+cstu.getSid());
			
			//Adding Old Student
			OldStudent ostu=new OldStudent("Rajiv","Delhi","Enabled",15000.00,"TCS","rajiv90@gmail.com",27000.00);
			it=(Integer)session.save(ostu);
			System.out.println(it.intValue());
			System.out.println("P.K :"+ostu.getSid());

			//Adding Weekday Student
			WeekdayStudent wdstu=new WeekdayStudent("Sumit","Bangalore","Enabled",15000.00,3000.00,"10:00AM","BTM","B.TECH","89.5",2017);
			it=(Integer)session.save(wdstu);
			System.out.println(it.intValue());
			System.out.println("P.K :"+wdstu.getSid());

			//Adding Weekend Student
			WeekendStudent wnstu=new WeekendStudent("Ranjan","Bangalore","Enabled",15000.00,1000,"8:00AM","HSR","DataWeave","ranjan90@gmail.com",22000.00);
			it=(Integer)session.save(wnstu);
			System.out.println(it.intValue());
			System.out.println("P.K :"+wnstu.getSid());

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
 *we can also do session.save(.......)
 *In case of table per sub-class mapping main super class will have a master table 
 *with PK and every sub-class will have its own table with Foreign Key(FK) 
 *
 *Here if we are using Annotation instead of XML than in Hibernate Configuration 
 *mapping class will be for Each and Every Super and Sub-Class i.e main table with 
 *primary key and other sub table also  
 */
 
