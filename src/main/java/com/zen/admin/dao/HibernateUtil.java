package com.zen.admin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Session getHibernateSession(){
		SessionFactory sessionFactory=null;
		Session session=null;
		
		try {
			sessionFactory= new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			session= sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  session;
	}

}
