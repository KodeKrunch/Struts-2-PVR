package com.zen.beans.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	
	@Column(name="ADMIN_NAME")
	private String name;
	
	@Id
	@Column(name="ADMIN_EMAIL")
	private String email;
	
	@Column(name="ADMIN_PASSWORD")
	private String password;
	
	@Column(name="ADMIN_MOBILE")
	private String mobile;

	public Admin(){
		
	}
	
	public Admin(String id, String name, String email, String password, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

