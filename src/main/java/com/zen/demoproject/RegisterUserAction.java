package com.zen.demoproject;

import com.zen.services.UserRegistrationService;

public class RegisterUserAction {
	
	public String userName;
	public String userEmail;
	public String userPassword;
	public String userMobile;
	public String userGender;
	
	public String getRegistrationPage(){
		return "register";
	}
	
	public String registerUser(){
		UserRegistrationService userRegistrationService= new UserRegistrationService();
		userRegistrationService.registerUser(userName, userEmail, userPassword, userMobile, userGender);
		return "registerSuccess";
	}
	
	
}
