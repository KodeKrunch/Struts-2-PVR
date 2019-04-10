package com.zen.admin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zen.beans.admin.City;
import com.zen.beans.admin.Theater;

public class AddTheaterDao {
	
	public void addTheaterInCity(String cityId , String theaterName){
		Session session= HibernateUtil.getHibernateSession();
		Transaction transaction= session.beginTransaction();
		City city= (City)session.load(City.class, cityId);
		Theater theater= new Theater();
		theater.setTheaterName(theaterName);
		theater.setCityName(city);
		session.save(theater);
		transaction.commit();
		session.close();
	}

}
