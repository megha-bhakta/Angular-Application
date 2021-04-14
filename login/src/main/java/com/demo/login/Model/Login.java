package com.demo.login.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class Login {

	@Id
	@GeneratedValue
	private int login_id;
	private String username;
	private String password;

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
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

	public Login(int login_id, String username, String password) {
		super();
		this.login_id = login_id;
		this.username = username;
		this.password = password;
	}

	public Login() {
		super();
	}
	
	
}
