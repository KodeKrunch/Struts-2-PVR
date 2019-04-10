package com.zen.admin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zen.beans.admin.City;

public class RetrieveCityDao {
	
	public List<City> getCityList(){
		
		Session session= HibernateUtil.getHibernateSession();
		Transaction transaction= session.beginTransaction();
		List<City> listOfCities= session.createQuery("from City c").list();
		transaction.commit();
		session.close();
		return listOfCities;
	}

}
