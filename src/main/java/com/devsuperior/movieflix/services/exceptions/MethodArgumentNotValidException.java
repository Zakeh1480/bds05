package com.devsuperior.movieflix.services.exceptions;

public class MethodArgumentNotValidException extends RuntimeException {

    public MethodArgumentNotValidException(String message) {
        super(message);
    }
}
