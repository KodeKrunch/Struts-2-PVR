package com.zen.beans.admin;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zen.admin.dao.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		CustomIdTable customIdTable= new CustomIdTable();
		customIdTable.setPrefix("CTY");
		customIdTable.setCount(1001);
		
		Session session= HibernateUtil.getHibernateSession();
		Transaction transaction= session.beginTransaction();
		
		session.save(customIdTable);
		
		transaction.commit();
		System.out.println("Comlted");
	}
}
