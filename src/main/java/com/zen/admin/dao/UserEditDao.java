package com.zen.admin.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zen.beans.user.UserData;

public class UserEditDao {
	
	public UserData editUserDetails(int userId, String userName, String userEmail, String userPassword, String userMobile,
			String userGender){
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Object object= session.load(UserData.class, userId);
		UserData existingUser= (UserData)object;
		Transaction transaction= session.beginTransaction();
		try {
			existingUser.setUserName(userName);
			existingUser.setUserEmail(userEmail);
			existingUser.setUserPassword(userPassword);
			existingUser.setUserMobile(userMobile);
			existingUser.setUserGender(userGender);
			existingUser.setUserUpdatedDate(new Date());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		return existingUser;
	}

	
}
