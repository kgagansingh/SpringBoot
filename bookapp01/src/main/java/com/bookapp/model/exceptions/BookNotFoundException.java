package com.bookapp.model.exceptions;

public class BookNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 7202047357477117930L;

	public BookNotFoundException(String message) {
		super(message);
	}
}