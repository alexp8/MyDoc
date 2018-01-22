package com.mydoc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Bean class holding information regarding users.
 * @author Alex
 */
@Entity
@Table(name = "USER")
public class User {
	
	/**
	 * Id of the user. Sequence used to generate the Id.
	 */
	@Id
	@Column(name="USER_ID")
	@SequenceGenerator(sequenceName="USER_SEQ", name="USER_SEQ")
	@GeneratedValue(generator="USER_SEQ", strategy=GenerationType.SEQUENCE)
	private Integer userId;
	
	/**
	 * Username of the user. Must be unique.
	 */
	@Column(name="USERNAME", unique = true)
	private String username;
	
	/**
	 * Password of the user.
	 */
	@Column(name="PASSWORD", nullable = false)
	private Integer password;
	
	public User() {
		
	}
	
	/**
	 * Create a new user.
	 * @param username of the user
	 * @param password of the user
	 */
	public User(String username, String password) {
		this.username = username;
		this.password = password.hashCode();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
}