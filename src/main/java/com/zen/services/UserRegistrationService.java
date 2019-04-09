package com.zen.services;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.admin.dao.UserRegisterDao;
import com.zen.beans.user.UserData;

public class UserRegistrationService {
	
	public void registerUser(String userName,String userEmail,String userPassword,String userMobile,String userGender){
		UserRegisterDao userRegisterDao = new UserRegisterDao();
		UserData userDetails=new UserData(userName, userEmail, userPassword, userMobile, userGender, new Date(), new Date());
		userRegisterDao.registerUserDetails(userDetails);
		HttpSession session= ServletActionContext.getRequest().getSession();
		session.setAttribute("USER", userDetails);
	}
}
