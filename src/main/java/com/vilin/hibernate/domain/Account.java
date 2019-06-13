package com.vilin.hibernate.domain;

import java.io.Serializable;

public class Account implements Serializable {

	private Integer id;
	
	private String username;
	
	private String password;

	public Account() {
		super();
	}

	public Account(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
