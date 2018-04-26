package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			String sql = "select * from Customer where city=:mycity and cardType=:cType";

			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("cust", Customer.class);
			query.setString("mycity", "Silchar");
			query.setString("cType", "VISA");

			// Note :We cannot use One as NamedParameter and other as
			// PositionalParameter

			List<Customer> list = query.list();
			for (Customer cust : list)
				System.out.println(cust);

			// Here Though City name is Unique But Still We can use Either
			// list() or uniqueResult()

			tx.commit();
			session.close();
			System.out.println("Record Inserted Successfully ");

		} catch (Exception e) {

			if (tx != null)
				tx.rollback();
			session.close();
		}

	}

}
