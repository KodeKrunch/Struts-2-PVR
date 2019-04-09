package com.zen.demoproject;

import com.opensymphony.xwork2.ActionSupport;
import com.zen.services.AdminLoginService;

/**
 * @author HKatakiya
 *
 */
public class AdminLoginAction extends ActionSupport {
	
	/**
	 * @return
	 * This is the method to get the login page
	 */
	
	public String getLoginPage(){
		return "login";
	}
	
	
	/**
	 * @return
	 * This method calls service method to validate admin credentials
	 */

	public String userEmail;
	public String userPassword;
	
	public String adminLogin(){
		AdminLoginService adminLoginService= new AdminLoginService();
		boolean loginKey= adminLoginService.validateAdminCredentials(userEmail, userPassword);
		
		if(loginKey)
			return "success";
		else
			return "fail";
	}
}
