package com.nagarro.advanced.java.assignment5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.advanced.java.assignment5.dao.AuthorDao;
import com.nagarro.advanced.java.assignment5.entities.Author;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorDao authorDao;

	@Override
	public List<Author> getAuthors() {
		return authorDao.findAll();
	}

	@Override
	public Author getAuthor(long authorId) {
		// TODO Auto-generated method stub
		return authorDao.getById(authorId);
	}

	@Override
	public Author addAuthor(Author author) {
		authorDao.save(author);
		return author;
	}

	@Override
	public Author updateAuthor(Author author) {
		authorDao.save(author);
		return author;
	}

	@Override
	public void deleteAuthor(long authorId) {
		Author author = authorDao.getById(authorId);
		authorDao.delete(author);
	}

}
