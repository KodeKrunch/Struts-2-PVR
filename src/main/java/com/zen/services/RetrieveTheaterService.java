package com.zen.services;

import java.util.List;

import com.zen.admin.dao.RetrieveTheaterDao;
import com.zen.beans.admin.Theater;

public class RetrieveTheaterService {
	
	public List<Theater> getTheaters(String filterKey, String filterId){
		RetrieveTheaterDao retrieveTheaterDao= new RetrieveTheaterDao();
		
		if(filterKey.equals("BY_CITY_ID")){
			return retrieveTheaterDao.getTheaters(Theater.class, filterId);
		}else{
			return null;
		}
		
	}

}
