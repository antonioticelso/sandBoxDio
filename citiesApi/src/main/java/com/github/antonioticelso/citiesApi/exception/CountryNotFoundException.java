package com.github.antonioticelso.citiesApi.exception;

public class CountryNotFoundException extends RuntimeException {

    public CountryNotFoundException(Long id) {
        super("Country not found with id: " + id);
    }

}
