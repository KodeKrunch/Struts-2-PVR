package com.zen.services;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.zen.admin.dao.AddMovieDao;

public class AddMovieService {
	
	public void addMovieInTheater(String movieName,String movieDirector,String movieCast,String movieDescription, int movieDuration){
		HttpSession session= ServletActionContext.getRequest().getSession();
		AddMovieDao addMovieDao= new AddMovieDao();
		addMovieDao.addMovieDetail( movieName, movieDirector, movieCast, movieDescription, movieDuration);
	}

}
