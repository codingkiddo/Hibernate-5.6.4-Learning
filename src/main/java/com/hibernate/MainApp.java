package com.hibernate;

import org.hibernate.Session;

/**
 * @author imssbora
 */
public class MainApp {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Check database version
		String sql = "select version()";

		System.out.println(session.createQuery(sql).list());

		session.getTransaction().commit();
		session.close();

	}
}
