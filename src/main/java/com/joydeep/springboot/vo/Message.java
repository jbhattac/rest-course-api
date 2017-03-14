package com.joydeep.springboot.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Message {
	@Id
	private String id;
	private String text;
	private String author;
	private Date created;
	
	
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String id, String text, String author, Date created) {
		super();
		this.id = id;
		this.text = text;
		this.author = author;
		this.created = created;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	

}
