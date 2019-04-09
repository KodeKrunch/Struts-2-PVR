package com.zen.demoproject;

import com.zen.services.AdminLogoutService;

public class AdminLogoutAction {

	public String adminLogout(){
		AdminLogoutService adminLogoutService= new AdminLogoutService();
		adminLogoutService.adminLogoutExecute();
		return "logout";
	}
}
