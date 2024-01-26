package com.rakapm.perpustakaan.service;

import com.rakapm.perpustakaan.dto.BookDetailDTO;

public interface BookService {

	public BookDetailDTO findBookDetailById(Long bookId);
}
