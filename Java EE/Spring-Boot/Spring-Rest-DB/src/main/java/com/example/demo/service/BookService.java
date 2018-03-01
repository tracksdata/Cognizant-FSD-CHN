package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookDao;
   
	public List<Book> getAllBooks(){
		
		List<Book> books=new ArrayList<>();
		
		bookDao.findAll().forEach(books::add);
		
		return books;
		
	}
	
	
	
	
	
}
