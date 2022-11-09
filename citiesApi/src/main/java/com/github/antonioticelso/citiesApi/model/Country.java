package com.github.antonioticelso.citiesApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Country implements Serializable {

    @Id
    private Long id;

    private String name;
    private String name_pt;
    private String sigla;
    private int bacen;

}
