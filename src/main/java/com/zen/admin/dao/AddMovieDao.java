package com.zen.admin.dao;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zen.beans.admin.City;
import com.zen.beans.admin.Movie;
import com.zen.beans.admin.Theater;

public class AddMovieDao {
	
	public void addMovieDetail(String movieName, String movieDirector, String movieCast, String movieDescription , int movieDuration){
		HttpSession httpSession= ServletActionContext.getRequest().getSession();
		Session session= HibernateUtil.getHibernateSession();
		Transaction transaction= session.beginTransaction();
		
		Movie movie= new Movie();
		movie.setMovieName(movieName);
		movie.setMovieDirector(movieDirector);
		movie.setMovieCast(movieCast);
		movie.setMovieDescription(movieDescription);
		movie.setMovieDuration(movieDuration);
		movie.getCityName().add((City)session.load(City.class, (String)httpSession.getAttribute("CITY_ID")));
		movie.getTheaterName().add((Theater)session.load(Theater.class, (String)httpSession.getAttribute("THEATER_ID")));
		session.save(movie);
		transaction.commit();
		session.close();
		httpSession.removeAttribute("CITY_ID");
		httpSession.removeAttribute("THEATER_ID");
	}

}
