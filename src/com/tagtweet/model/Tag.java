package com.tagtweet.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAG")
public class Tag implements Serializable {

	private static final long serialVersionUID = -2153075035561590953L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TAG")
	private int idTag;

	@Column(nullable = false)
	private int grade;

	@Column(length = 30, nullable = false)
	private String description;

	public Tag() {
	}

	public Tag(int idTag, int grade, String description) {
		this.idTag = idTag;
		this.grade = grade;
		this.description = description;
	}

	public int getIdTag() {
		return idTag;
	}

	public int getGrade() {
		return grade;
	}

	public String getDescription() {
		return description;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "\nID Tag: " + idTag + "\nGrade: " + grade + "\nDescription: " + description;
	}
}