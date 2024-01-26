package com.rakapm.perpustakaan.repository;

import com.rakapm.perpustakaan.domain.Book;

public interface BookRepository {
	public Book findBookById(Long id);
}
