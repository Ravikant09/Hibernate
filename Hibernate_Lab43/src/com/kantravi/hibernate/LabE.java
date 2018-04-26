package com.kantravi.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LabE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx = null;
		Session session = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			// Display Customer by Status
			String sql = "select {cust.*} from Customer cust where cust.status=? and cust.city=?";

			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("cust", Customer.class);

			query.setParameter(0, "Active");
			query.setParameter(1, "Goa");

			List<Customer> list = query.list(); // internallly convert HQL to
												// SQL then ResultSet and
												// all.........
			for (Customer cust : list) {
				System.out.println(cust);
			}

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
