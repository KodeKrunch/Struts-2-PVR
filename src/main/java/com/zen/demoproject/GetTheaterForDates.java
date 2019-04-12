package com.zen.demoproject;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.postgresql.util.GettableHashMap;

import com.opensymphony.xwork2.ActionSupport;
import com.zen.beans.admin.Theater;
import com.zen.services.RetrieveTheaterService;

@Action(value="/PopulateTheater", results= @Result(type="json", params = {"contentType", "application/json", "root", "map"}))
public class GetTheaterForDates extends ActionSupport {

	public String cityId;
	
	public List<Theater> map= new ArrayList<>();
	
	public List<Theater> getMap(){
		return map;
	}
	
	@Override
	public String execute() throws Exception {
		RetrieveTheaterService retrieveTheaterService= new RetrieveTheaterService();
		map= retrieveTheaterService.getTheaters("BY_CITY_ID", cityId);
		return super.execute();
	}
}
