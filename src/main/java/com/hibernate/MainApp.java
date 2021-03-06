package com.hibernate;

import org.hibernate.Session;

/**
 * @author imssbora
 */
public class MainApp {
	public static void main(String[] args) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//
//		// Check database version
//		String sql = "select version()";
//
//		String result = (String) session.createNativeQuery(sql).getSingleResult();
//		System.out.println(result);
//
//		session.getTransaction().commit();
//		session.close();
//
//		HibernateUtil.shutdown();
		
		
		Session session = HibernateUtilWithoutCFG.getSessionFactory().openSession();
	    session.beginTransaction();

	    // Check database version
	    String sql = "select version()";

	    String result = (String) session.createNativeQuery(sql).getSingleResult();
	    System.out.println(result);

	    session.getTransaction().commit();
	    session.close();

	    
	    HibernateUtilWithoutCFG.shutdown();

	}
}
