package com.jobiak.mvcforms.login.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//bean ,model,commandObject,Entity

@Entity
@Table(name="logindata")
public class User {
	
	private	String name;
	private	String email;
	private	String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	

}
