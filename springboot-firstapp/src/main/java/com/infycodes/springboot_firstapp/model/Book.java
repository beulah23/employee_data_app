package com.infycodes.springboot_firstapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Book {

	String name;
	String publishedDate;

	public Book() {
		super();
		this.name = name;
		this.publishedDate = publishedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

}
