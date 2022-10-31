package com.github.antonioticelso.academiaDigital.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Aluno {

    private Long id;
    private String name;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
    private List<AvaliacaoFisica> avaliacao = new ArrayList<>();

}
