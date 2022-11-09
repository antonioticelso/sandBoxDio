package com.github.antonioticelso.citiesApi.repository;

import com.github.antonioticelso.citiesApi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
