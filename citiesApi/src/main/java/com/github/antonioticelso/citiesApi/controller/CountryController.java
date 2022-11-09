package com.github.antonioticelso.citiesApi.controller;

import com.github.antonioticelso.citiesApi.model.Country;
import com.github.antonioticelso.citiesApi.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Country> countries() {
        return service.findAll();
    }

}
