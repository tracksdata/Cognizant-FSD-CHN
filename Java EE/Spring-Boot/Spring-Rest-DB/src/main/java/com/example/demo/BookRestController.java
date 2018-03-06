package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookBean;
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
	
	@RequestMapping("findBooks")
	public List<Book> findByName(@RequestParam("title") String title) {
		System.out.println("--> Executed: Title: "+title);
		return bookService.findByTitle(title);
	}
	
	@PostMapping("saveBook")
	//@RequestMapping("saveBook")
	public void saveBook(@RequestBody Book book) {
		System.out.println("-- saving "+book.getTitle());
		bookService.addBook(book);
			
	}
	
	@GetMapping("findBook/{id}")
	public BookBean findBook(@PathVariable("id") int id) {
		System.out.println("--- Finding Book id "+id);
		BookBean book=bookService.findBook(id);
		return book;
	}
	
	@PutMapping("updateBook/{id}")
	public void updateBook(@PathVariable("id") int id,@RequestBody Book book) {
		System.out.println("-- in Controller: Updating id "+id+" for new title "+book.getTitle());
		bookService.updateBook(id,book);
		
	}
	
	@DeleteMapping("deleteBook/{id}")
	public void delete(@PathVariable("id") int id) {
		System.out.println("-- DeleteController: "+id);
		bookService.deleteBook(id);
	}
	
	
	
	
	

}
