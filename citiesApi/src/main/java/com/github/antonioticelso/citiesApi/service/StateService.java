package com.github.antonioticelso.citiesApi.service;

import com.github.antonioticelso.citiesApi.model.State;
import com.github.antonioticelso.citiesApi.repository.StateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    private final StateRepository repository;

    public StateService(StateRepository repository) {
        this.repository = repository;
    }

    public List<State> findAll() {
        return repository.findAll();
    }

}
