package com.cts.project.pojos;

import javax.persistence.*;
@Entity
@Table(name="user")
public class User {
	@Id
	
	@Column(name="password",nullable=false,length=100)
	private String password;
	private String username;
	  private String email;
	  private int mobile;
	 
	  @Override
		public String toString() {
			return "User [id=" + id + ", password=" + password + ", username=" + username + ", email=" + email + ", mobile="
					+ mobile + ", confirmed=" + confirmed + "]";
		}
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	
	 
	 
	}