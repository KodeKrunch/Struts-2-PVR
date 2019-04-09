package com.zen.admin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zen.beans.admin.City;

public class AddCityDao {
	
	public void saveCityDetail(City city){
		Session session= HibernateUtil.getHibernateSession();
		Transaction transaction= session.beginTransaction();
		session.save(city);
		transaction.commit();
		session.close();
	}
}
