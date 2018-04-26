package com.kantravi.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IDGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SessionImplementor si, Object obj) throws HibernateException {


		String stid="C-001";
				   //01234		index
		
		try {
			Session s=(Session)si;
			Transaction tx=s.getTransaction();
			Query q1=s.createQuery("from Customer");
			
			int size=q1.list().size();
			if(size!=0){
				Query query=s.createQuery("select max(cid) from Customer");
				List li=query.list();
				System.out.println(li.size());
				Object o=li.get(0);
				System.out.println(o);
				
				String id="";
				id=o.toString();
				String part=id.substring(2);	//index start doing operation form 2 of stid
				int x=Integer.parseInt(part);  //since stid is of String type and we are taking only integer part
		
				x=x+1;
				if(x<=9){
					stid="C-00"+x;
				}else if(x<=99){
					stid="C-0"+x;
				}else if(x<999){
					stid="C-"+x;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stid;
	}

}
