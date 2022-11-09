package com.github.antonioticelso.citiesApi.controller;

import com.github.antonioticelso.citiesApi.model.City;
import com.github.antonioticelso.citiesApi.service.CityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cities")
public class CityController {

    private final CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping
    public Page<City> cities(final Pageable page) {
        return service.findAll(page);
    }

}
