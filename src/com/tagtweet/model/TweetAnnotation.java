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
@Table(name="TWEETANNOTATION")
public class TweetAnnotation implements Serializable{
	
	private static final long serialVersionUID = -6541003672404717119L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTweetAnnotation;
	
	@Column(nullable = false)
	private int idTweet;
	
	@Column(nullable = false)
	private int idTag;
	
	@Column(nullable = false)
	private int idUser;
	
	@Temporal(TemporalType.DATE)//Não precisa por nullable, por quê?
	private Date date;
	
	public TweetAnnotation(){ }
	
	public TweetAnnotation(int idTweetAnnotation, int idTag, int idTweet, int idUser, Date date){
		this.idTweetAnnotation = idTweetAnnotation;
		this.idTag = idTag;
		this.idTweet = idTweet;
		this.idUser = idUser;
		this.date = date;
	}
	
	public int getIdTweetAnnotation() {
		return idTweetAnnotation;
	}
	
	public int getIdTag() {
		return idTag;
	}
	
	public int getIdTweet() {
		return idTweet;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String toString() {
		return "\nID TweetAnnotation: " + idTweetAnnotation + "\nID Tweet: " + idTweet
				+ "\nID Tag: " + idTag + "\nDate: " + date;
	}
}
