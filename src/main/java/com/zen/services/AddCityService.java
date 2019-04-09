package com.zen.services;

import com.zen.admin.dao.AddCityDao;
import com.zen.beans.admin.City;

public class AddCityService {

	public void addCityDetail(String cityName, String stateName, String countryName){
		City addCity= new City();
		addCity.setCityName(cityName);
		addCity.setStateName(stateName);
		addCity.setCountryName(countryName);
		
		AddCityDao addCityDao= new AddCityDao();
		addCityDao.saveCityDetail(addCity);
		
	}
	
}
