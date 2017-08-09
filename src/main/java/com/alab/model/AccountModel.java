package com.alab.model;

public class AccountModel {

	private Long id;
	
	private String username;
	
	private String password;
	
	private boolean expired = false;
	
	private boolean locked = false;

	private boolean crediantialsExpired = false;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isCrediantialsExpired() {
		return crediantialsExpired;
	}

	public void setCrediantialsExpired(boolean crediantialsExpired) {
		this.crediantialsExpired = crediantialsExpired;
	}

}
