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
@Table(name="TWEET")
public class Tweet implements Serializable{

	private static final long serialVersionUID = -8460654154903766114L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTweet;
	
	@Column(length = 200, nullable = false)
	private String text;
	
	@Temporal(TemporalType.DATE)//Não precisa por nullable, por quê?
	private Date date;
	
	public Tweet(){	}
	
	public Tweet(int idTweet, String text, Date date){
		this.idTweet = idTweet;
		this.text = text;
		this.date = date;
	}
	
	public int getIdTweet() {
		return idTweet;
	}
	
	public String getText() {
		return text;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String toString() {
		return "\nID Tweet: " + idTweet + "\nText: "
				+ text + "\nDate: " + date;
	}
}