package com.rakapm.perpustakaan.repository.impl;

import java.util.Map;

import com.rakapm.perpustakaan.domain.Book;
import com.rakapm.perpustakaan.repository.BookRepository;

import lombok.Data;

@Data
public class BookRepositoryImpl implements BookRepository{

	private Map<Long, Book> bookMap;
	
	@Override
	public Book findBookById(Long id) {
		Book book = bookMap.get(id);
		return book;
	}
	
}
