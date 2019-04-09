package com.zen.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zen.beans.user.UserData;

public class UserLoginDao {

	public UserData getUserCredentials(String userEmail){
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Query getUserQuery= session.createQuery("from UserData u where u.userEmail= :user_email");
		getUserQuery.setParameter("user_email", userEmail);
		
		List<UserData> resultList= getUserQuery.list();
		
		if(resultList.isEmpty())
			return null;
		else 
			return resultList.get(0);
	}
}
