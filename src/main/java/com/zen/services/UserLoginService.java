package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.admin.dao.UserLoginDao;
import com.zen.beans.user.UserData;

public class UserLoginService {

	public boolean validateUserCredentials(String userEmail, String userPassword){
		UserLoginDao userLoginDao= new UserLoginDao();
		UserData userData= userLoginDao.getUserCredentials(userEmail);
		
		if(userData==null || !userData.getUserPassword().equals(userPassword)){
			return false;
		}
		else { 
			HttpSession session= ServletActionContext.getRequest().getSession();
			session.setAttribute("USER", userData);
			return true;
		}
	}
}
