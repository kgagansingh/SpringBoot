package com.bookapp.model.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDao extends JpaRepository<Book, Integer>{
	public List<Book> findByTitle(String title);
	public Book findByAuthor(String author);
	
}