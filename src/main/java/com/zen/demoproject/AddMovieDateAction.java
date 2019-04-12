package com.zen.demoproject;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.spring.interceptor.ActionAutowiringInterceptor;
import com.zen.beans.admin.City;
import com.zen.beans.admin.Theater;
import com.zen.services.RetrieveCityService;
import com.zen.services.RetrieveTheaterService;

public class AddMovieDateAction extends ActionSupport {
	
	/**
	 * @return To get List of cities
	 */
	
	public List<City> listOfCities=null;
	
	public String key="City";
	
	public String getDatePage(){
		RetrieveCityService retrieveCityService= new RetrieveCityService();
		listOfCities= retrieveCityService.getCities();
		return "datepage";
	}
	
	
	/**
	 * @return To get list of all theaters of perticular city
	 */
	public String cityId;
	
	public List<Theater> listOfTheaters;
	
	public String getTheaters(){
		RetrieveTheaterService retrieveTheaterService= new RetrieveTheaterService();
		retrieveTheaterService.getTheaters("BY_CITY_ID", cityId);
		return "theaterlist";
	}
	
}
