package com.rakapm.perpustakaan.service.impl;

import org.springframework.stereotype.Service;

import com.rakapm.perpustakaan.domain.Book;
import com.rakapm.perpustakaan.dto.BookDetailDTO;
import com.rakapm.perpustakaan.repository.BookRepository;
import com.rakapm.perpustakaan.service.BookService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service("bookService")
public class BookServiceImpl implements BookService {
	private final BookRepository bookRepository;
	
	@Override
	public BookDetailDTO findBookDetailById(Long bookId) {
		Book book = bookRepository.findBookById(bookId);
		BookDetailDTO dto = new BookDetailDTO();
		dto.setBookId(book.getId());
		dto.setAuthorName(book.getAuthor().getName());
		dto.setBookTitle(book.getTitle());
		dto.setBookDescription(book.getDescription());
		return dto;
	}
}
