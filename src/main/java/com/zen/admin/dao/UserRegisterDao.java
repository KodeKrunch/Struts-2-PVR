package com.zen.admin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zen.beans.user.UserData;

public class UserRegisterDao {
	
	public void registerUserDetails(UserData userData){
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		session.saveOrUpdate(userData);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
}
