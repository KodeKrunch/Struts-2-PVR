package com.zen.demoproject;

import javax.servlet.http.HttpSession;

import com.zen.beans.admin.Admin;
import com.zen.services.AdminProfileService;

/**
 * @author HKatakiya
 *This class retrieves admin details
 */
public class AdminProfileAction {

	/**
	 * @return
	 * This class retrieves admin details
	 */
	
	public Admin adminData;
	
	public String getAdminProfile(){
		AdminProfileService adminProfileService= new AdminProfileService();
		adminData= adminProfileService.getAdminDetails();
		return "profile";
	}
	
	/**
	 * @return
	 * This method return to the home page of admin section
	 */
	public String goBack(){
		return "home";
	}
	
}
