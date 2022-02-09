package com.example.LMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_details")
public class books {
	@Id
	private String book_name;
	private String book_author_name;
	private String category;
	private String user_rating;
	
	public String getBook_name() {
		return book_name;
	}
	
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public String getBook_author_name() {
		return book_author_name;
	}
	
	public void setBook_author_name(String book_author_name) {
		this.book_author_name = book_author_name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getUser_rating() {
		return user_rating;
	}
	
	public void setUser_rating(String user_rating) {
		this.user_rating = user_rating;
	}

	public books() {
		super();
	}

	public books(String book_name, String book_author_name, String category, String user_rating) {
		super();
		this.book_name = book_name;
		this.book_author_name = book_author_name;
		this.category = category;
		this.user_rating = user_rating;
	}

	@Override
	public String toString() {
		return "books [book_name=" + book_name + ", book_author_name=" + book_author_name + ", category=" + category
				+ ", user_rating=" + user_rating + "]";
	}
	
}
