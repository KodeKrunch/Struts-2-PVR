package com.zen.demoproject;

import com.zen.services.UserLogoutService;

public class UserLogoutAction {
	
	public String userLogout(){
		UserLogoutService userLogoutService= new UserLogoutService();
		userLogoutService.removeUserFromSession();
		return "logout";
	}
}
