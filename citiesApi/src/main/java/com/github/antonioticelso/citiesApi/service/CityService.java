package com.github.antonioticelso.citiesApi.service;

import com.github.antonioticelso.citiesApi.model.City;
import com.github.antonioticelso.citiesApi.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityService {

    private final CityRepository repository;

    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Page<City> findAll(Pageable page) {
        return repository.findAll(page);
    }

}
