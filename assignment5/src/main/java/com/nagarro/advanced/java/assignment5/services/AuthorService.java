package com.nagarro.advanced.java.assignment5.services;

import java.util.List;

import com.nagarro.advanced.java.assignment5.entities.Author;

public interface AuthorService {
	public List<Author> getAuthors();

	public Author getAuthor(long authorId);

	public Author addAuthor(Author author);

	public Author updateAuthor(Author author);

	public void deleteAuthor(long parseLong);

}
