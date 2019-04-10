package com.zen.demoproject;

import java.util.List;

import com.zen.beans.admin.City;
import com.zen.services.AddTheaterService;
import com.zen.services.RetrieveCityService;

public class AddTheaterAction {
	/**
	 * @return This method returns the list of all cities from database
	 */
	
	public List<City> listOfCities;
	
	public String getTheaterPage(){
		RetrieveCityService retrieveCityService= new RetrieveCityService();
		listOfCities= retrieveCityService.getCities();
		return "theaterpage";
	}
	
	
	/**
	 * @return This method adds data of theater 
	 */
	
	public String cityId;
	public String theaterName;
	
	public String addTheater(){
		AddTheaterService addTheaterService= new AddTheaterService();
		addTheaterService.addPvrTheater(cityId, theaterName);
		return "success";
	}
}
