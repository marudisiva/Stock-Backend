package com.cts.project.pojos;

import javax.persistence.*;
@Entity
@Table(name="user")
public class User {
	@Id
	private String username;
	
	@Column(name="password",nullable=false,length=100)
	private String password;
	
	private String confirm;
	private String firstname;
	  private String lastname;
	  private String email;
	  private String address;
	  private int phone;
	private int age; 
	private String usertype;
	private String profileimage;


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", confirm=" + confirm + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone="
				+ phone + ", age=" + age + ", usertype=" + usertype + ", profileimage=" + profileimage + "]";
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
	  public String getFirstname() {
	  return firstname;
	  }
	  public void setFirstname(String firstname) {
	  this.firstname = firstname;
	  }
	  public String getLastname() {
	  return lastname;
	  }
	  public void setLastname(String lastname) {
	  this.lastname = lastname;
	  }
	  public String getEmail() {
	  return email;
	  }
	  public void setEmail(String email) {
	  this.email = email;
	  }
	  public String getAddress() {
	  return address;
	  }
	  public void setAddress(String address) {
	  this.address = address;
	  }
	  public int getPhone() {
	  return phone;
	  }
	  public void setPhone(int phone) {
	  this.phone = phone;
	  }
	  public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		 public String getUsertype() {
				return usertype;
			}
			public void setUsertype(String usertype) {
				this.usertype = usertype;
			}
			 public String getConfirm() {
					return confirm;
				}


				public void setConfirm(String confirm) {
					this.confirm = confirm;
				}
				public String getProfileimage() {
					return profileimage;
				}


				public void setProfileimage(String profileimage) {
					this.profileimage = profileimage;
				}

	}