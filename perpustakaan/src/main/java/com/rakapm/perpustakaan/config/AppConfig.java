package com.rakapm.perpustakaan.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rakapm.perpustakaan.domain.Author;
import com.rakapm.perpustakaan.domain.Book;
import com.rakapm.perpustakaan.repository.BookRepository;
import com.rakapm.perpustakaan.repository.impl.BookRepositoryImpl;

@Configuration
public class AppConfig {

	@Bean
	public Author author() {
		return new Author(1L, "Raka P M", 9699L);
	}
	
	@Bean
	public Book book1(Author author) {
		Book book = new Book();
		book.setId(1L);
		book.setTitle("Bumi Manusia");
		book.setDescription("Manusia berada di bumi");
		book.setAuthor(author);
		return book;
	}
	
	@Bean
	public Book book2(Author author) {
		Book book = new Book();
		book.setId(2L);
		book.setTitle("No Man's Sky");
		book.setDescription("Manusia tidak berlayak di angkasa");
		book.setAuthor(author);
		return book;
	}
	
	@Bean
	public BookRepository bookRepository(Book book1, Book book2) {
		Map<Long,Book> bookMap = new HashMap<Long, Book>();
		bookMap.put(1L, book1);
		bookMap.put(2L, book2);
		
		BookRepositoryImpl bookRepository = new BookRepositoryImpl();
		bookRepository.setBookMap(bookMap);
		
		return bookRepository;
	}
}
