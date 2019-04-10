package com.zen.services;

import com.zen.admin.dao.AddTheaterDao;

public class AddTheaterService {
	
	public void addPvrTheater(String cityId , String theaterName){
		AddTheaterDao addTheaterDao = new AddTheaterDao();
		addTheaterDao.addTheaterInCity(cityId, theaterName);
	}

}
