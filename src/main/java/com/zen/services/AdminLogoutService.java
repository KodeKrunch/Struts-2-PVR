package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class AdminLogoutService {

	public void adminLogoutExecute(){
		HttpSession session= ServletActionContext.getRequest().getSession();
		session.removeAttribute("ADMIN");
	}
}
