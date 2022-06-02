package com.nagarro.advanced.java.assignment5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.advanced.java.assignment5.entities.Author;
import com.nagarro.advanced.java.assignment5.entities.Book;
import com.nagarro.advanced.java.assignment5.services.AuthorService;
import com.nagarro.advanced.java.assignment5.services.BookService;

@RestController
public class Controller {// seperate controller and using custom/unique names

	@Autowired
	private BookService bookServise;
	@Autowired
	private AuthorService authorService;

	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}

	// get the Books
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookServise.getBooks();
	}

	// get single Book
	@GetMapping("/books/{bookId}")
	public Book getBook(@PathVariable String bookId) {
		return this.bookServise.getBook(Long.parseLong(bookId));
	}

	// add Book
	@PostMapping(path = "/books", consumes = "application/json")
	public Book addBook(@RequestBody Book book) {// dto
		return this.bookServise.addBook(book);

	}

	// update a Book
	@PutMapping(path = "/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookServise.updateBook(book);

	}

	// delete single Book
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable String bookId) {
		try {
			this.bookServise.deleteBook(Long.parseLong(bookId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// get the Authors
	@GetMapping("/authors")
	public List<Author> getAuthors() {
		return this.authorService.getAuthors();
	}

	// get single Author
	@GetMapping("/authors/{authorsId}")
	public Author getAuthor(@PathVariable String authorId) {
		return this.authorService.getAuthor(Long.parseLong(authorId));
	}

	// add Author
	@PostMapping(path = "/authors", consumes = "application/json")
	public Author addAuthor(@RequestBody Author author) {
		return this.authorService.addAuthor(author);

	}

	// update a Author
	@PutMapping(path = "/authors")
	public Author updateAuthor(@RequestBody Author author) {
		return this.authorService.updateAuthor(author);

	}

	// delete single Author
	@DeleteMapping("/authors/{authorsId}")
	public ResponseEntity<HttpStatus> deleteAuthor(@PathVariable String authorId) {
		try {
			this.authorService.deleteAuthor(Long.parseLong(authorId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
