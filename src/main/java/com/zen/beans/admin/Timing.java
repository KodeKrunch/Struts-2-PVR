package com.zen.beans.admin;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PVR_TIMINGS")
public class Timing {
	
	@Id
	@Column(name="TIME_ID")
	private String timeId;
	
	@Column(name="TIME_NAME")
	private String timeName;
	
	@Column(name="TIME_DESC")
	private String timeDesc;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<MovieDate> movieDates= new HashSet<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Theater> theaterName= new HashSet<>();

	public String getTimeId() {
		return timeId;
	}

	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}

	public String getTimeName() {
		return timeName;
	}

	public void setTimeName(String timeName) {
		this.timeName = timeName;
	}

	public String getTimeDesc() {
		return timeDesc;
	}

	public void setTimeDesc(String timeDesc) {
		this.timeDesc = timeDesc;
	}

	public Set<MovieDate> getMovieDates() {
		return movieDates;
	}

	public void setMovieDates(Set<MovieDate> movieDates) {
		this.movieDates = movieDates;
	}

	public Set<Theater> getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(Set<Theater> theaterName) {
		this.theaterName = theaterName;
	}

	
	
}
