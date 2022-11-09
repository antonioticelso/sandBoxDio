package com.github.antonioticelso.citiesApi.controller;

import com.github.antonioticelso.citiesApi.model.State;
import com.github.antonioticelso.citiesApi.service.StateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/states")
public class StateController {

    private final StateService service;

    public StateController(StateService service) {
        this.service = service;
    }

    @GetMapping
    public List<State> states() {
        return service.findAll();
    }

}
