package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			// Pagination
			String sql = "select {cust.*} from Customer cust";

			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("cust", Customer.class);

			query.setFirstResult(0); // from which index number
			query.setMaxResults(4); // How many records

			List<Customer> list = query.list();
			for (Customer cust : list)
				System.out.println(cust);

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
