package com.nagarro.advanced.java.assignment5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.advanced.java.assignment5.entities.Book;

public interface BookDao extends JpaRepository<Book, Long> {

}
