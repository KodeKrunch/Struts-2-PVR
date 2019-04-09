package com.zen.admin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.entry.StructuredCacheEntry;
import org.hibernate.cfg.Configuration;

import com.zen.beans.admin.Admin;

public class AdminLoginDao {
	
	public Admin getAdminCredentials(){
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Admin adminCredentials= (Admin) session.get(Admin.class, "admin");
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Complete"+adminCredentials.getEmail()+adminCredentials.getPassword());
		return adminCredentials;
	}
	
	
}
