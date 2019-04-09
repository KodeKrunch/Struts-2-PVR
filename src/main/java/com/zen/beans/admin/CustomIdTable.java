package com.zen.beans.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOM_ID_TABLE")
public class CustomIdTable {
	
	@Id
	@Column(name="PREFIX")
	private String prefix;
	
	@Column(name="COUNT")
	private int count;

	public CustomIdTable() {
		
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
