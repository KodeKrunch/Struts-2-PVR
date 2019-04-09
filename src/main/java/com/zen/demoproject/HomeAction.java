package com.zen.demoproject;
import org.apache.log4j.Logger;

public class HomeAction{
	
	static final Logger logger= Logger.getLogger(HomeAction.class);	
	
	public String demohome(){
		logger.info("This is Homepage method");
		return "homeview";
	}
	
}
