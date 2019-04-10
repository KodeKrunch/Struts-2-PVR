package com.zen.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zen.beans.admin.Theater;

public class RetrieveTheaterDao {
	
public <T> List<Theater> getTheaters(Class<T> classname, String filterId) {
	
		if(filterId.equals(null)){
			return null;
		}else{
			
			Session session = HibernateUtil.getHibernateSession();
			Transaction transaction= session.beginTransaction();
			Query query= session.createQuery("from Theater t where t.cityName.cityId= ?");
			query.setParameter(0, filterId);
			List<Theater> list= query.list();
			transaction.commit();
			session.close();
			return list;
		}
		
	}
}
