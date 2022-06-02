package com.nagarro.advanced.java.assignment5.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.advanced.java.assignment5.dao.BookDao;
import com.nagarro.advanced.java.assignment5.entities.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	//List<Book> list;

	public BookServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Book(145, "Java Core Book", "This Book cotains basics of Java"));
//		list.add(new Book(4343, "Spring Boot Book", "Creating REST API using Spring Boot"));
	}

	@Override
	public List<Book> getBooks() {
		return bookDao.findAll();
	}

	@Override
	public Book getBook(long BookId) {

//		Book Book = null;
//
//		for (Book c : list) {
//			Book = c;
//		}
		//Book b = bookDao.getOne(BookId); then to return first convert it to bookdto and then return the dto

		return bookDao.getOne(BookId);
	}

	@Override
	public Book addBook(Book Book) {//receive bookdto rather than book
		//list.add(Book);
		//first convert bookdto to book
		bookDao.save(Book);
		
		return Book;
	}

	@Override
	public Book updateBook(Book Book) {

//		list.forEach(e -> {
//			if (e.getId() == Book.getId()) {
//				e.setTitle(Book.getTitle());
//				e.setDescription(Book.getDescription());
//			}
//		});
		bookDao.save(Book);
		return Book;
	}

	/*
	 * public void BookToBookDto(Book Book, BookDto BookDto) {
	 * Book.setId(BookDto.getId()); Book.setTitle(BookDto.getTitle());
	 * Book.setDescription(BookDto.getDescription()); }
	 */

	@Override
	public void deleteBook(long parseLong) {
		//list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		Book book = bookDao.getOne(parseLong);
		bookDao.delete(book);

	}

}
