package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	@Query("Select c from Book c where c.title like %:title%")
	public List<Book> findByName(@Param("title") String title);
	

	
}
