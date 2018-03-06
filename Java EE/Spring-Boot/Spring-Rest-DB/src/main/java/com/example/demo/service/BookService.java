package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookBean;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookDao;
	
   
	public List<Book> getAllBooks(){
		
		List<Book> books=new ArrayList<>();
		
		bookDao.findAll().forEach(books::add);
		//bookDao.
		return books;	
	}
	
	public List<Book> findByTitle(String title){
		List<Book> books=new ArrayList<>();
		bookDao.findByName(title).forEach(books::add);
		return books;	
	}
	
	public void addBook(Book book) {
		bookDao.save(book);
	}
	
	public BookBean findBook(int id) {
		Book book=bookDao.getOne(id);
		BookBean bb=new BookBean();
		bb.setId(book.getId());
		bb.setTitle(book.getTitle());
		bb.setAuthor(book.getAuthor());
		return  bb;
	}
	
	public void updateBook(int id,Book book) {
		if(bookDao.exists(id))
		 bookDao.save(book);
		System.out.println("-- Update DAO: "+id);
	}
	
	public void deleteBook(int id) {
		bookDao.delete(id);
		System.out.println("-- DeleteDao: Book Id "+id+" deleted ");
	}
	
	
	
	
	
}
