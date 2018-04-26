//TABLE PER CLASS
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
 *IN Table Per Class only one table will be there and all the column will be altered
 *in that same table (with PK).
 *If Respective Column value is present than it will be entered in DB otherwise
 *if no value found than entry null
 *Here lots of null value will be there so it is RECOMENDED not to use Table Per Class
 */
 
