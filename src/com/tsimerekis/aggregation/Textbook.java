package com.tsimerekis.aggregation;

public class Textbook {
	
	/*
	 * These are standard things for a book I think
	 */
	private String authorFirstName;
	private String authorLastName;
	private String title;
	private String publisher;

	public Textbook(String authorFirstName, String authorLastName, String title, String publisher) {
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.title = title;
		this.publisher = publisher;
	}
	
	public String getAuthorFullName() {
		return authorFirstName + " " + authorLastName;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return authorLastName + ", " + authorFirstName + ". " + title + " " + publisher; 
	}
}
