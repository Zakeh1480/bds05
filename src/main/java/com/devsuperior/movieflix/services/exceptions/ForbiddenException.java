package com.devsuperior.movieflix.services.exceptions;

//Exception = tem que ser tratada, Runtime = é opcional
public class ForbiddenException extends RuntimeException {

    //Repassando o argumento para a superclasse
    public ForbiddenException(String msg) {
        super(msg);
    }
}
