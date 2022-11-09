package com.github.antonioticelso.citiesApi.controller;

import com.github.antonioticelso.citiesApi.model.Country;
import com.github.antonioticelso.citiesApi.service.CountryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Country> countries(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> countriesById(@PathVariable Long id) {
        Country country = service.findById(id);
        return ResponseEntity.ok(country);
    }

}
