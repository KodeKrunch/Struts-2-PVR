package com.zen.demoproject;

import com.zen.services.UserLoginService;

public class UserLoginAction {
	
	public String userEmail;
	public String userPassword;

	/**
	 * @return
	 * Validate user email and password
	 */
	public String userLogin(){
		UserLoginService userLoginService= new UserLoginService();
		boolean loginKey= userLoginService.validateUserCredentials(userEmail, userPassword);
		
		if(loginKey){
			return "success";
		}else{
			return "fail";
		}
	}
}
