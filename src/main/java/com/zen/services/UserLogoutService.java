package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class UserLogoutService {
	public void removeUserFromSession(){
		HttpSession session= ServletActionContext.getRequest().getSession();
		session.removeAttribute("USER");
	}
}
