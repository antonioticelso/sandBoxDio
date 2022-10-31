package com.github.antonioticelso.academiaDigital.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AvaliacaoFisica {

    private Long id;
    private Aluno aluno;
    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
    private double peso;
    private double altura;

}
