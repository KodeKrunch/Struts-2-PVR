package com.zen.beans.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PVR_CITY")
public class City {
	
	@Id
	@GenericGenerator(name="CITY_ID_GENERATOR", strategy="com.zen.admin.dao.CityIdGenerator")
	@GeneratedValue(generator="CITY_ID_GENERATOR")
	@Column(name="CITY_ID")
	private String cityId;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="STATE_NAME")
	private String stateName;
	

	@Column(name="COUNTRY_NAME")
	private String countryName;

	
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
