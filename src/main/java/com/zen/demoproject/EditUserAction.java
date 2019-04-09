package com.zen.demoproject;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.beans.user.UserData;
import com.zen.services.UserEditService;

public class EditUserAction {

	/**
	 * Return Edit user page with current details
	 * 
	 */
	public UserData userObject;
	
	public String getEditUserPage(){
		HttpSession session= ServletActionContext.getRequest().getSession();
		userObject=(UserData) session.getAttribute("USER");
		return "editpage";
	}
	
	
	/**
	 * Takes updated input params and update in DB	
	 * 
	 */
	
	public String userName;
	public String userEmail;
	public String userPassword;
	public String userMobile;
	public String userGender;
	
	public String updateDetails(){
		UserEditService userEditService= new UserEditService();
		userEditService.updateProfile(userName, userEmail, userPassword, userMobile, userGender);
		return "updated";
	}
	
}
