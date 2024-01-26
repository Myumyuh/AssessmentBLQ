package com.rakapm.perpustakaan.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rakapm.perpustakaan.dto.BookDetailDTO;
import com.rakapm.perpustakaan.service.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BookResource {
	
	private final BookService bookService;

	@GetMapping("/book/{bookId}")
	public BookDetailDTO findBookDetail(@PathVariable("bookId") Long id) {
		return bookService.findBookDetailById(id);
	}
}
