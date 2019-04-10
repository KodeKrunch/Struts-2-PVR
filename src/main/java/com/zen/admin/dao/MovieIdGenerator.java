package com.zen.admin.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.zen.beans.admin.CustomIdTable;

public class MovieIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		String prefix="PVR";
		String key="MOV";
		int count=0;
		int countToUpdate=0;
		
		Session hibernateSession= HibernateUtil.getHibernateSession();
		Transaction transaction= hibernateSession.beginTransaction();
		
		CustomIdTable customIdTable= hibernateSession.load(CustomIdTable.class, key);
		count= customIdTable.getCount();
		countToUpdate=count+1;
		customIdTable.setCount(countToUpdate);
		transaction.commit();
		hibernateSession.close();
		
		return prefix+key+Integer.toString(count);
	}

}
