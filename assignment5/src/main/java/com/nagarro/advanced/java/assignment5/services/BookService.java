package com.nagarro.advanced.java.assignment5.services;

import java.util.List;

import com.nagarro.advanced.java.assignment5.entities.Book;

public interface BookService {
	
	public List<Book> getBooks();

	public Book getBook(long bookId);

	public Book addBook(Book book);

	public Book updateBook(Book book);

	public void deleteBook(long parseLong);
}
