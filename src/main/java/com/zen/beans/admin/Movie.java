package com.zen.beans.admin;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PVR_MOVIES")
public class Movie {
	
	@Id
	@GenericGenerator(name="MOVIE_ID_GENERATOR", strategy= "com.zen.admin.dao.MovieIdGenerator")
	@GeneratedValue(generator="MOVIE_ID_GENERATOR")
	@Column(name="MOVIE_ID")
	private String movieId;
	
	@Column(name="MOVIE_NAME")
	private String movieName;
	
	@Column(name="MOVIE_DIRECTOR")
	private String movieDirector;
	
	@Column(name="MOVIE_CAST")
	private String movieCast;
	
	@Column(name="MOVIE_DESC", length=1000)
	private String movieDescription;
	
	@Column(name="MOVIE_DURATION")
	private int movieDuration;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Theater> theaterName= new HashSet<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<City> cityName= new HashSet<>();
	

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieCast() {
		return movieCast;
	}

	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public int getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(int movieDuration) {
		this.movieDuration = movieDuration;
	}

	public Set<Theater> getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(Set<Theater> theaterName) {
		this.theaterName = theaterName;
	}

	public Set<City> getCityName() {
		return cityName;
	}

	public void setCityName(Set<City> cityName) {
		this.cityName = cityName;
	}
	
}
