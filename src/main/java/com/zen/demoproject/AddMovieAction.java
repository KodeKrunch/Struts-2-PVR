package com.zen.demoproject;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.beans.admin.City;
import com.zen.beans.admin.Theater;
import com.zen.services.AddMovieService;
import com.zen.services.RetrieveCityService;
import com.zen.services.RetrieveTheaterService;

public class AddMovieAction {
	
	public HttpSession session= ServletActionContext.getRequest().getSession();
	
	/** 
	 * @return Retrieves list of cities to add movie
	 */
	
	public List<City> listOfCities;
	
	public String getCityForMovie(){
		RetrieveCityService retrieveCityService= new RetrieveCityService();
		listOfCities= retrieveCityService.getCities();
		return "citypage";
	}
	
	/**
	 * @return Retrieves List of theaters of particular city
	 */
	public String cityId;
	public List<Theater> listOfTheaters;
	public String getTheaterForMovie(){
		RetrieveTheaterService retrieveTheaterService= new RetrieveTheaterService();
		listOfTheaters =retrieveTheaterService.getTheaters("BY_CITY_ID", cityId);
		session.setAttribute("CITY_ID", cityId);
		return "theaterpage";
	}
	
	
	/**
	 * @return This will return movie details page
	 */
	public String theaterId;
	
	public String getMovieAddPage(){
		session.setAttribute("THEATER_ID", theaterId);
		return "moviepage";
	}
	
	/**
	 * @return  Add movie according to particular city and theater
	 * 
	 */
	public String movieName;
	public String movieDirector;
	public String movieCast;
	public String movieDescription;
	public int movieDuration;
	
	public String addMovie(){
		AddMovieService addMovieService= new AddMovieService();
		addMovieService.addMovieInTheater(movieName, movieDirector, movieCast, movieDescription, movieDuration);
		return "success";
	}

}
