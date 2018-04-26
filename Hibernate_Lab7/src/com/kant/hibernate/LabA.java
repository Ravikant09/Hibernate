package com.kant.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
			
			String cous[]={"Java","JDBC","JSP"};
			
			List<String> ems=new ArrayList<>();
			ems.add("sunny@gmail.com");
			ems.add("mohan@gmail.com");
			ems.add("kshitimohanp@gmail.com");
			
			List<Integer> maks=new ArrayList<Integer>();
			maks.add(new Integer(94));
			maks.add(new Integer(87));
			maks.add(new Integer(73));
			maks.add(new Integer(89));
				
			Set<Long> phs=new TreeSet<Long>();
			phs.add(new Long(8272788272l));
			phs.add(new Long(9383877363l));
			phs.add(new Long(8762655252l));
			
			Map<String, Long> refs=new HashMap<String,Long>();
			refs.put("Raj",8393999383l);
			refs.put("Dhoni", 7383733733l);
			refs.put("Manab", 8373766363l);
			
			
			Student stu=new Student("Sunny","10-01-10","B.Tech",cous,ems,maks,phs,refs);
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