package com.kantravi.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplete {

	public static Object saveObject(Object obj) {
		Object id = null;
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			id = session.save(obj);
			tx.commit();

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}

		return id;

	}

	public static void updateObject(Object obj) {
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			session.update(obj);
			tx.commit();

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}

	}

	public static void deleteObject(Class cls, Serializable s) {
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			Object o = session.load(cls, s);
			session.delete(o);

			tx.commit();

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}

	}

	public static Object loadObject(Class cls, Serializable s) {
		Object o = null;
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();

			o = session.load(cls, s);
			session.delete(o);

			tx.commit();

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}

		return o;
	}

}
/*Code duplication is reduced using templates
 * 
 */ 
