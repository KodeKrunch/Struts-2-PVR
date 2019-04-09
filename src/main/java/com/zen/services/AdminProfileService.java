package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.beans.admin.Admin;

public class AdminProfileService {

	public Admin getAdminDetails(){
		HttpSession session= ServletActionContext.getRequest().getSession();
		return (Admin)session.getAttribute("ADMIN");
	}
}
