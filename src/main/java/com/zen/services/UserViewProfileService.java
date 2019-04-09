package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.beans.user.UserData;

public class UserViewProfileService {

	public UserData getUpdatedUser(){
		HttpSession session= ServletActionContext.getRequest().getSession();
		return (UserData) session.getAttribute("USER");
	}
	
}
