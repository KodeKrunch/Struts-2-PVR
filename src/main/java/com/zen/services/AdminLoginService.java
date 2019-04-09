package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.admin.dao.AdminLoginDao;
import com.zen.beans.admin.Admin;

public class AdminLoginService  {

	public boolean validateAdminCredentials(String userEmail, String userPassword){
		AdminLoginDao adminLoginDao= new AdminLoginDao();
		Admin adminCredentials = adminLoginDao.getAdminCredentials();
		HttpSession session= ServletActionContext.getRequest().getSession();
		if(adminCredentials.getEmail().equals(userEmail) && adminCredentials.getPassword().equals(userPassword)){
			session.setAttribute("ADMIN", adminCredentials);
			System.out.println(session);
			return true;
		}else{ 
			return false;
		}
	}

}
