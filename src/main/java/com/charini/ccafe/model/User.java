package com.charini.ccafe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String secondName;
	private String email;
	private String password;
	
	public int getAid() {
		return userId;
	}
	public void setAid(int aid) {
		this.userId = aid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
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
	@Override
	public String toString() {
		return "registerUser [userId=" + userId + ", firstName=" + firstName + ", secondName=" + secondName + ", email="
				+ email + ", password=" + password + "]";
	}
	

	
}