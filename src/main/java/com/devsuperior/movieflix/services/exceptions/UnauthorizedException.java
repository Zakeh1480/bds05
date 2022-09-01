package com.devsuperior.movieflix.services.exceptions;

//Exception = tem que ser tratada, Runtime = é opcional
public class UnauthorizedException extends RuntimeException {

    //Repassando o argumento para a superclasse
    public UnauthorizedException(String msg) {
        super(msg);
    }
}
