package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class IDGenerator {

	public  static SID getNextSid(String bid){


		SID sid=null;
		Transaction tx=null;
		
		try {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.getTransaction();
			
				String hql1="from Student stu where stu.studentId.bid=?";
				Query q1=session.createQuery(hql1);
				q1.setString(0,bid);
			
				List l1=q1.list();
				if(l1.size()==0){
						
					sid=new SID(bid,"101");	
				
			}else{
				
				
				String hql2="select max(studentId.sid) from Student where studentId.bid=?";
				Query query=session.createQuery(hql2);
				query.setString(0,bid);
				String id=query.list().get(0).toString();
				int x=Integer.parseInt(id);
		
				x=x+1;
				if(x<=9){
					sid=new SID(bid,"10"+x);
				}else if(x<=99){
					sid=new SID(bid,"1"+x);
				}else if(x<999){
					sid=new SID(bid,""+x);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sid;
	}

}
