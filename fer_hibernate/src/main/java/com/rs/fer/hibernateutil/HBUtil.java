package com.rs.fer.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {

	
	private static final SessionFactory sessionFactory;
	static {
		try {
		      Configuration cfg = new Configuration();
		      cfg.configure("hibernate.cfg.xml");

			sessionFactory = cfg.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}