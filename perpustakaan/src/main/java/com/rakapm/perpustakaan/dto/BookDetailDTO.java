package com.rakapm.perpustakaan.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookDetailDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5208339275488819320L;
	private Long bookId;
	private String authorName;
	private String bookTitle;
	private String bookDescription;
}
