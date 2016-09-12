package com.tagtweet.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER")
public class User implements Serializable {
	
	private static final long serialVersionUID = -3191559411135079882L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Temporal(TemporalType.DATE)
	private Date registerDate;
	
	@Column(length = 150, nullable = false)
	private String login;
	
	@Column(length = 40, nullable = false)
	private String password;
	
	@Column(length = 100)
	private String email;
	
	public User(){ }
	
	public User(int idUser, Date registerDate, String login, String password, String email){
		this.idUser = idUser;
		this.registerDate = registerDate;
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public Date getRegisterDate() {
		return registerDate;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\nID User: " + idUser + "\nRegister Date: " + registerDate
				+ "\nLogin: " + login + "\nEmail: " + email;
	}
	
}