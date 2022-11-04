package com.github.antonioticelso.salaReuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

    private static final long servialVersionUID = 1l;

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
