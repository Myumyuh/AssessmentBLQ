package com.rakapm.perpustakaan.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9172675337640161249L;
	
	private Long id;
	private String title;
	private String description;
	private Author author;
	
}
