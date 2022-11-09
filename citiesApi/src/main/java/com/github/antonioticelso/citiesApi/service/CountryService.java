package com.github.antonioticelso.citiesApi.service;

import com.github.antonioticelso.citiesApi.exception.CountryNotFoundException;
import com.github.antonioticelso.citiesApi.model.Country;
import com.github.antonioticelso.citiesApi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CountryService {

    private CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Page<Country> findAll( Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Country findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new CountryNotFoundException(id));
    }

}
