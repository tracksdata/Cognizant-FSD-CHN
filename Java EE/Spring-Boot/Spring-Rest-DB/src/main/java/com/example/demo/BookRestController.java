package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
@CrossOrigin()
@RestController
@ComponentScan("com.example.demo.repository,com.example.demo.service")
public class BookRestController {

	@Autowired
	private BookService bookService;

	@RequestMapping("getBooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

}
