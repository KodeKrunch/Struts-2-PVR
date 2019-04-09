package com.zen.beans.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.io.output.ThresholdingOutputStream;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER_DATA")
public class UserData  implements Serializable{
	
	@Id
	@GenericGenerator(name="customGen" , strategy="increment")
	@GeneratedValue(generator="customGen")
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_NAME")
	private  String userName;
	
	@Column(name="USER_EMAIL", unique=true)
	private  String userEmail;
	
	@Column(name="USER_PASSWORD")
	private  String userPassword;
	
	@Column(name="USER_MOBILE")
	private  String userMobile;
	
	@Column(name="USER_GENDER")
	private  String userGender;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="USER_CREATED_DATE")
	private  java.util.Date userCreatedDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="USER_UPDATED_DATE")
	private  java.util.Date userUpdatedDate;
	
	
	/**
	 * Default Constructor
	 */
	public UserData(){
		
	}
	
	/**
	 * 
	 * @Parameterized Constructor for User creation
	 * 
	 */
	public UserData(String userName, String userEmail, String userPassword, String userMobile,String userGender, java.util.Date userCreatedDate, java.util.Date userUpdatedDate) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
		this.userGender = userGender;
		this.userCreatedDate= userCreatedDate;
		this.userUpdatedDate= userUpdatedDate;
	}
	
	/**
	 *
	 * @Parameterized constructor for user update
	 */
	public UserData(Integer id, String userName, String userEmail, String userPassword, String userMobile,java.util.Date userUpdatedDate) {
		super();
		this.userId = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
		this.userUpdatedDate= userUpdatedDate;
	}
	

	public java.util.Date getUserUpdatedDate() {
		return userUpdatedDate;
	}

	public void setUserUpdatedDate(java.util.Date userUpdatedDate) {
		this.userUpdatedDate = userUpdatedDate;
	}

	/**
	 * @return
	 * getters and setters
	 */
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
}
