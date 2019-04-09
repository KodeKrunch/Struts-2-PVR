package com.zen.demoproject;

import org.apache.log4j.Logger;

import com.zen.beans.user.UserData;
import com.zen.services.UserViewProfileService;

public class ViewUserAction  {
	static Logger logger= Logger.getLogger(ViewUserAction.class);
	
	public UserData updatedUser;
	
	public String getViewUserPage(){
		UserViewProfileService userViewProfileService= new UserViewProfileService();
		updatedUser= userViewProfileService.getUpdatedUser();
		return "viewpage";
	}
	
	public String goToHome(){
		return "gotohome";
	}
}
