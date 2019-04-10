package com.zen.services;

import java.util.List;

import com.zen.admin.dao.RetrieveCityDao;
import com.zen.beans.admin.City;

public class RetrieveCityService {

	public List<City> getCities(){
		RetrieveCityDao retrieveCityDao= new RetrieveCityDao();
		return retrieveCityDao.getCityList();
	}
	
}
