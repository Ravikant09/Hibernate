package com.kantravi.hibernate;

import java.util.*;

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

			Customer cust=(Customer)session.load(Customer.class, 1);
			
			Book b1=(Book)session.load(Book.class,1);
			
			OrderItem oi1=new OrderItem(1,1923);//order 1 book of MasterJava
			oi1.setBook(b1);
			session.save(oi1);
			
			Book b2=(Book)session.load(Book.class,3);
			
			OrderItem oi2=new OrderItem(10,11510);//order 10 book of MasterSpring
			oi1.setBook(b2);
			session.save(oi2);
		
			
			ShippingAddress add=new ShippingAddress("BTM","BANGALORE","K.A");
			session.save(add);
			
			Set<OrderItem> orderitem=new HashSet<OrderItem>();
			orderitem.add(oi1);
			orderitem.add(oi2);
			
			
			Order order=new Order(11,13433.0,new Date(),"New");
			order.setAddress(add);
			order.setOrderItems(orderitem);
			order.setCustomer(cust);
			session.save(order);
			
			
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

//here 1 and 3 are bid 