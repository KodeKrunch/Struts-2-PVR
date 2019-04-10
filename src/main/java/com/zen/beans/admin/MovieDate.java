package com.zen.beans.admin;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PVR_DATES")
public class MovieDate {
	
	@Id
	@Column(name="MOVIE_DATE")
	@Temporal(TemporalType.DATE)
	private java.util.Date movieDate;
	
	@ManyToMany(cascade= CascadeType.ALL)
	private Set<Movie> movieName= new HashSet<>();

	public java.util.Date getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(java.util.Date movieDate) {
		this.movieDate = movieDate;
	}

	public Set<Movie> getMovieName() {
		return movieName;
	}

	public void setMovieName(Set<Movie> movieName) {
		this.movieName = movieName;
	}

	
}
