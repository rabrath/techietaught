package com.techietaught.javaBookVersion.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class TechBook extends BaseEntity{

	private String author;
	private String title;
	private int bookSize;
	private double price;
	
	public TechBook() {
		
	}
	
	public TechBook(String author, String title, int bookSize, double price) {
		super();
		this.author = author;
		this.title = title;
		this.bookSize = bookSize;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBookSize() {
		return bookSize;
	}

	public void setBookSize(int bookSize) {
		this.bookSize = bookSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author, bookSize, price, title);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof TechBook)) {
			return false;
		}
		TechBook other = (TechBook) obj;
		return Objects.equals(author, other.author) && bookSize == other.bookSize
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "TechBook [author=" + author + ", title=" + title + ", bookSize=" + bookSize + ", price=" + price + "]";
	}	
	
}
