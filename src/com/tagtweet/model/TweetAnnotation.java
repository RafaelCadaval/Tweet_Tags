package com.tagtweet.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TWEETANNOTATION")
public class TweetAnnotation implements Serializable {

	private static final long serialVersionUID = -6541003672404717119L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TWEET_ANNOTATION")
	private int idTweetAnnotation;

	@OneToOne
	@JoinColumn(name = "ID_TAG", foreignKey = @ForeignKey(name = "FK_TWEET_ANNOTATION_ID_TAG"))
	private Tag tag;

	@OneToOne
	@JoinColumn(name = "ID_TWEET", foreignKey = @ForeignKey(name = "FK_TWEET_ANNOTATION_ID_TWEET"))
	private Tweet tweet;

	@OneToOne
	@JoinColumn(name = "ID_USER", foreignKey = @ForeignKey(name = "FK_TWEET_ANNOTATION_ID_USER"))
	private User user;

	@Temporal(TemporalType.DATE)
	private Date date;

	public TweetAnnotation() {
	}

	public TweetAnnotation(int idTweetAnnotation, Tag idTag, Tweet idTweet, User idUser, Date date) {
		this.idTweetAnnotation = idTweetAnnotation;
		this.tag = idTag;
		this.tweet = idTweet;
		this.user = idUser;
		this.date = date;
	}

	public int getIdTweetAnnotation() {
		return idTweetAnnotation;
	}

	public Tag getIdTag() {
		return tag;
	}

	public Tweet getIdTweet() {
		return tweet;
	}

	public User getIdUser() {
		return user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String toString() {
		return "\nID TweetAnnotation: " + idTweetAnnotation + "\nTag: " + tag + "\nTweet: " + tweet + "\nUser: " + user
				+ "\nDate: " + date;
	}
}