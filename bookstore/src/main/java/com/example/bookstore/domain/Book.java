package com.example.bookstore.domain;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
private String title, author, isbn;
private int publicationYear, price;

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
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getPublicationYear() {
	return publicationYear;
}
public void setPublicationYear(int publicationYear) {
	this.publicationYear = publicationYear;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", publicationYear=" + publicationYear
			+ ", price=" + price + ", id=" + id + "]";
}

}
