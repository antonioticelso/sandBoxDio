package com.github.antonioticelso.citiesApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Country")
@Table(name = "pais")
public class Country implements Serializable {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;
    @Column(name = "nome_pt")
    private String portugueseName;
    @Column(name = "sigla")
    private String sigla;
    private int bacen;

}
