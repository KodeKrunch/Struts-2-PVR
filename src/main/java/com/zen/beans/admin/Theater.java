package com.zen.beans.admin;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PVR_THEATER")
public class Theater {
	
	@Id
	@GenericGenerator(name="THEATER_ID_GENERATOR", strategy="com.zen.admin.dao.TheaterIdGenerator")
	@GeneratedValue(generator="THEATER_ID_GENERATOR")
	@Column(name="THEATER_ID")
	private String theaterId;

	@Column(name="THEATER_NAME")
	private String theaterName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private City cityName;
	
	
	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public City getCityName() {
		return cityName;
	}

	public void setCityName(City cityName) {
		this.cityName = cityName;
	}

	
}
