package com.zen.services;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.admin.dao.UserEditDao;
import com.zen.beans.user.UserData;

public class UserEditService {
	
	HttpSession session= ServletActionContext.getRequest().getSession();

	public void updateProfile(String userName, String  userEmail, String userPassword, String userMobile , String userGender){
		UserData existingUser = (UserData) session.getAttribute("USER");
		UserEditDao userEditDao= new UserEditDao();
		UserData updatedUser= (UserData)userEditDao.editUserDetails(existingUser.getUserId(), userName, userEmail, userPassword, userMobile, userGender);
		session.setAttribute("USER", updatedUser);
	}
	
}
