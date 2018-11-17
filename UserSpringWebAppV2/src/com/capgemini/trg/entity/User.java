package com.capgemini.trg.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_credentials")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid;	
	private String username;
	private String password;
	private String emailId;
	@Temporal(TemporalType.DATE)
	private Date birthdate;
	
	public User() {
		
	}

	public User(Integer userid, String username, String password, String emailId ,Date birthdate) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.birthdate = birthdate;
	}

	public Integer getUserid() {
		return userid;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", emailId=" + emailId
				+ "]";
	}
	
	
	
	
	
}
