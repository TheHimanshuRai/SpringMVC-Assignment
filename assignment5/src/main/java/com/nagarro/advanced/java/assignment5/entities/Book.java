package com.nagarro.advanced.java.assignment5.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book {
	@Id//id should be long and autogenerated
	private long code;//it should be string 
	private String title;
	private String author;
	private Date dateAdded;
	public Book() {
		super();
	}
	public Book(long code, String title, String author, Date dateAdded) {
		super();
		this.code = code;
		this.title = title;
		this.author = author;
		this.dateAdded = dateAdded;
	}
	public long getcode() {
		return code;
	}
	public void setcode(long code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	

}