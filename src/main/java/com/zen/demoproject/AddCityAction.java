package com.zen.demoproject;

import com.zen.services.AddCityService;

public class AddCityAction {
	
	/**
	 * @return add city page
	 */
	public String getCityPage(){
		return "citypage";
	}
	

	/**
	 * @return Method to add city
	 */
	

	public String cityName;
	public String stateName;
	public String countryName;

	public String addCity(){
		AddCityService addCityService= new AddCityService();
		addCityService.addCityDetail(cityName, stateName, countryName);
		return "addcity";
	}
	
}
